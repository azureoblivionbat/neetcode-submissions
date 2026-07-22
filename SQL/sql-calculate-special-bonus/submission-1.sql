select employee_id,
    CASE
        When employee_id % 2 = 1 and name not like 'M%' Then salary
        ELSE 0
    END  as bonus
from employees order by employee_id asc;