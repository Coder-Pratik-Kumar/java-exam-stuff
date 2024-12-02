package HashMap;
import java.util.*;
import java.util.Map.Entry;
class MergeHashMap{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer,String> mp1= new HashMap<>();
        mp1.put(1,"A");
        mp1.put(2,"B");
        mp1.put(3,"C");

        HashMap<Integer,String> mp2= new HashMap<>();
        mp2.put(4,"D");
        mp2.put(5,"E");
        mp2.put(6,"F");

        HashMap<Integer,String> mergeMap= MergedFunction(mp1,mp2);
        System.out.println(mergeMap);
    }
    static HashMap<Integer,String> MergedFunction(HashMap<Integer,String> mp1,HashMap<Integer,String> mp2){
        HashMap<Integer,String> mergedMap= new HashMap<>(mp1);
        for(Map.Entry<Integer, String> entry:mp2.entrySet()){
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return mergedMap;
    }
}