/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let majority = nums[0], count = 1;

    for(let i = 1; i<nums.length; i++){
        if(majority == nums[i]){
            count ++;
        } else {
            count --
        }
        if(count == 0){
            majority = nums[i];
            count = 1;
        }
    }

    return majority;
};