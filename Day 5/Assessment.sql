create table Student(id int primary key, name varchar(20) , age int , major varchar(20) , gpa decimal(3,2) , enrollment_date date);

INSERT INTO Student (id, name, age, major, gpa, enrollment_date) VALUES 
(101, 'Alice Johnson', 20, 'Computer Science', 3.8, '2023-01-15')
, (102, 'Bob Smith', 22, 'Mathematics', 3.4, '2023-03-22'),
 (103, 'Carol Lee', 19, 'Biology', 3.2, '2023-04-10'),
 (104, 'David Brown', 21, 'Physics', 2.9, '2022-11-05'), 
(105, 'Eve Davis', 23, 'Computer Science', 3.6, '2022-08-20'), 
(106, 'Frank Miller', 20, 'Mathematics', 3.1, '2023-02-28');

-- Major in computer science
select * from Student where major = 'Computer Science';

-- Gpa > 3.5 or major = decimal
select * from Student where gpa > 3.5 or major = 'Mathematics';

-- age > 20 and gpa < 3
select * from Student where age > 20 and gpa < 3;

-- jan 1 , 2023 and dec 31, 2024
select * from Student where enrollment_date between '2023-01-01' and '2023-12-31';

-- distict majors
select distinct major from Student ;

-- IDs in (101,102,103)
select * from Student where id in (101,102,103);

-- GPA is null
select * from Student where gpa is null;

-- name is not null
select * from Student where name is not null;

-- age is 18 or 22
select * from Student where age in (18, 22);

-- either less than 19 or gpa > 3.8
select * from Student where age < 19 or gpa > 3.8;

-- gpa between 2.5 and 3.5 and majority is Biology
select * from Student where (gpa between 2.5 and 3.5) and (major = 'Biology');

-- name in asc and gpa in desc
select * from Student order by name and gpa desc;

