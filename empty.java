import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

class empty{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        boolean ans=list.isEmpty();
        System.out.println(list);
        System.out.println(ans);

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        ans=list.isEmpty();
        System.out.println(ans);
    }
}