package HashMap;

import java.util.*;
class WordCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:- ");  
        String str=sc.nextLine();
        str=str.toLowerCase();
        String[] word=str.split("\\s+");
        Map<String,Integer> mp= new HashMap<>();

        for(String strnew:word){
            mp.put(strnew,mp.getOrDefault(strnew,0)+1);
        }
        System.out.println(mp);
    }
}
