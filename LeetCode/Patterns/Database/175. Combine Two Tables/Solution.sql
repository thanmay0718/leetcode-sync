-- Write your PostgreSQL query statement below
select
    firstName,
    lastName,
    city,
    state
from Person
LEFT Join Address
on Person.personId = Address.personId;
