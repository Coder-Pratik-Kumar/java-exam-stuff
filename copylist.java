import java.util.*;
class copylist{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
System.out.println(list);

        ArrayList<Integer> listnew=new ArrayList<>(list);
        System.out.println(listnew);
    }
}