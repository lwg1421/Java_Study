SELECT * FROM emp;
--1) ���� ���� �� �����ȣ, �̸�, �޿��� ����Ѵ�. ��, �̸��� �տ��� 3���ھ��� ����϶�.
SELECT empno, SUBSTR(ename,1,3) �̸�, sal
FROM emp;

--2) �̸��� ���ڼ��� 6�� �̻��� ����� �̸��� �տ��� 3�ڸ� ���Ͽ� �ҹ��ڷ� �̸�����
--����϶�.
SELECT SUBSTR(ename,1,3)
FROM emp
WHERE LENGTH(ename) >= 6;

--3) ���������� �Է��ϴ� �� �Ʒ��� ���� �Է� �Ǿ���.(�̸��� ������ �Էµ�)
insert into emp values(8001, ' PARK ' , 'IT' , 7521 , '21/11/10', 20000,1000,10);
select * from emp;
--�̸��� 'PARK'�� ������ ������ ����Ͽ� ����.
select * from emp where ename='PARK';
--�̸� �¿쿡 ������ �ִ��� ������ �����ϰ� �̸��� 'PARK'�� ������ ������ ����϶�.
SELECT TRIM(ename)
FROM emp
WHERE ename LIKE '%PARK%';

--4) �޿��� $1,500���� $3,000 ������ ����� �޿��� 15%�� ȸ��� �����ϱ�� �Ͽ���.
--�̸� �̸�, �޿�, ȸ��(�Ҽ��� �� �ڸ� �Ʒ����� �ݿø�)�� ����϶�.
SELECT ename, sal, ROUND((sal*0.15),1) "ȸ��"
FROM emp
WHERE sal BETWEEN 1500 AND 3000;

--5) �޿��� $2,000 �̻��� ��� ����� �޿��� 5%�� ������� ���� �� �Ͽ���.
--�̸�, �޿�, ������(�Ҽ��� ���� ����)�� ����϶�
SELECT ename, sal, (sal*0.05) "������"
FROM emp
WHERE sal >= 2000;


--6) �Ի��Ϸκ��� 100���� ���� �ĸ� ���غ���. ����̸�, �Ի���, 100�� ���� ��, �޿���
--����϶�.
SELECT ename, hiredate, (hiredate+100) "100�� ���� ��", sal
FROM emp;

--7) �Ի��Ϸκ��� 6������ ���� ���� ��¥�� ���Ϸ��� �Ѵ�.
--�Ի���, 6���� ���� ��¥, �޿��� ����϶�
SELECT hiredate, ADD_MONTHS(hiredate,6) "6���� ���� ��¥", sal
FROM emp;

--8) �Ի��� ���� �ٹ��ϼ��� ����Ͽ� �μ���ȣ, �̸�, �ٹ��ϼ��� ����϶�.
SELECT deptno, ename, LAST_DAY(hiredate) - hiredate
FROM emp;

--9) ��� ����� �Ի��� �������� 100���� ���� ���� �������� ��¥�� ���ؼ� ��� �̸�,
--�Ի��� , ��MONDAY���� ����϶�.
SELECT ename, hiredate, NEXT_DAY(hiredate+100,'������') "MONDAY"
FROM emp;

--10) ������ �̸�, ����, �ټӳ���� ���Ͽ� ����϶�.
SELECT ename, job,TRUNC((SYSDATE-hiredate)/365)
FROM emp;

--11) ��� ������ �̸��� �Ի����� ��1996-05-14���� ���·� ��� �϶�.
SELECT ename, TO_CHAR(hiredate,'YYYY-MM-DD')
FROM emp;

--12) ��� ������ ��ȣ, �̸�, �޿��� ����϶�. ��, �޿� �տ� ȭ��ǥ��($), �׸���
--����(,)ǥ��, �Ҽ��� ���� 2�ڸ��� ǥ�õǵ��� �϶�.
SELECT empno, ename, TO_CHAR(ROUND(sal,2),'$999,999')
FROM emp;

--13) ��� ������ �̸��� �Ի��� ������ ����϶�.
SELECT ename, to_char(hiredate,'DAY') �Ի���� 
FROM emp;

SELECT COUNT(*) FROM emp;

SELECT COUNT(empno) FROM emp;

SELECT COUNT(-1) FROM emp;

SELECT ROUND(AVG(sal)), SUM(sal), MIN(sal), MAX(sal)
FROM emp;

-- ���� ������ ����� �Ի���
SELECT MIN(hiredate) 
FROM emp;

SELECT 3500*1.3
FROM dual;

-- �μ���ȣ�� 10 �Ǵ� 20�� ��� �� ��ȸ
SELECT COUNT(empno)
FROM emp
WHERE deptno in (10,20);

-- ��� ����� ���ʽ� ���
--step1
SELECT ROUND(AVG(comm)) "���ʽ����"
FROM emp;
--step2
SELECT ROUND(AVG(NVL(comm,0))) "�������" FROM emp;


SELECT COUNt(DISTINCT(deptno)) �μ����� FROM emp;

--�׷��Լ��� ������� ���� �÷��� (deptno)
--SELECT ���� �����ȴٸ�
--�ݵ�� GROUP BY�� �ڿ� deptno�÷��� ����ؾ� �Ѵ�.
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



