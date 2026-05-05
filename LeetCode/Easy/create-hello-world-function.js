// Title: Create Hello World Function
// URL: https://leetcode.com/problems/create-hello-world-function/
// Difficulty: Easy
// Language: javascript

var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World";
    }
};/**
 * @return {Function}
 */


/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */