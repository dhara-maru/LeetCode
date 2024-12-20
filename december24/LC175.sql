-- LC 175 : Combine two tables
select p.firstName, p.lastName, a.city, a.state 
from Person p
left join Address a
on p.personid = a.personId;