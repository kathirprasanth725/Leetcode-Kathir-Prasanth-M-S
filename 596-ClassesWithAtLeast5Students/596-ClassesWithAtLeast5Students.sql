-- Last updated: 8/13/2026, 12:19:02 AM
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(*) >= 5;