-- Problem: Classes With at Least 5 Students
-- Problem ID: 596
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 346 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-07-17

# Write your MySQL query statement below
select class from Courses
group by class
having count(student) >=5;