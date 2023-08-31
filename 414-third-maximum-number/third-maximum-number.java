class Solution {
    public int thirdMax(int[] nums) {
         long Max1 = Long.MIN_VALUE;
        long Max2 = Long.MIN_VALUE;
        long Max3 = Long.MIN_VALUE;

        for(int num : nums){
            if(num>Max1){
                Max3 = Max2;
                Max2 = Max1;
                Max1 = num;
            }
            else if(num>Max2 && num<Max1){
                Max3 = Max2;
                Max2 = num;
            }
            else if(num>Max3 && num<Max2){
                Max3 = num;
            }
        }
        return (Max3==Long.MIN_VALUE) ? (int)Max1: (int)Max3;
    }
}