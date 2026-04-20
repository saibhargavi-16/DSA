# Write your MySQL query statement below
select pro.product_name, s.year,s.price from sales s left join product pro on s.product_id=pro.product_id;