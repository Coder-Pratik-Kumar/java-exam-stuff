import java.util.*;

class duplicate{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        System.out.println(set);
    }
}