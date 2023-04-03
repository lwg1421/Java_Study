SELECT * FROM emp;
--1) 직원 정보 중 사원번호, 이름, 급여를 출력한다. 단, 이름은 앞에서 3글자씩만 출력하라.
SELECT empno, SUBSTR(ename,1,3) 이름, sal
FROM emp;

--2) 이름의 글자수가 6자 이상인 사람의 이름을 앞에서 3자만 구하여 소문자로 이름만을
--출력하라.
SELECT SUBSTR(ename,1,3)
FROM emp
WHERE LENGTH(ename) >= 6;

--3) 직원정보를 입력하던 중 아래와 같이 입력 되었다.(이름에 공백이 입력됨)
insert into emp values(8001, ' PARK ' , 'IT' , 7521 , '21/11/10', 20000,1000,10);
select * from emp;
--이름이 'PARK'인 직원의 정보를 출력하여 보자.
select * from emp where ename='PARK';
--이름 좌우에 공백이 있더라도 공백을 제거하고 이름이 'PARK'인 직원의 정보를 출력하라.
SELECT TRIM(ename)
FROM emp
WHERE ename LIKE '%PARK%';

--4) 급여가 $1,500부터 $3,000 사이의 사람은 급여의 15%를 회비로 지불하기로 하였다.
--이를 이름, 급여, 회비(소수점 두 자리 아래에서 반올림)를 출력하라.
SELECT ename, sal, ROUND((sal*0.15),1) "회비"
FROM emp
WHERE sal BETWEEN 1500 AND 3000;

--5) 급여가 $2,000 이상인 모든 사람은 급여의 5%를 경조비로 내기 로 하였다.
--이름, 급여, 경조비(소수점 이하 절삭)를 출력하라
SELECT ename, sal, (sal*0.05) "경조비"
FROM emp
WHERE sal >= 2000;


--6) 입사일로부터 100일이 지난 후를 구해보자. 사원이름, 입사일, 100일 후의 날, 급여를
--출력하라.
SELECT ename, hiredate, (hiredate+100) "100일 후의 날", sal
FROM emp;

--7) 입사일로부터 6개월이 지난 후의 날짜를 구하려고 한다.
--입사일, 6개월 후의 날짜, 급여를 출력하라
SELECT hiredate, ADD_MONTHS(hiredate,6) "6개월 후의 날짜", sal
FROM emp;

--8) 입사한 달의 근무일수를 계산하여 부서번호, 이름, 근무일수를 출력하라.
SELECT deptno, ename, LAST_DAY(hiredate) - hiredate
FROM emp;

--9) 모든 사원의 입사일 기준으로 100일이 지난 후의 월요일의 날짜를 구해서 사원 이름,
--입사일 , ’MONDAY’를 출력하라.
SELECT ename, hiredate, NEXT_DAY(hiredate+100,'월요일') "MONDAY"
FROM emp;

--10) 직원의 이름, 업무, 근속년수를 구하여 출력하라.
SELECT ename, job,TRUNC((SYSDATE-hiredate)/365)
FROM emp;

--11) 모든 직원의 이름과 입사일을 ‘1996-05-14’의 형태로 출력 하라.
SELECT ename, TO_CHAR(hiredate,'YYYY-MM-DD')
FROM emp;

--12) 모든 직원의 번호, 이름, 급여를 출력하라. 단, 급여 앞에 화폐표시($), 그리고
--단위(,)표시, 소수점 이하 2자리가 표시되도록 하라.
SELECT empno, ename, TO_CHAR(ROUND(sal,2),'$999,999')
FROM emp;

--13) 모든 직원의 이름과 입사한 요일을 출력하라.
SELECT ename, to_char(hiredate,'DAY') 입사요일 
FROM emp;

SELECT COUNT(*) FROM emp;

SELECT COUNT(empno) FROM emp;

SELECT COUNT(-1) FROM emp;

SELECT ROUND(AVG(sal)), SUM(sal), MIN(sal), MAX(sal)
FROM emp;

-- 가장 오래된 사원의 입사일
SELECT MIN(hiredate) 
FROM emp;

SELECT 3500*1.3
FROM dual;

-- 부서번호가 10 또는 20인 사원 수 조회
SELECT COUNT(empno)
FROM emp
WHERE deptno in (10,20);

-- 모든 사원의 보너스 평균
--step1
SELECT ROUND(AVG(comm)) "보너스평균"
FROM emp;
--step2
SELECT ROUND(AVG(NVL(comm,0))) "보너평균" FROM emp;


SELECT COUNt(DISTINCT(deptno)) 부서개수 FROM emp;

--그룹함수에 적용되지 않은 컬럼이 (deptno)
--SELECT 절에 나열된다면
--반드시 GROUP BY절 뒤에 deptno컬럼을 명시해야 한다.
--step1
SELECT deptno DNumber, ROUND(AVG(sal))
FROM emp
GROUP BY deptno;

--step2
SELECT deptno DNumber, ROUND(AVG(sal))
FROM emp
GROUP BY deptno
ORDER BY DNumber;

--step3
SELECT deptno DNumber, ROUND(AVG(sal))
FROM emp
GROUP BY deptno
ORDER BY DNumber;

SELECT EXTRACT(YEAR FROM hiredate) as YEAR FROM emp;
SELECT EXTRACT(YEAR FROM hiredate) as YEAR FROM emp;

SELECT deptno, ROUND(AVG(sal)) AvgSalary
FROM emp
GROUP BY deptno
HAVING ROUND(AVG(sal)) >= 2000;



