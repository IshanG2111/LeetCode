// Title: Apply Transform Over Each Element in Array
// URL: https://leetcode.com/problems/apply-transform-over-each-element-in-array/
// Difficulty: Easy
// Language: javascript

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const res = [];
    for(const  i in arr){
        res.push(fn(arr[i],Number(i)));
    }
    return res;
    //return arr.map(fn);
};
//fucntional vs procedural
//no state