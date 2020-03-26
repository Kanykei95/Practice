select * from countries;

Describe countries;
describe departments;

desc job_history;

select first_name, last_name from employees;

select email from employees;

SELECT country_id, country_name FROM countries;

SELECT first_name, job_id FROM employees;

SELECT first_name, job_id FROM employees ORDER BY first_name;

SELECT first_name, job_id FROM employees ORDER BY first_name desc;

SELECT * FROM employees ORDER BY email;

SELECT first_name, job_id, salary FROM employees ORDER BY 3;
-- This orders the 3rd column which in this case is salary.

SELECT first_name, job_id, salary/160 FROM employees ORDER BY 3;

SELECT first_name, job_id, salary * 12 FROM employees ORDER BY 3 DESC

SELECT first_name, job_id, salary * 12,salary / 160 FROM employees ORDER BY 3 DESC;

SELECT job_id AS "kana" FROM employees;
