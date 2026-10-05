class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() !=t.length()) return false;
        // HashMap<Character , Integer> smap=new HashMap<>();
        // HashMap<Character , Integer> tmap=new HashMap<>();
        // for(int i=0 ; i<s.length() ; i++){
        //     smap.put(s.charAt(i) , smap.getOrDefault(s.charAt(i) , 0)+1);
        //     tmap.put(t.charAt(i) , tmap.getOrDefault(t.charAt(i) , 0)+1);
        // }
        // return smap.equals(tmap);


        if(s.length() !=t.length()) return false;
        HashMap<Character , Integer> ans=new HashMap<>();

        for(int i=0 ; i<s.length() ; i++){
            ans.put(s.charAt(i) , ans.getOrDefault(s.charAt(i) , 0)+1);
          
        }

        for(int i=0 ; i<t.length() ; i++){
            char ch=t.charAt(i);
            // if  key is not present
            if(!ans.containsKey(ch)){
                return false;
            }
            ans.put(ch  , ans.getOrDefault(ch , 0)-1);
          
        }

        for(int count : ans.values()){
            if(count!=0){
                return false;
            }
        }
        return true;


        

        

    }
}
