package HashMap;
import java.util.*;

class intersection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr1={1,2,2,1,3};
        int [] arr2={2,2,3};

        ArrayList<Integer> list=intersection(arr1,arr2);
        System.out.println(list);
    }
    static ArrayList<Integer> intersection(int [] arr,int [] arr2){
        ArrayList<Integer> list= new ArrayList<>();
        Map<Integer,Integer> mp= new HashMap<>();

        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num:arr2){
           if(mp.containsKey(num) && mp.get(num)>0){
            list.add(num);
            mp.put(num,mp.get(num)-1);
           }
        }
        return list;
    }
}