-- LC 2356 : Number of Unique Subjects Taught by Each Teacher
select teacher_id, COUNT(distinct subject_id) as cnt
from Teacher
group by teacher_id