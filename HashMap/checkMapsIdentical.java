package HashMap;
import java.util.*;
class checkMapsIdentical{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> mp1= new HashMap<>();
        mp1.put("apple",1);
        mp1.put("banana",2);
        mp1.put("orange",3);

        HashMap<String,Integer> mp2= new HashMap<>();
        mp2.put("apple",1);
        mp2.put("banana",2);
        mp2.put("orange",3);

        boolean result=checkIdentical(mp1,mp2);
        System.out.println(result);
    }
    static boolean checkIdentical(HashMap<String,Integer>mp1,HashMap<String,Integer>mp2){
        if(mp1.size()!=mp2.size()){
            return false;
        }
        else if(mp1.equals(mp2)){
            return true;
        }
        else{
            return false;
        }
    }
}