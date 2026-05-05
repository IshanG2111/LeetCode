// Title: Counter
// URL: https://leetcode.com/problems/counter/
// Difficulty: Easy
// Language: javascript

/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    
    return function() {
        return n++;
    };
};

 const counter = createCounter(10)
 console.log(counter()) // 10
 console.log(counter()) // 11
 console.log(counter()) // 12
 