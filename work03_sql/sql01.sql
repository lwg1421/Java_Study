-- 테이블의 구조를 확인
DESC emp;

-- Projection :: 디스플레이 하고자 하는 컬럼만 표시
SELECT * FROM emp;

-- emp 테이블에서 사원의 이름, 급여, 업무, 부서번호를 검색
SELECT ENAME, SAL,JOB,DEPTNO FROM emp;


-- SELECTION : 조건을 부여해서 행을 제한한다.
--10번 부서에서 근무하는 사원의 이름, 급여, 입사년도를 검색
SELECT ename, sal, hiredate
from emp
where deptno = 10
ORDER BY sal;

select empno, ename, job, deptno 부서번호
from emp
WHERE job = 'SALESMAN'
ORDER BY 4; 

select empno, ename, job, deptno 부서번호
from emp
WHERE 부서번호 = 20
ORDER BY 4; 

SELECT *
FROM emp
ORDER BY hiredate;


SELECT ename, job, sal
FROM emp 
ORDER BY sal DESC;

SELECT ename, job, sal
FROM (SELECT * FROM emp ORDER BY sal DESC)
where rownum <= 3;

SELECT ename, job,sal*2+20 "인상급여"
FROM emp
ORDER BY 인상급여 DESC;

SELECT ename, job, sal*0.9 "실수령"
FROM emp;

SELECT ename, job, sal, sal * 12 + comm AnnualSalary
FROM emp
WHERE comm is not null;

SELECT ename, job, sal, sal * 12 + comm AnnualSalary
FROM emp
ORDER By annualsalary;

SELECT ename, job, comm
FROM emp
ORDER BY comm;

SELECT DISTINCT deptno FROM emp ORDER BY deptno;

SELECT deptno from dept d
WHERE EXISTS(SELECT * FROM emp e where d.deptno = e.deptno);

SELECT ename, job
FROM emp 
WHERE ename LIKE 'S%';

SELECT ename, job
FROM emp 
WHERE ename LIKE '%S%';

