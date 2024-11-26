import java.util.*;
class arraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list= new ArrayList<>();

        // add the elements inb arrayList
        System.out.println("Enter the value for arrayListt:- ");
        int value= sc.nextInt();

        for(int i=0;i<value;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        // get the lements in arraylist
        System.out.println("Enter the index for get the value:- ");
        int index= sc.nextInt();
        System.out.println(list.get(index));

        //  remove the element in arraylist
        System.out.println("Enter the index for remove the value:- ");
        int rm= sc.nextInt();
        list.remove(rm);
        System.out.println(list);

        // search element in arraylist
        System.out.println("enter the target element:- ");
        int target= sc.nextInt();
        if(list.contains(target)){
            System.out.println("element is found..");
        }else{
            System.out.println("not found..");
        }
    }
}