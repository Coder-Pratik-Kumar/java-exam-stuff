package HashMap;
import java.util.*;
class DistictKsize{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr={1,2,1,3,4,2,3};
        int k=4;
        ArrayList<Integer> list=distinct(arr,k);
        System.out.println(list);
    }
    static ArrayList<Integer> distinct(int [] arr,int k){
        ArrayList<Integer> result= new ArrayList<>();
        Map<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<k;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        result.add(mp.size());

        for(int i=k;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);

            int oldElement=arr[i-k];

            if(mp.get(oldElement)==1){
                mp.remove(oldElement);
            }else{
                mp.put(oldElement,mp.get(oldElement)-1);
            }
            result.add(mp.size());
        }
        return result;
    }
}