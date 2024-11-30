package HashMap;

import java.util.*;

class Anagram{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String 1:- ");
        String str1=sc.nextLine();
        System.out.println("Enter String 2:- ");
        String str2=sc.nextLine();

        boolean result=isAnagram(str1,str2);
        System.out.println(result);
    }
    static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        Map<Character,Integer> mp= new HashMap<>();

        for(char ch: str1.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch: str2.toCharArray()){
            if(!mp.containsKey(ch)){
                return false;
            }
            int count=mp.get(ch);
            if(count==1){
                mp.remove(ch);
            }else{
                mp.put(ch,count-1);
            }
        }
        return mp.isEmpty();
    }
}