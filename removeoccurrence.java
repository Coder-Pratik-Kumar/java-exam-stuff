import java.util.*;
class removeoccur{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        int element=2;
        list.removeIf(n -> n==element);
        System.out.println(list);
    }
}