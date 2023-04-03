--����
--�ϳ� �̻�(Self Join)�� ���̺��� ���Ǹ� ������ ��� �Ϲ����� ��� FK�� ���ؼ� ���� ������ �����ȴ�.
--EQUI Join, Self Join, Outer Join�� �ֿ��ϰ� ���캸��.

SELECT empno, ename, sal, job FROM emp; -- �ش� ����� ������ �˰� ���� ��
SELECT deptno, dname, loc FROM dept;  --�ش� �μ��� ������ �˰� ���� ��
SELECT * FROM emp, dept;

--Cartesian Product (ī�׽þ� ��)
--emp, dept ���̺��� ���������� ����
--14 X 4 = 56�� ����
1) ���� ������ �������� ��
2) ���� ������ �߸� ���� ��

-- STEP1
SELECT * FROM emp, dept
WHERE emp.deptno = dept.deptno;

--STEP2 ���̺� Alias ���
SELECT * FROM emp e, dept d
WHERE e.deptno = d.deptno;

--STEP3 Projection
SELECT empno, ename, sal, deptno ,dname, loc FROM emp e, dept d
WHERE e.deptno = d.deptno;

--STEP4. Projection
SELECT e.empno, e.ename, e.sal, e.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno;

--STEP5 Equi Join AND Non Join ����
SELECT e.empno, e.ename, e.sal, e.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND
d.deptno = 10;

--Self Join
--�ϳ��� ���̺��� ��ü������ ������
-- Ư�� ����� ����� �̸��� ��ȸ
--1. ���� Ư���� ����� ename�� ��ȸ
--2. ename�� �ش��ϴ� mgr ��ȣ�� ã�´�.
--3.  �� emp ���̺��� empno�� mgr�� ����� ã�Ƽ� ename�� ã�´�.

--STEP1 
SELECT ename, mgr FROM emp; -- BLAKE ����� ����ȣ�� ã��
SELECT empno, ename FROM emp; -- ����ȣ�� ��ġ�ϴ� �����ȣ�� ã�� �׿� �ش��ϴ� ��� �̸��� ã�´�.

--STEP2
SELECT * FROM(SELECT ename, mgr FROM emp) e,
(SELECT empno,ename FROM emp)m
WHERE e.mgr = m.empno;

--STEP4. ���� ���� �߰�
SELECT e.ename ����̸�, m.ename ����̸�
FROM emp e, emp m
WHERE e.mgr = m.empno;

--STEP5 ���� ���� �߰�
SELECT e.ename ����̸�, m.ename ����̸�
FROM emp e, emp m
WHERE e.mgr = m.empno
AND e.ename = 'BLAKE';

--RIGHT OUTER JOIN
SELECT e.empno, e.ename, e.job, e.deptno e_deptno, 
d.deptno d_deptno, d.dname
FROM dept d, emp e
WHERE d.deptno = e.deptno(+);

SELECT e.empno, e.ename, e.job, e.deptno e_deptno, 
d.deptno d_deptno, d.dname
FROM emp e right join dept d
ON d.deptno = e.deptno;

SELECT e.ename, e.sal, e.deptno, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno
AND e.sal > 2000;