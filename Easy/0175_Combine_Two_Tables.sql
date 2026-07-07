-- Problem: Combine Two Tables
-- Problem ID: 175
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 402 ms
-- Memory: 0B
-- Synced From: LeetCode
-- Date: 2026-07-07

# Write your MySQL query statement below
select p.firstName,p.lastName,a.city,a.state from Person p
left join Address a on p.personId=a.personId
