package HashMap;
import java.util.*;

class frequencyCharacter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string:- ");
        String str=sc.nextLine();

        Map<Character,Integer> map= new HashMap<>();

        for(Character ch:str.toCharArray()){
            if(ch!=' '){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(map);
    }
}