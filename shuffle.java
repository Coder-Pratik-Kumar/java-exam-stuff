import java.util.*;
class shuffle{
    public static void main(String[] args) {
            ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}