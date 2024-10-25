-- LC 596 : Classes with more than 5 students
select class from Courses
group by class 
having COUNT(*) >= 5