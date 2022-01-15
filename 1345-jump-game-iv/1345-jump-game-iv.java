class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        
        if(n == 1) return 0;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        int steps = 0;
        
        for(int i = 0; i < n; i++){
            map.computeIfAbsent(arr[i], v -> new ArrayList()).add(i);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        
        while(!queue.isEmpty()){
            steps++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int j = queue.poll();
            
                if(j - 1 >= 0 && map.containsKey(arr[j - 1])){
                    queue.offer(j - 1);
                }

                if(j + 1 < n && map.containsKey(arr[j + 1])){
                    if(j + 1 == n - 1) return steps;
                    queue.offer(j + 1);
                }

                if(map.containsKey(arr[j])){
                    for(int k : map.get(arr[j])){
                        if(k != j){
                            if(k == n - 1) return steps;
                            queue.offer(k);
                        }
                    }
                }
                map.remove(arr[j]);
            }
        }
        
        return steps;
    }
}