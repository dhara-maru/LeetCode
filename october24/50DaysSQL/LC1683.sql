--LC 1683 : Invalid Tweets
select tweet_id from Tweets
where LENGTH(content) > 15