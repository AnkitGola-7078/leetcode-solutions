-- Problem: Rising Temperature
-- Problem ID: 197
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 473 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-07-17

# Write your MySQL query statement below
SELECT today.id
FROM Weather yesterday 
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;