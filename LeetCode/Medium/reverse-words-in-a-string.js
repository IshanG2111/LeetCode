// Title: Reverse Words in a String
// URL: https://leetcode.com/problems/reverse-words-in-a-string/
// Difficulty: Medium
// Language: javascript

/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    return s
    .trim()
    .split(/\s+/)
    .reverse()
    .join(" ")
};