select * from Patients
where conditions != '' and conditions REGEXP '(^| )DIAB1';
