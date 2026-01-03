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
