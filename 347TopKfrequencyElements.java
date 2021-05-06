
class Solution {
    static class Pair{
    
    int value = 0;
    int frq = 0;
    public Pair(int value, int frq){
        this.frq=frq;
        this.value=value;
    }
    
}

    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums == null || nums.length==0)
             return new int[0];
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int value:nums){
            int frq = map.getOrDefault(value,0)+1;
            map.put(value,frq);
        }
        
       
        int first = 0;
        int sec = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.frq-b.frq);
        
        for(int key: map.keySet()){
            if( pq.size()==k+1) pq.poll();
            pq.add(new Pair(key,map.get(key)));
        }
           if( pq.size()==k+1)
             pq.poll();   
        
        int[] output = new int[k];
        
        while(k!=0 && !pq.isEmpty()){
            int value = pq.poll().value;
            System.out.println(value);
            
           output[--k] =  value;
        }
        return output;
    }
}