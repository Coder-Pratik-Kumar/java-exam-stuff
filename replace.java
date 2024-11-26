import java.util.*;

class replace{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
System.out.println(list);
        int value=2;
        int replace=10;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==value){
                list.set(i,replace);
            }
            }
        System.out.println(list);
    }
}