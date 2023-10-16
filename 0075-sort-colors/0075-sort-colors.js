/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let low = 0, mid = 0, high = nums.length -1 ;
    while(mid <= high) {
        switch(nums[mid]){
            case 0:
            swap(nums, low, mid);
            low++;
            mid++;
            break;

            case 1:
            mid++;
            break;

            case 2:
            swap(nums, mid, high);
            high--;
            break;
        }
    }
};
function swap(arr, index1, index2){
    let temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}