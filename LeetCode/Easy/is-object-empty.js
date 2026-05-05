// Title: Is Object Empty
// URL: https://leetcode.com/problems/is-object-empty/
// Difficulty: Easy
// Language: javascript

/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
        if(Object.keys(obj).length===0){
            return true;
        }
        else{
        return false;
        }
};