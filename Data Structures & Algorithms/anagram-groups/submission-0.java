class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];        

        for(int i=0; i<strs.length; i++){
            if (visited[i]) {
                continue;
            }

            String word = strs[i];
            
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
             
            List<String> list = new ArrayList<>();
            list.add(word);
            visited[i] = true;


            for(int j=i+1; j<strs.length; j++){
                if (visited[j]) {
                    continue;
                }
                
                String word2 = strs[j];
                char[] wordArr2 = word2.toCharArray();
                Arrays.sort(wordArr2);

                if(Arrays.equals(wordArr,wordArr2)){
                    list.add(word2);
                    visited[j]=true;
                }

            }

            result.add(list);
        }

        return result;
    }
}
