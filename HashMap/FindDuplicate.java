package HashMap;
import java.util.*;

class findDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr= {1,2,3,2,3,4,5};
        Map<Integer, Integer> mp= new HashMap<>();

        for(int num: arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();

        for(int key:mp.keySet()){
            if(mp.get(key)>1){
                list.add(key);
            }
        }
        System.out.println(list);
    }
}