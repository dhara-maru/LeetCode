-- LC 183 : Customers who never order
select c.name as Customers
from Customers c
left join Orders o
on c.id = o.customerid
where o.customerid is null