/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    let supposedSum = n * (n+1) / 2;

    let actualSum = 0
    nums.forEach((i) => {
        actualSum = actualSum + i;
    });
    return supposedSum - actualSum;
};