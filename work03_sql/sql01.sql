-- ���̺��� ������ Ȯ��
DESC emp;

-- Projection :: ���÷��� �ϰ��� �ϴ� �÷��� ǥ��
SELECT * FROM emp;

-- emp ���̺��� ����� �̸�, �޿�, ����, �μ���ȣ�� �˻�
SELECT ENAME, SAL,JOB,DEPTNO FROM emp;


-- SELECTION : ������ �ο��ؼ� ���� �����Ѵ�.
--10�� �μ����� �ٹ��ϴ� ����� �̸�, �޿�, �Ի�⵵�� �˻�
SELECT ename, sal, hiredate
from emp
where deptno = 10
ORDER BY sal;

select empno, ename, job, deptno �μ���ȣ
from emp
WHERE job = 'SALESMAN'
ORDER BY 4; 

select empno, ename, job, deptno �μ���ȣ
from emp
WHERE �μ���ȣ = 20
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

SELECT ename, job,sal*2+20 "�λ�޿�"
FROM emp
ORDER BY �λ�޿� DESC;

SELECT ename, job, sal*0.9 "�Ǽ���"
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

