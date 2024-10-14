-- LC 1378 : Replace Employee ID With The Unique Identifier
select b.unique_id, a.name 
from EmployeeUNI b
right join Employees a
on b.id = a.id
