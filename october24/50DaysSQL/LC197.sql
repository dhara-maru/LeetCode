-- LC 197 : Rising Temperature
select a.id 
from Weather a
join Weather b
ON DATEDIFF(a.recordDate, b.recordDate) = 1
WHERE a.temperature > b.temperature;