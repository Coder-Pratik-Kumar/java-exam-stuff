import java.util.ArrayList;

class maximum{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        int max=list.get(0);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)<list.get(j)){
                    max=list.get(j);
                }
            }
        }
        System.out.println(max);
    }
}