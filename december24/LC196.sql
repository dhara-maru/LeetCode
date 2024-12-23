-- LC 196 : Delete Duplicate Emails
DELETE FROM Person
WHERE id > (
    SELECT MIN(id)
    FROM (
        SELECT * FROM Person
    ) AS Temp
    WHERE Person.email = Temp.email
);
