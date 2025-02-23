-- PK 
create database sample;
use sample;

-- create table departments
CREATE TABLE departments ( 
id INT PRIMARY KEY, 
name VARCHAR(100) 
NOT NULL);
 
INSERT INTO departments (id, name) 
VALUES 
(1, 'Sales'), 
(2, 'R&D'), 
(3, 'Marketing'), 
(4, 'Finance'), 
(5, 'Human Resources');
 
select * from departments;
 
-- create table employees which makes many to one relationship between department and employees
 
CREATE TABLE employees ( 
id INT PRIMARY KEY, 
name VARCHAR(100) NOT NULL, 
position VARCHAR(100) NOT NULL, 
salary DECIMAL(10, 2), 
department_id INT, 
FOREIGN KEY (department_id) 
REFERENCES departments(id));

desc employees;
 
INSERT INTO employees 
(id, name, position, salary, department_id) 
VALUES 
(1, 'John Doe', 'Manager', 75000.00, 1), 
(2, 'Jane Smith', 'Developer', 65000.00, 2), 
(3, 'Emily Johnson', 'Designer', 60000.00, 3), 
(4, 'Michael Brown', 'Analyst', 70000.00, 4), 
(5, 'Linda Green', 'Manager', 75000.00, 1), 
(6, 'James White', 'Developer', 65000.00, 2), 
(7, 'William Black', 'Developer', NULL, 2), 
(8, 'Mary Blue', 'HR', 50000.00, 5);
 
select * from employees;

-- Joins in SQL

-- Inner Join 
select e.id, e.name, e.position as Designation, e.salary, d.name as 'Department Name' from employees 
as e join departments as d on e.department_id = d.id;

-- Left Join
-- lets insert one record in employee table without department id 

insert into employees values(9, 'Test User', 'Testing', 34000, NULL);
select e.id, e.name, e.position as Designation, e.salary, d.name as 'Department Name' from employees 
as e left join departments as d on e.department_id = d.id;

-- Right Join
-- lets insert one record in department table without employement id 

insert into departments values(6,'IT');
select e.id, e.name, e.position as Designation, e.salary, d.name as 'Department Name' from employees 
as e right join departments as d on e.department_id = d.id;

-- Full Outer Join

select e.id, e.name, e.position as Designation, e.salary, d.name as 'Department Name' from employees 
as e left join departments as d on e.department_id = d.id 
union 
select e.id, e.name, e.position as Designation, e.salary, d.name as 'Department Name' from employees 
as e right join departments as d on e.department_id = d.id;


-- cross join

select e.id as 'Employment ID', e.name as 'Employeement Name', d.id as 'Department ID' ,d.name as 'Department Name'
from employees as e cross join departments as d;

-- Group by 

select count(*) as 'No of Employees' , department_id from employees group by department_id;

-- count aggregate function 

select d.name as 'Department Name', count(*) as 'No of Employees'
from employees as e join departments as d on e.department_id = d.id group by department_id;

-- sum aggregate function 

select d.name as 'Department Name' , sum(e.salary) as 'Total Salary' from employees e join departments d 
on e.department_id = d.id group by d.name;

select d.name as 'Department Name' , sum(e.salary) as 'Total Salary' from employees e join departments d 
on e.department_id = d.id group by d.name having `Total Salary` > 100000;

-- list the department which is having more than 2 employees

select d.name as 'Department Name' , count(e.department_id) as 'Employees Count' from employees e join departments d on 
e.department_id = d.id group by d.name having `Employees Count` > 1;


-- ROLL UP
select d.name as 'Department Name', sum(e.salary) as 'Total Salary'
from employees as e join departments as d on e.department_id = d.id group by (d.name) with rollup;