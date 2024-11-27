import java.util.*;

class secoond{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);                            
        list.add(6);

        int largset=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num: list){
            if(num>largset){
                secondLargest=largset;
                largset=num;
            }else if(num>secondLargest && num!=largset){
                secondLargest=num;
            }
    }
    System.out.println(secondLargest);
    System.out.println(largset);
}
}