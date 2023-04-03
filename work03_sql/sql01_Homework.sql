SELECT * FROM emp;

--1) 30�� �μ� ������ ���(�Ҽ�2�ڸ� �Ʒ� �ø�), �ְ�, ����, �ο����� ���Ͽ� ����϶�.
SELECT ROUND(AVG(sal),2)"�������", MAX(SAL)"�ְ�", MIN(sal)"����", count(empno)"�ο���"
FROM emp
WHERE deptno = 30;

--2) �� �μ��� �޿��� ���(�Ҽ� ���� �ݿø�), �ְ�, ����, �ο����� ���Ͽ� ����϶�.
SELECT deptno"�μ���ȣ",ROUND(AVG(sal))"�޿����", MAX(SAL)"�ְ�", MIN(sal)"����", count(empno)"�ο���"
FROM emp
GROUP BY deptno
ORDER BY deptno;

--3) �� �μ��� ���� ������ �ϴ� ����� �ο����� ���Ͽ� �μ���ȣ,������, �ο�����
--����϶�.
SELECT deptno"�μ���ȣ", job"������", COUNT(empno)"�ο���"
FROM emp
GROUP BY(deptno, job)
ORDER BY 1;

--4) ���� ������ �ϴ� ����� ���� 2�� �̻��� ������ �ο����� ����϶�.
SELECT job, COUNT(empno)"�ο���"
FROM emp
GROUP BY job
HAVING COUNT(empno) >=2 ;

--5) �� �μ��� ��� ����(�Ҽ� ���� ����), ��ü ����, �ְ� ����, ���� ������ ���Ͽ� ���
--������ ���� ������ ����϶�.
SELECT deptno, ROUND(AVG(sal))"��տ���", SUM(sal)"��ü����", MAX(sal)"�ְ����", MIN(sal)"��������"
FROM emp
GROUP BY deptno
ORDER BY 1;

--6) �� �μ��� ���� ������ �ϴ� ����� �޿��� �հ踦 ���Ͽ� �μ���ȣ,������ �� �޿���
--�Ұ�� ������ ����϶�. �μ��� �����Ѵ�.
SELECT deptno, job, SUM(sal) "����"
FROM emp
GROUP BY ROLLUP(deptno, job)
ORDER BY deptno;

--7) �� �μ��� �ο����� ��ȸ�ϵ� �ο����� 5�� �̻��� �μ��� ��µǵ��� �Ͻÿ�.
SELECT deptno, COUNT(empno) "�ο���"
FROM emp
GROUP BY deptno
HAVING COUNT(empno) >= 5
ORDER BY deptno;

--8) �� �μ��� �ִ�޿��� �ּұ޿��� ��ȸ�Ͻÿ�.
--��, �ִ�޿��� �ּұ޿��� ���� �μ��� ������ �Ѹ��� ���ɼ��� ���� ������
--��ȸ������� ���ܽ�Ų��.
SELECT deptno, MIN(sal) "�ּұ޿�", MAX(sal) "�ִ�޿�"
FROM emp
GROUP BY deptno
HAVING COUNT(empno)>1
ORDER BY deptno;


--9) �μ��� 10, 20, 30 ���� ������ �߿��� �޿��� 2500 �̻� 5000 ���ϸ� �޴�
--�������� ������� �μ��� ��� �޿��� ��ȸ�Ͻÿ�.
--��, ��ձ޿��� 2000 �̻��� �μ��� ��µǾ�� �ϸ�, ��°���� ��ձ޿��� ����
--�μ� ���� ��µǵ��� �ؾ� �Ѵ�.
SELECT deptno, AVG(sal)"��ձ޿�"
FROM (SELECT * FROM emp WHERE deptno in (10,20,30) and sal BETWEEN 2500 and 5000)
GROUP BY deptno
HAVING AVG(sal)>2000
ORDER BY AVG(sal) DESC;
