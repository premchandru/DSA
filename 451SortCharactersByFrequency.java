class Solution {
   
    class Node{
        int count=0;
        char c;
    }
    
    public String frequencySort(String s) {
        
        char[]  c=s.toCharArray();
        
        Map<Character,Node> map =new  HashMap<Character,Node>();
        
        for(char cc:c){
            Node node=new Node();
            node = map.getOrDefault(cc,node);
            node.c=cc;
            node.count=node.count+1;
            map.put(cc,node);
        }
        
        List<Node> list=new ArrayList<Node>(map.values());
        
        Collections.sort(list,(a,b)->b.count-a.count);
        
        StringBuilder output=new StringBuilder();
          for(Node cccc:list){
              
              while(cccc.count--!=0){
                 output.append(cccc.c); 
              }
              
          }
        
        return output.toString();
    }
}