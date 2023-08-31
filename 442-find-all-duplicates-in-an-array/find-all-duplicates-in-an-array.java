class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }

        return hashMap.entrySet().stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).toList();
    }
}