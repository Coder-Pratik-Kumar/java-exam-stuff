import java.util.*;
class arrayToArrayList{
    public static void main(String[] args) {
        Integer [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}