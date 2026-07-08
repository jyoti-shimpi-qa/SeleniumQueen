SELECT*FROM employees;
SELECT name, salary FROM employees WHERE salary>50000;
SELECT department, COUNT(*) FROM employees GROUP BY department;