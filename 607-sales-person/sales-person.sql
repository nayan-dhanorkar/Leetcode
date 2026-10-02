# Write your MySQL query statement below
select s.name from SalesPerson s
where s.name not in(
select s.name from SalesPerson s
cross join Company c
inner join Orders o on c.com_id = o.com_id and s.sales_id = o.sales_id
where c.name = 'RED'
)
