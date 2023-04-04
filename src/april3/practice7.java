package april3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice7 {
//맵을 받고 V는 넘버를 상속받음. 밸류 맥스값의 키값을 리턴 맵을 인자로 받음.

//인티저를 수퍼로 받는 리스트에서 가장 큰 값을 꺼내서 리턴. 리스트를 인자로 받음. 인트리턴

//맵에서 V는 숫자를 상속. 전체합을 리턴

// T리스트. T는 숫자를 상속. 리스트를 인자로 받음. sum을 리턴

    //두 리시트를 병합하고 공통 요소를 반환

    public static <T> List<T> gong(List<T> list, List<T> list2){
        List<T> aa = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list2.size();j++){

                if(list.get(i)==list2.get(j)){
                    aa.add(list.get(j));

                }
            }

        }

        return aa;

    }
    public static <T extends Number> double summm(List<T> list){

        double sum=0;
        for(int i=0;i<list.size();i++){

            sum+=list.get(i).doubleValue();

        }

        return sum;

    }

    public static  <K,V extends Number> double sum(Map<K,V> map){
        double sum = 0;
        for(Map.Entry<K,V> entry : map.entrySet()){
            sum+=entry.getValue().doubleValue();

        }
        return sum;

    }
    public static int maxx(List<? super Integer> llist){
int max = (int) llist.get(0);

for(int i=0;i<llist.size();i++){

    if(max<(int)llist.get(i)){
        max = (int)llist.get(i);

    }

}


        return max;
    }


    public static void main(String[] args) {

        List<Integer> ass = new ArrayList<>();
        ass.add(11);
        ass.add(166);

        ass.add(13);

        ass.add(53);
        System.out.println(practice7.maxx(ass)
        );
        System.out.println(practice7.summm(ass));

List<Integer> asss = new ArrayList<>();
asss.add(11);
        asss.add(3);

        asss.add(2);

        asss.add(166);

        System.out.println(practice7.gong(ass,asss));








        Map<Integer,Integer> map = new HashMap<>();
map.put(123,4);
        map.put(23,466);
        map.put(1,61);
        System.out.println(        practice7.max(map));
        System.out.println(practice7.sum(map));


    }

    public static <K,V extends Number> K max(Map<K,V> map){
        double max = Double.NEGATIVE_INFINITY;
        K keymax = null;
        V valmax = null;
        for(Map.Entry<K,V> a : map.entrySet()){
            if(a.getValue().doubleValue()>(double)max){
                max = (double)a.getValue().doubleValue();
                keymax = (K) a.getKey();
            }

        }

        return keymax;
    }
}
