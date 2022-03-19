class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != key)
                continue;
            if(!map.containsKey(nums[i+1])){
                map.put(nums[i+1],1);
            }else{
                map.put(nums[i+1],map.get(nums[i+1]) + 1);
            }
        }
        int h=0,k=0;
        for(Map.Entry ele: map.entrySet()){
            //h=Math.max(h,(int)ele.getValue());
            if((int)ele.getValue() > h){
                k=(int)ele.getKey();
                h=(int)ele.getValue();
            }
        }
        return k;
    }
}