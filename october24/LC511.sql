-- LC 511 : Game play analysis I
select player_id, min(event_date) as first_login
from Activity
group by player_id