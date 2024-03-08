select a.name as 'NAME', sum(b.amount) as 'BALANCE'
from Users as a
join Transactions as b
on a.account = b.account
group by b.account
having sum(b.amount) > 10000;
