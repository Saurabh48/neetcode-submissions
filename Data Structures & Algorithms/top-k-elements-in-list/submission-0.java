class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int a : nums) {
            mp.put(a, mp.getOrDefault(a, 0)+1);
        }
        List<Integer>[] freq = new List[n+1];
        for(int i = 0;i<=n;i++) freq[i] = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        for(int i = n, j=0;i>=0 && j < k ;i--) {
            for(int p : freq[i]) {
                res[j++] = p;
                if(j == k) return res;
            }
        }
        return res;
    }
}
