-- LC 620 : Not Boring Movies
select * from Cinema 
where description not like 'boring' 
and id % 2 != 0 
order by rating desc