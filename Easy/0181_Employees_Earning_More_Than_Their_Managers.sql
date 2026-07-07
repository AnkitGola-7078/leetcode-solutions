-- Problem: Employees Earning More Than Their Managers
-- Problem ID: 181
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 443 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-07-07

# Write your MySQL query statement below
SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID
WHERE
e1.salary < e2.salary