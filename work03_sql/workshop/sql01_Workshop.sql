SELECT * 
FROM emp;

--1) EMP ���̺� ������ ������ Ȯ���ϴ� SQL�� �ۼ� �ϼ���.
DESC emp;

--2) �̸��� K�� �����ϴ� ����� �����ȣ, �̸�, �Ի���, �޿��� �˻��ϼ���.
SELECT empno, ename, hiredate, sal
FROM emp
WHERE ename LIKE 'K%';

--3) �Ի����� 80�⵵�� ����� ��� ������ �˻��ϼ���.
SELECT * 
FROM emp
WHERE hiredate LIKE '80%';

--4) Ŀ�̼��� NULL�� �ƴ� ����� ��� ������ �˻��ϼ���.
SELECT * 
FROM emp
WHERE comm is not NULL;

--5) �μ��� 30�� �μ��̰� �޿��� $1,500 �̻��� ����� �̸�, �μ� ,������ �˻��ϼ���.
SELECT ename, deptno, sal
FROM emp
WHERE (deptno = 30)  and (sal >= 1500);

--6) �μ���ȣ�� 30�� ��� �� �����ȣ SORT�Ͽ� ��µǵ��� �˻��ϼ���.
SELECT*
FROM emp
WHERE deptno = 30
ORDER BY empno;

--7) �޿��� ���� ������ SORT�Ͽ� ��µǵ��� �˻��ϼ���.
SELECT *
FROM emp
ORDER BY sal DESC;


--8) �μ���ȣ�� ASCENDING SORT�� �� �޿��� ���� ��� ������ �˻��ϼ���.
SELECT * 
FROM emp
ORDER BY deptNO ,sal DESC;

--9) �μ���ȣ�� DESCENDING SORT�ϰ�, �̸� ������ ASCENDING SORT,
--�޿� ������ DESCENDING SORT �Ͽ� ��µǵ��� �˻��ϼ���.
SELECT *
FROM emp
ORDER BY deptno DESC, ename, sal DESC;

--10) EMP Table���� �̸�, �޿�, Ŀ�̼� �ݾ�, �Ѿ�(�޿�+Ŀ�̼Ǳݾ�)��
--���Ͽ� �Ѿ��� ���� ������ �˻��ϼ���. ��, Ŀ�̼��� NULL��
--����� �����Ѵ�.(Ŀ�̼Ǳݾ�: sal*comm/100)
--�Ѿ��� ��Ī�� Total�� �Ѵ�.
SELECT ename, sal, comm, (sal+comm) "�Ѿ�"
FROM emp
where comm is not NULL
ORDER BY �Ѿ� DESC;


--11) 10�� �μ��� ��� ����鿡�� �޿��� 13%�� ���ʽ��� �����ϱ��
--�Ͽ���. �̸�, �޿�, ���ʽ� �ݾ�, �μ���ȣ�� �˻��ϼ���.
SELECT ename, sal, (sal * 0.13) "���ʽ��ݾ�", deptno
FROM emp;


--12) �μ���ȣ�� 20�� ����� �ð��� �ӱ��� ����Ͽ� �˻��ϼ���.
--��, 1���� �ٹ��ϼ��� 12���̰�, 1�� �ٹ��ð��� 5�ð��̴�.
--��¾���� �̸�, �޿�, �ð��� �ӱ�(�Ҽ��� ���� ù ��° �ڸ����� �ݿø�)�� �˻��ϼ���.
SELECT ename, sal, ROUND(sal/60)"�ð����ӱ�"
FROM emp
WHERE deptno = 20;

--13) �޿��� $1,500���� $3,000 ������ ����� �޿��� 15%�� ȸ��� �����ϱ�� �Ͽ���.
--�̸� �̸�, �޿�, ȸ��(�Ҽ��� ���ڸ� �Ʒ����� �ݿø�)�� �˻��ϼ���.
SELECT ename, sal, ROUND(sal*0.15,1) "ȸ��" 
FROM (SELECT ename, sal, ROUND(1,sal*0.15) "ȸ��"  FROM emp WHERE sal between 1500 and 3000);


--14) ��� ����� �� ���ɾ��� ����Ͽ� �˻��ϼ���.. ��, �޿��� ���� ������ �̸�, �޿�, ��
--���ɾ��� �˻��ϼ���..(�� ���ɾ��� �޿��� ���� 10%�� ������ �� �ݾ�)
SELECT ename, sal, (sal * 0.9) �Ǽ��ɾ�
FROM emp
ORDER BY sal DESC; 
