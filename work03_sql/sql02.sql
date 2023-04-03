-- IN ������
-- ���� ���� �� �߿� ��� �ϳ��� ��ġ�ϴ����� ��
-- �����ȣ�� 7369�̰ų� 7521�̰ų� 7782���� ����� �˻�
--STEP1. 
SELECT empno, ename, job FROM emp WHERE empno = 7369;
SELECT empno, ename, job FROM emp WHERE empno = 7521;
SELECT empno, ename, job FROM emp WHERE empno = 7782;

--STEP2.
SELECT empno, ename, job 
FROM emp 
WHERE empno = 7369 or empno = 7521 or empno = 7782;

--STEP3.
SELECT empno, ename, job 
FROM emp 
WHERE empno IN (7369,7521,7782);

-- �����ȣ�� 7369�� �ƴϰ� 7521�� �ƴϰ� 7782���� �ƴ� ����� �˻�
SELECT empno, ename, job
FROM emp
WHERE empno != 7369 AND empno != 7521 AND empno != 7782;

SELECT empno, ename, job 
FROM emp 
WHERE empno NOT IN (7369,7521,7782);

SELECT SUBSTR('HelloWorld', 6) FROM dual;
SELECT SUBSTR('HelloWorld', 6,3) FROM dual;

SELECT SUBSTR(hiredate, 1,2)
FROM emp
WHERE deptno = 10;

--��� �̸��� N���� ������ ����� �˻�
 SELECT ename
 FROM emp
 WHERE SUBSTR(ename,-1,1) = 'N';
 
 --PAD
 SELECT  LPAD('abc', 6, '*') FROM dual;
SELECT  RPAD('abc', 6, '*') FROM dual;
  
-- TRIM
SELECT RTRIM('     James GOsling       ') FROM dual;
SELECT LTRIM('     James GOsling       ') FROM dual;
SELECT TRIM('     James GOsling       ') FROM dual;

--REPLACE
SELECT REPLACE('     James G O s l  ing       ', ' ','') FROM dual;

-- ROUND
SELECT ROUND(45.923, 2) FROM dual;   -- 45.92
SELECT ROUND(45.923, 0) FROM dual;   --46
SELECT ROUND(45.923, -1) FROM dual;  --50

-- FLOOR
SELECT FLOOR(45.923) FROM dual;  --50

-- TRUNK
SELECT TRUNC(45.923, 2) FROM dual;  --45.92

-- CEIL
SELECT CEIL(45.923) FROM dual;   --46

SELECT SYSDATE+1 "TOMORROW" FROM dual;
SELECT SYSDATE+-1 "YESTERDAY" FROM dual;
SELECT SYSDATE+100 "�츮������100��°" FROM dual;
SELECT SYSDATE-TO_DATE('97/05/05') "��ƿ��ϼ�" FROM dual;

SELECT ADD_MONTHS(SYSDATE, 4) FROM dual;
SELECT  MONTHS_BETWEEN(SYSDATE,TO_DATE('2000/12/08')) "��ƿ´޼�" FROM dual;

SELECT ename, hiredate, MONTH_BETWEEN(SYSDATE, TO_DATE(hiredate))
FROM emp;

SELECT * FROM emp;

SELECT ename, (SYSDATE-hiredate)/7 "��ƿ��ּ�"
FROM emp;

SELECT FLOOR((SYSDATE-TO_DATE('97/05/05'))/7) "��ƿ��ּ�"
FROM dual;
