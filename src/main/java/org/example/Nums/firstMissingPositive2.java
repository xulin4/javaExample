package org.example.Nums;

public class firstMissingPositive2 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0||nums[i]>n){
                nums[i]=n+1;//为什么要设置为n+1
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0&&nums[i]<=n){
                nums[nums[i]-1]=-nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }


    public static void main(String[] args) {

    }
}
