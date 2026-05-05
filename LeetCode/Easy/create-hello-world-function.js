// Title: Create Hello World Function
// URL: https://leetcode.com/problems/create-hello-world-function/
// Difficulty: Easy
// Language: javascript

var createHelloWorld = function() {
    const msg="Hello World";
    return function(...args) {
        return msg;
    }
};/**
 * @return {Function}
 */


/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */