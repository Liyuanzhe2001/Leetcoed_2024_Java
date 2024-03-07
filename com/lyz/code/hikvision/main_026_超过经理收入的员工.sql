select a.name as Employee
from Employee a
join Employee as b
on a.managerId = b.id
where a.salary > b.salary
