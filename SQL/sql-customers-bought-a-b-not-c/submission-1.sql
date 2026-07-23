Select distinct c.customer_id, c.customer_name
FROM customers c JOIN orders o on c.customer_id = o.customer_id
AND product_name in ('A', 'B') 
WHERE (SELECT customer_id from orders o2 where o2.customer_id = c.customer_id and o2.product_name = 'C' )
IS NULL
GROUP by c.customer_id, c.customer_name
HAVING count(DISTINCT product_name) = 2
order by customer_name