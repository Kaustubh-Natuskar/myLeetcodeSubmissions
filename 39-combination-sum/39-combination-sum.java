class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currRes =  new ArrayList<>();
        
        
        combinationSumSol(0, target, currRes, result, candidates);
        
        return result; 
    }
    
    private void combinationSumSol(int curr, int target, List<Integer> currRes, List<List<Integer>> result, int[] candidates ){
        
        if( target == 0){
            result.add(new ArrayList<Integer>(currRes));
            return;
        }
        if(curr >= candidates.length)
            return;
        
        int currVal= candidates[curr];
        
        if(target >= currVal){
            currRes.add(currVal);
            combinationSumSol(curr,target-currVal,currRes,result,candidates);
            currRes.remove(currRes.size()-1);
        }
        combinationSumSol(curr+1,target,currRes,result,candidates);
    }
}