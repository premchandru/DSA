class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            int occ=map.getOrDefault(c,0)+1;
            map.put(c,occ);
        }
        
        int i=0;
        for(char c:s.toCharArray()){
               i++;
            if(map.get(c)==1){ 
                return i-1;
            }
        }
        return -1;
    }
}