import java.util.*;

class common{
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list1.add("Pratik");
        list1.add("Sagar");
        list1.add("Raj");
        list1.add("Aman");

        list2.add("Raj");
        list2.add("Sagar");
        list2.add("Mayank");
        list2.add("Yash");

        List<String> anslist= new ArrayList<>(list1);
        anslist.retainAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(anslist);
    }
}