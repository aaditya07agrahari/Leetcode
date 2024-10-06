/*
 * @lc app=leetcode id=1 lang=javascript
 *
 * [1] Two Sum
 */


// @lc code=start
/**
 * 
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// You're given an array nums, for example: [2, 7, 11, 15].
// You're also given a target, say 9.
// You need to find two numbers in nums that add up to target. Here, 2 + 7 = 9.
// You return the indices of these two numbers. In this case, the indices are [0, 1] because nums[0] is 2 and nums[1] is 7
var twoSum = function(nums, target) {
    let numMap = {};
        
        // Iterate through the array
        for (let i = 0; i < nums.length; i++) {
            // Calculate the complement
            let complement = target - nums[i];
            
            // Check if the complement exists in the hash map
            if (numMap.hasOwnProperty(complement)) {
                // If found, return the indices
                return [numMap[complement], i];
            }
            
            // Otherwise, store the number and its index in the hash map
            numMap[nums[i]] = i;
        }
        
        // In case there is no solution, return an empty array
        return [];
    
};
// @lc code=end

