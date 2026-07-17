-- Problem: Average Time of Process per Machine
-- Problem ID: 1801
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 260 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-07-17

# Write your MySQL query statement below
select 
a.machine_id,
round(
      (select avg(a1.timestamp) from Activity a1 where a1.activity_type = 'end' and a1.machine_id = a.machine_id) - 
      (select avg(a1.timestamp) from Activity a1 where a1.activity_type = 'start' and a1.machine_id = a.machine_id)
,3) as processing_time
from Activity a
group by a.machine_id