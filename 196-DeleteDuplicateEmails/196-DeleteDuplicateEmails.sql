-- Last updated: 8/13/2026, 12:21:15 AM
# Write your MySQL query statement below
delete p1 from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;