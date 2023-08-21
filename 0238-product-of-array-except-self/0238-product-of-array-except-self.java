class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int productOfArray[] = new int[numsLength];
        if(numsLength == 0){
            return productOfArray;
        }

        int prefixProducts[] = new int[numsLength];
        int sufixProducts[] = new int[numsLength];
        calculatePrefixProducts(prefixProducts, nums);
        calculateSufixProducts(sufixProducts, nums);


        for(int iterator = 0; iterator <= numsLength-1; iterator++){
            int sufixProduct, prefixProduct;
            prefixProduct = iterator == 0 ? 1 : prefixProducts[iterator-1];
            sufixProduct = iterator == numsLength-1 ? 1 : sufixProducts[iterator+1];

            productOfArray[iterator] = prefixProduct * sufixProduct;
        }

        return productOfArray;
    }
    public void calculatePrefixProducts(int[] array, int[] nums){
        array[0] = nums[0];
        for(int iterator = 1; iterator <= nums.length-1; iterator++){
            array[iterator] = array[iterator-1] * nums[iterator];
        }
    }
    public void calculateSufixProducts(int[] array, int[] nums){
        array[nums.length - 1] = nums[nums.length - 1];
        for(int iterator = nums.length-2; iterator >= 0; iterator--){
            array[iterator] = array[iterator+1] * nums[iterator];
        }
    }
}