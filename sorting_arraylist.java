import java.util.*;
class sorting{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(9);
        list.add(20);
        list.add(6);
        // ascending order
        Collections.sort(list);
        System.out.println(list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}