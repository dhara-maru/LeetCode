-- LC 1693 : Daily Leads and Partners
select date_id, make_name, 
COUNT(DISTINCT lead_id) AS unique_leads, 
COUNT(DISTINCT partner_id) AS unique_partners
from DailySales 
group by date_id, make_name