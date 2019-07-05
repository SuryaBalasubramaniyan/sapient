create database demo;
use demo;
create table department(
	dep_id int unsigned primary key auto_increment,
	dep_name varchar(40),
location varchar(20) not null);

create table employee(
	id int unsigned primary key ,
	emp_name varchar(40),
	dep_id int unsigned not null,
	constraint foreign key (dep_id) references department(dep_id));

select * from department;
insert into department(dep_name,location)values ('IT','bangalore'),('Finance','bangalore'),('office services','chennai');

select * from employee;
insert into employee(id,emp_name,dep_id) values ('1','Surya','1'),('2','Bhargavi','3'),('3','Kesu','1');

select emp_name from employee inner join department where employee.dep_id=department.dep_id;

Alter table employee
add salary int;
select * from employee where dep_id in (1,3);
select * from employee where salary > (select avg(salary) from employee);
select dep_name,location from department group by dep_id; 