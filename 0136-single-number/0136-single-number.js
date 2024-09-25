/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let xor = 0;
    nums.forEach((i) => {
        xor = xor ^ i
    })
    return xor;
};