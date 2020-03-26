-- joins'

    --> Inner join => prints the data that has in both tables
        -- select t1.clo1, t2.col1 from t1 join t2 ON t1.foreighkey = t2..primaryKey;
        
        -- select students.first_name, students.last_name, course.course_name Fr
        
    --display first and last name and department name from emp and department table.
    
    select department_name from departments;
    select * from departments;
    
    --display first and last name and department name from emp and department table.
    select employees.first_name, employees.last_name, departments.department_name from employees inner join departments on employees.department_id = departments.department_id;
    
    -------------------------------------------------------------------------------------------------------------------------
    
    
    --02/29/2020
-- GROUP BY -> Creating sub-group in group functions
select salary, count(*) from employees group by salary;
--grades
    --John -> 70
    --Alica -> 80
    --Alex -> 70
    --70: 2
    --80: 1
select * from employees;
--Display how many people are working in each department
select department_id, count(*) from employees group by department_id;
-- select department_id, count(*) from employees group by department_id where count(*)>5;   where complains
-- HAVING keyword -> similar to where in single row function; but used in the multiple row function
select department_id, count(*) from employees group by department_id having count(*)>5;
-- WHERE vs HAVING
--where is used for condition in single row function
--having is used for condition in multiple row function
--Display number of each person for minimum salary more than 10K
select salary, count(*) from employees group by salary having salary >10000;
--------------------------------------------------------------------------------------------------------------------------------
-- SUBQUERIES
-- It means writing the quwery inside the query -> NESTED query: similat to nested loop
--max salary is -> 24K
select first_name, last_name, job_id, salary from employees where salary = 24000;  --this is HARD coding, what if 24000 changes one day
select first_name, last_name, job_id, salary from employees where salary = (select max(salary) from employees); --this is more dynamic; this is using subqueries
-- Display the first and last name of the person who got the lowest salary;
select first_name, last_name, salary from employees where salary = (select min(salary) from employees);
-- Dislplay the second highest salary from the empl table
select max(salary) from employees where salary < (select max(salary) from employees);
--the queries read form RIGHT to LEFT (so, first, it finds the max salary (24K on the right), then it sees that max salary has to be less than the one you wrote on the right)
--Dislplay the first and last name, salary who got the second highest salary from empl table
select first_name, last_name, salary from employees where salary = (select max(salary) from employees where salary < (select max(salary) from employees));
--------------------------------------------------------------------------------------------------------------------------------
--JOINS
--When you are adding data from multiple tables

--Types of joins:

    --INNER join
    
       -- ->prints the data that has in both tables
       -- select t1.col1, t2.col1 from t1 and join t2 ON t1.foreignkey = t2.primarykey
       -- select students.first_name, students.last_name, course.course_name FROM students INNER JOIN course ON students.course_id=course.couse_id;
       --whatever is capitalized is the keywords
       
       --Display first and last name and the department name from the employeee and department table
select employees.first_name, employees.last_name, departments.department_name from employees inner join departments on employees.department_id = departments.department_id;
--you can also do this: creating an object
select employees.first_name, employees.last_name, departments.department_name from employees e inner join departments d on employees.department_id = departments.department_id;
select e.first_name, e.last_name, d.department_name from employees e inner join departments d on e.department_id = d.department_id;
    
    -- Task, display the region name and country name from countries and regions table
    select regions.region_name, countries.country_name from countries inner join regions on countries.region_id = regions.region_id;

     --> Outer join:
    --LEFT join => prints all the matching data and print all the data from left side of the table
    select e.first_name, e.last_name, d.department_name from employees e left outer join departments d on e.department_id = d.department_id;
    
    
   --Right join => prints all the matching data and print all the data from right side of the table
        select e.first_name, e.last_name, d.department_name from employees e right outer join departments d on e.department_id = d.department_id;

    --FULL join
    
        select e.first_name, e.last_name, d.department_name from employees e full outer join departments d on e.department_id = d.department_id;
        
        select first_name, salary from employees where first_name = 'Kimberely';

    
    --SELF join
    
        -- you can search about, one knowing whoese managers who. 
        
        --Task, print all the employees first and last name and job titles
            -- matching job title all the employees;
            
select first_name, last_name, job_title from employees left outer join jobs on employees.job_id = jobs.job_id;
--select first_name from employees;-- printing from one table


-- Print region name, city, country name from regions, locations and countries table.
select region_name, city, country_name from locations inner join countries on locations.country_id = countries.country_id inner join regions on countries.region_id = regions.region_id;

--Inner join means you are combining two or more tables together. 

select region_name, city, country_name from locations 
            inner join countries on locations.country_id = countries.country_id 
            inner join regions on countries.region_id = regions.region_id;
            
            select region_name, city, country_name from regions 
            inner join countries on countries.region_id = regions.region_id 
            inner join locations on locations.country_id = countries.country_id;
            
--> SET OPERATIONS - combining the 2 queries.
    
    -- UNION, INION ALL, INTERSECT, MINUS
    
    -- query1 UNION query2 => result;
    
    -- Rules for set operations
        --> same number of columns
        --> same datatype
    
    -- UNION => it will removes duplicated and sort the result
    
    -- (A, B, C, A) UNION (K, M, L, B) => (A, B, C, K, M, L)
    select first_name, last_name, department_id from employees where department_id in (30, 50, 100)
    UNION
    select first_name, last_name, department_id from employees where department_id in (30, 60, 100);
    
    -- UNION ALL => it will NOT remove duplicated and doesnt sort it
    -- 57 + 17 => 74
    -- (A, B, C, A) UNION ALL (K, M, L, B) => (A, B, C, A, K, M, L, B)
    
    select first_name, last_name, department_id from employees where department_id in (30, 50, 100);
    -- this gets person who works in department 30, 50, 100
    
    
    select first_name, last_name, department_id from employees where department_id in (30, 60, 100);
    --This gets person who works in department 30, 60, 100
    
    
    select first_name, last_name, department_id from employees where department_id in (30, 50, 100)
    UNION ALL
    select first_name, last_name, department_id from employees where department_id in (30, 60, 100);
    
    --INTERSECT: GETS ONLY THE SAME DATA, DUPLICATED
    
      -- (A, B, C)(3 ROWS) INTERSECT (K, M, L, B)(WE HAVE 4 ROWS) => (A, B, C, K, M, L)
        select first_name, last_name, department_id from employees where department_id in (80, 50, 100)
        INTERSECT
        select first_name, last_name, department_id from employees where department_id in (30, 60, 100);
        -- IN THIS CASE ONLY WILL PRINT THE DEPARTMENT WITH ID 100 BC IT IS DUPLICATED FROM 2 QUIRIES.
        
    -- MINUS: PRINTS THOSE THAT ARE NOT IN SECOND QUERY......
         -- (A, B, C)(3 ROWS) MINUS (K, M, L, B)(WE HAVE 4 ROWS) => (A, C) -- BC ITS NOT IN QUERY 2
          select first_name, last_name, department_id from employees where department_id in (80, 50, 100)
        MINUS
        select first_name, last_name, department_id from employees where department_id in (30, 50, 100); --(80) WILL ONLY BE PRINTED
        
        
   -- DQL
   -- DDL
   -- DML
   
   --DDL    
        -- CREATE
        -- TRUNCATE
        -- ALTER
        -- and so on
        
    -- DML
            -- INSERT
            -- UPDATE
            -- DELETE
            -- AND SO ON
            
    CREATE TABLE BOOKS
    (
        --Varchar is String in SQL
        book_id number(6) primary key,
        book_name varchar2(30) not null,
        book_title varchar (10) null
    );
        
            select * from books;
    --for now, it is empty
    INSERT INTO BOOKS values(1,'Selenium', 'Science');
    INSERT INTO BOOKS values(2,'Math', 'Science');
    INSERT INTO BOOKS values(3,'Star Wars', 'Fiction');
    INSERT INTO BOOKS values(4,'Calculus', 'Math');
    INSERT INTO BOOKS values(5,'JAVA', 'OCA');
select * from books;
    UPDATE BOOKS SET book_type = 'Drama' where book_id = 5;
    
    DELETE FROM BOOKS WHERE book_id = 3;
    
    -- DROP AND TRUNCATE
    
    -- DROP IS delete all rows(data) anD table
    -- Truncate is delete all rows(data) but leave a table empty
    
    TRUNCATE TABLE BOOKS;
    DROP TABLE BOOKS;
        
        
         

    

    
    
    
    
        









