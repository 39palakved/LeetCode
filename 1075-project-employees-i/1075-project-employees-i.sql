# Write your MySQL query statement below
select P.project_id , round(avg(experience_years),2) as average_years from Employee E
right join Project p on
E.employee_id = P.employee_id
group by project_id;

