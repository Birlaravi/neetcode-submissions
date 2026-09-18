class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> top = new HashMap<>();

        for (int n : nums) {
            top.put(n, top.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> prio = new PriorityQueue<>((a,b)-> top.get(a)-top.get(b));

        for(int a:top.keySet()){
            prio.add(a);
            if(prio.size()>k){
                prio.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0 ;i<k;i++){

           res[i]=prio.poll();

        }
        return res;
    }
}
