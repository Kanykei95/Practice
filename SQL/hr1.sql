select first_name, last_name from employees;

--Task: Print name and salary job_id from employees table

select first_name, salary, job_id from employees;

-- Print  all the column

select * from employees;

-- ORDER BY --> ordering the result of query

select first_name, last_name from employees order by first_name; 

-- Task: print last name phone, job title and salary by order of salary.

select last_name, phone_number, job_id, salary from employees order by salary;

--Task: print emp id last name phone, job title salary by order of salary desc -> descending order

select employee_id, last_name, phone_number, job_id, salary from employees order by salary desc;

-- TO get unique value from column => distinct

select distinct job_id from employees;

--Task print only unique names
select distinct first_name from employees; -- non duplicate, non repeated

-- Task print only unique salary

select distinct salary from employees;

-- concatenation in Java "+"
--in sql => ||

-- Print combination of first name and last name => select col1 || cal2 from table emp;
select first_name || ' ' || last_name as full_Name from employees;      -- concatenating first/lastName as full_Name we gave ourself

-- Task create email for every emp using first and last name and 'gmail.com' and name the column 'email'
select first_name || last_name || '@gmail.com' as email from employees;

-- Arithmetic expression
-- +, -, *, /

select first_name, salary/6 from employees;

-- Print first and last name, salary by asc order, salary it should be hourly, in 1 week, 40 hrs, 1 month week*4
select first_name, last_name, salary/160 from employees order by salary desc; -- by default its ascending (smallest to biggest)
                                                                            -- if desc (largest to smallest)
-- int Java we have if/else statements           
-- in SQL we have "WHERE" keyoword condition

-- where salary is more than 40;
select first_name, last_name, salary/160 from employees where salary/160 > 40;

-- print a persons first and last name, job title who workds as a IT programmer

select first_name, last_name, job_id from employees where job_id = 'IT_PROG';

-- select, from, where, AS, ORDER BY, desc, asc, *, distinct, ||

-- AND, OR, NOT, IN, BETWEEN,

-- Task: Print a persons first and last name, job title who works as a IT programmer and sale manager(SA_MAN)

select first_name, last_name, job_id from employees where job_id = 'IT_PROG' OR job_id = 'SA_MAN';

-- Print persons first and last name, and salary who get more than 30 per hour and less than 40 per hour

select first_name, last_name , salary/160 from emploeyees where salary/160 <40 AND salary/160 > 30; -- 160 because its how many hours a person is working monthly since 40 hours pers week a person works.



