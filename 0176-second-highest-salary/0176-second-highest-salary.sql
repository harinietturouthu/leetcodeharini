# Write your MySQL query statement below
select (select distinct salary  from employee where salary is NOT NULL order by salary desc limit 1 offset 1)as SecondHighestSalary;