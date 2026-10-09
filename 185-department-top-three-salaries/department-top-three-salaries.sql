# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e
inner join Department d
on e.departmentId = d.id
where 3 > (
    select count(distinct salary) from Employee
    where departmentId = e.departmentId
    and salary>e.salary
)