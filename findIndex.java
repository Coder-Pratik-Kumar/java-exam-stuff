import java.util.*;
class findindex{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int elemnt=3;

        int index=list.indexOf(elemnt);
        System.out.println("index of "+elemnt+" is "+index);
    }
}