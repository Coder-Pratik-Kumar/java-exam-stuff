package HashMap;

import java.util.*;

class TwoSum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [] arr= {2,7,11,15};
        int target=9;

        int [] result=twosum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] twosum(int [] arr,int target){
        Map<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement= target-arr[i];

            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement),i};
            }
            mp.put(arr[i],i);
        }
        return new int[] {};
    }
}