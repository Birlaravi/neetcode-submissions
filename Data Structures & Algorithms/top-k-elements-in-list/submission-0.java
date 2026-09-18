class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> top = new HashMap<>();

        for (int n : nums) {
            top.put(n, top.getOrDefault(n, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(top.keySet());
        keys.sort((a, b) -> top.get(a) - top.get(b));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = keys.get(keys.size()-1-i);
        }
        return res;
    }
}
