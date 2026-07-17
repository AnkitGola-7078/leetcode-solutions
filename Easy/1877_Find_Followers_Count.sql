-- Problem: Find Followers Count
-- Problem ID: 1877
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 587 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-07-17

# Write your MySQL query statement below
select user_id,count(follower_id) as followers_count from Followers
group by user_id
order by user_id;
