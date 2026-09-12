class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> res= new HashMap<>();
        for(String s : strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
             String s1 = new String(chars);
            res.putIfAbsent(s1 , new ArrayList<>());
            res.get(s1).add(s);
        }
        
        return new ArrayList<>(res.values());
    }
}
