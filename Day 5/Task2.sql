use employees;

show tables;

select * from employees limit 5;

-- Task 1
select e.first_name, e.last_name, t.title as 'Job Title'
from employees as e join titles as t on e.emp_no = t.emp_no;

-- Task 2
select e.first_name, e.last_name, dp.dept_name
from employees as e join dept_emp as d on e.emp_no = d.emp_no join departments as dp on d.dept_no = dp.dept_no where dp.dept_name= 'Sales';

-- Task 3
select avg(s.salary) as 'Average Salary'
from employees as e join salaries as s on e.emp_no = s.emp_no;

-- Task 4
select dp.dept_name as 'Department Name', count(*) as 'Count'
from employees as e join dept_emp as d on e.emp_no = d.emp_no join departments as dp on d.dept_no = dp.dept_no group by(dp.dept_name);

-- Task 4 - optimized way
select dp.dept_name as 'Department Name', count(d.emp_no) as 'Count'
from dept_emp as d join departments as dp on d.dept_no = dp.dept_no group by(dp.dept_name);

-- Task 5
select dp.dept_name as 'Department Name'
from employees as e join dept_emp as d on e.emp_no = d.emp_no join departments as dp on d.dept_no = dp.dept_no group by(dp.dept_name) having count(*) > 5;

-- Task 5 - optimized way
select dp.dept_name as 'Department Name'
from dept_emp as d join departments as dp on d.dept_no = dp.dept_no group by(dp.dept_name) having count(d.emp_no) > 5;

-- Task 6 - List all employees and the names of their managers.

-- Task 7 - Find all employees who work in the 'Marketing' or 'Finance' departments
select e.first_name, e.last_name, dp.dept_name as 'Department Name'
from employees as e join dept_emp as d on e.emp_no = d.emp_no 
join departments as dp on d.dept_no = dp.dept_no 
where dp.dept_name = 'Marketing' or dp.dept_name = 'Finance';

-- Task 8 - Find all customers whose names start with the letter 'A'.
select first_name , last_name from employees where first_name like 'A%';

-- Task 9 - Combine the first names of employees and customers into a single list.

-- Task 10 - Find the names of employees who have placed the highest number of orders.

-- Task 11 - Find the number of Male and Female employees in the database and the order count in descending order.
select gender, count(gender) from employees group by gender;

-- Task 12 - Find the Average salary by employee title and order by descending order.
select t.title Title,avg(s.salary) as 'Average Salary'
from employees as e join titles as t
on e.emp_no = t.emp_no
join salaries as s
on e.emp_no = s.emp_no
group by t.title
order by `Average Salary` desc;

-- Task 13 - List first 5 employees (id,fname,lname,department name) alog with their department names.
select e.emp_no as 'ID', e.first_name as 'First Name', e.last_name as 'Last Name' , dp.dept_name as 'Department Name' 
from employees e join dept_emp d on 
e.emp_no = d.emp_no join departments dp on d.dept_no = dp.dept_no limit 5;

-- Task 14 - Display firstname, lastname,salary of the highest payed employee.
select e.first_name, e.last_name, s.salary
from employees e join salaries s on e.emp_no = s.emp_no order by s.salary desc limit 1;

-- Task 15 - second highest payed employee
select e.first_name, e.last_name, s.salary
from employees e join salaries s on e.emp_no = s.emp_no order by s.salary desc limit 1 offset 1;
