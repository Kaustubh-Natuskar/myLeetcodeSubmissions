/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let posArr = [], negArr = [];
    nums.forEach((num) => {
        if(num>=0)
            posArr.push(num);
        else
            negArr.push(num);
    })
    for(let i=0; i<nums.length/2; i++){
        nums[i*2]   = posArr[i]
        nums[i*2+1] = negArr[i]
    }
    return nums;
};