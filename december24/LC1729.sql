-- LC 1729 : Find Followers Count
select user_id, COUNT(follower_id) as followers_count
from Followers
group by user_id        --  "for each user"
order by user_id asc