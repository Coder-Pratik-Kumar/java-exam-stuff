    import java.util.*;

    class removedupli{
        public static void main(String[] args){
            ArrayList<Integer> list= new ArrayList<>();

            list.add(1);
                list.add(2);                    
                list.add(3);
                    list.add(4);
                    list.add(5);
                    list.add(6);

    for(int i=0;i<list.size();i++){
        if(list.get(i)%3!=0){
            list.remove(i);
        }
    }
    System.out.println(list);
        }
    }