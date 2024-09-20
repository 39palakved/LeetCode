# Write your MySQL query statement below

select p.product_name , sum(o.unit) as unit from Products p 
join Orders o on 
p.product_id = o.product_id
where   year(order_date) = '2020' and month(order_date) ='02'
GROUP BY 
    p.product_id, 
    p.product_name
HAVING 
    SUM(o.unit) >= 100;

