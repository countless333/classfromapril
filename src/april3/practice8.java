package april3;

import java.util.ArrayList;
import java.util.List;

public class practice8 {

    public static void main(String[] args) {

        List<Integer> ass = new ArrayList<>();
        ass.add(11);
        ass.add(166);

        ass.add(13);

        ass.add(53);


        List<Integer> asss = new ArrayList<>();
        asss.add(11);
        asss.add(3);

        asss.add(2);

        asss.add(166);

        System.out.println(practice8.gong(ass,asss));

    } public static <T> List<T> gong(List<T> list, List<T> list2){
        List<T> aa = new ArrayList<>();

        for(int i=0;i<list.size();i++){
           if(list2.contains(list.get(i))){
               aa.add(list.get(i));
            }

        }

        return aa;

    }
}
