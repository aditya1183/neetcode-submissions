class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    //     // first we build one fre map that contains   the  number and freq

    //     HashMap<Integer , Integer> freqMap= new HashMap<>();
    //     for(int num : nums){
    //         freqMap.put(num , freqMap.getOrDefault(num , 0)+1);
    //     }

    //     // build  min heap

    // PriorityQueue<int[] > heap =new PriorityQueue<>( (a, b) ->           a[0]- b[0]);
    //     for(Map.Entry<Integer , Integer> entry :  freqMap.entrySet()){
    //         heap.add(new int[]{entry.getValue() , entry.getKey()});
    //         if(heap.size() > k){
    //             heap.poll();
    //         }

    //     }
    //     int[] ans =new int[k]; // result array 

    //     for(int i=0 ; i < k  ; i++){
    //          ans[i] = heap.poll()[1];
    //     }
    //     return ans;
        















        // first we store all the freq of array 

        HashMap<Integer , Integer  > freqMap=new HashMap<>();

        for(int num : nums){
            freqMap.put(num ,  freqMap.getOrDefault(num , 0)+1);
        }

        // now we need to build min heap for  this  to  maintain the k freq element in the array

PriorityQueue<int[]> minHeap=new PriorityQueue<>((a, b)->a[0]-b[0]);


    for(Map.Entry<Integer , Integer> map : freqMap.entrySet()){
        minHeap.add(new int[]{map.getValue() , map.getKey()});
        if(minHeap.size()> k){
            minHeap.poll();
        }
    }


    int[] ans=new int[k];
    for(int i=0 ; i<k; i++){
        ans[i]=minHeap.poll()[1];
    }
    return ans;


        
    }
}
