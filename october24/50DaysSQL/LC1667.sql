-- LC 1667 : Fix Names in a Table
select user_id, 
CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name, 2))) AS name from Users order by user_id asc