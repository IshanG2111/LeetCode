// Title: Array Reduce Transformation
// URL: https://leetcode.com/problems/array-reduce-transformation/
// Difficulty: Easy
// Language: javascript

/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    if(nums.length===0){
        return init;
    }
    const result=nums.reduce(fn,init);
    return result;
};