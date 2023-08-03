class Solution {
    
    class TrieNode{
        HashMap<Character, TrieNode> chain;
        boolean isWord;
        String word;
        
        public TrieNode(){
            this.chain = new HashMap<>();
            isWord = false;
            word = "";
        }
        public boolean contains(char c){
            return this.chain.containsKey(c);
        }
        public void put(char c, TrieNode n){
            this.chain.put(c, n);
            n.word = this.word + c;
        }
        public TrieNode get(char c){
            return this.chain.get(c);
        }
        public void setWord(boolean b){
            this.isWord = b;
            
        }
        public boolean isWord(){
            return this.isWord;
        }
        public String getWord(){
            return this.word.toString();
        }
    }
    
    private TrieNode addWords(String [] words){
        TrieNode root = new TrieNode();
        
        for(String word : words){
            TrieNode curr = root;
            for(char c : word.toCharArray()){
                if(!curr.contains(c)){
                    curr.put(c, new TrieNode());
                }
                curr = curr.get(c);
            }
            curr.setWord(true);
        }
        
        return root;
    }
    
    //[OPTIMIZED] TC = O(m * n * dfs( min(4^word, m * n )) <- m = board.length, n = board[0].length, word = longest(length of word in words)
    // SC = min(word, m*n)
    public List<String> findWords(char[][] board, String[] words) {
       
        
        /*
            1 -> Create Trie with words
            2 -> iterate through the board 
                -> run dfs (backtracking) for every pos pasing the root of the Trie
                    3 -> check if the current char is in the Trie and mark it as visited
                            -> if the current char forms a Word from the Trie
                                -> add it to ans list
                                -> remove the word from the Trie (duplicate, word apper in board > 1)
                            -> backtrack in all 4 directions
                                -> mark it as unvisted (remove it from visited)

            4 -> return the list with the anwsers.
        */
        
        List<String> ans = new ArrayList<>();
        TrieNode root = addWords(words);
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                backtrack(board, root, i, j, ans);
            }
        }
        
        return ans;
    }
    
    private void backtrack(char[][]board, TrieNode node, int i, int j, List<String>ans){

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
           !node.contains(board[i][j]) || board[i][j] == '#'){
            return;
        }
        
        char c  = board[i][j];
        
        node = node.get(c);
        
        if(node.isWord()){
            ans.add(node.getWord());
            node.setWord(false);
        }

        board[i][j] = '#'; // visited;
        
        backtrack(board, node, i+1, j, ans);
        backtrack(board, node, i-1, j, ans);
        backtrack(board, node, i, j+1, ans);
        backtrack(board, node, i, j-1, ans);

        board[i][j] = c; // removed from visited        
    }
}