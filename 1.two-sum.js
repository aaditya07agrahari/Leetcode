/*
 * @lc app=leetcode id=1 lang=javascript
 *
 * [1] Two Sum
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
        // Create a hash map to store numbers and their indices
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

