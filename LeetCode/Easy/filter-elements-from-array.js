// Title: Filter Elements from Array
// URL: https://leetcode.com/problems/filter-elements-from-array/
// Difficulty: Easy
// Language: javascript

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const result=arr.filter(fn);
    return result;
};