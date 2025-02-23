show databases;

create database if not exists mindsprint;
use mindsprint;

-- Create table
create table employee(id int primary key, name varchar(10), department varchar(20), salary decimal(10,2));

-- Describe the table
describe employee;

-- Alter the table

alter table employee add column position varchar(100);

describe employee;

-- Insert single record using all fields

insert into employee values(1,'alex', 'I.T', 23000,'Jr.Engineer');

select * from employee;

insert into employee (id, position, department, name, salary) values 
(2, 'Sr, Engineer', 'I.T.', 'bob', 34000),
(3, 'Jr. Consultant', 'HR', 'cassy', 34670);

insert into employee (id, position, department, name, salary) values 
(4, 'Designer', 'I.T.', 'catherine', 35000),
(5, 'Manager', 'HR', 'Jack', 35970);

-- Update Data

update employee set salary = 40345.67 where id = 5;

-- delete Data

delete from employee where id = 5;

-- truncate data

truncate table employee;

-- delete entire column

drop table employee;

-- Lets create table using extras

create table employee(id int primary key auto_increment, name varchar(10),position varchar(10), department varchar(20), salary decimal(10,2));

describe employee;

insert into employee(name, position, department, salary) values 
('Alex', 'Jr. Er', 'IT', 34000),
('Cassy', 'Manager', 'HR', 23000),
('Alice', 'Jr. Cslt', 'HR', 10000);

select * from employee;

select name, salary from employee;

select 23+12 as 'result';

select concat('Paras', ' ','Budhiraja') as 'fullname';

select now() today;

select upper('Hello World') as 'Upper case';

-- where Clause

-- retrieve data of employees whose salary is more than 50000

-- Tasks

select name, department, salary from employee where salary >= 20000;

select * from employee where salary >= 100000;

select * from employee where id = 3;

select * from employee where name = 'Alex';

select * from employee where salary >=10000 and salary <= 30000;

select * from employee where department = 'HR';

select * from employee;

-- Order By querries

-- salary in ascending order
select * from employee order by salary asc;

-- salary in descending order
select * from employee order by salary desc;

-- department in ascending , salary descending
select * from employee order by department , salary desc;

select * from employee order by salary desc, department , name desc;

select * from employee order by salary desc limit 1;

select distinct department from employee;

-- employees either in HR or IT

select * from employee where department = 'HR' or department = 'IT';
select * from employee where department not in ('IT' );

select * from employee where name like 'A%';
select * from employee where name like 'A__ce';


select * from employee where salary between 10000 and 30000;




