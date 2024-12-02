import java.util.*;
class addelemenyt{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        list.add(2,5);
        System.out.println(list);
    }
}
