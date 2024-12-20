-- LC 182 : Duplicate Emails
select email
from Person
group by email
having COUNT(email) > 1;