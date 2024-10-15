-- LC 570 : Managers with at least 5 direct reports (DAY 9 SQL)
select a.name
from Employee a
join Employee b
on a.id = b.managerId
group by a.id, a.name
having count(a.id) >= 5
