# Write your MySQL query statement below
select u.name , sum(t.amount) as balance from Users u 
inner join  Transactions t 
on t.account = u.account
group by t.account
having balance >10000;