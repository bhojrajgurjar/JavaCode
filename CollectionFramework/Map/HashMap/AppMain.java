package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AppMain{
    public static void main(String ar[]){
        Map<Integer,String> hmap = new HashMap<>();

        hmap.put(123, "Abhishek");
        hmap.put(124, "Bharat");
        hmap.put(125, "Bhawesh");
        hmap.put(126, "chetan");

        System.out.println("All entries of hmap are..");
        Set<Entry<Integer,String>> eset = hmap.entrySet();

        for(Entry<Integer,String> e:eset){
            System.out.println(e.getKey()+" : " +e.getValue());
        }

        System.out.println("++++++++++++++++ ALL Keys +++++++++++++++=");
        Set<Integer> kset = hmap.keySet();
        for(Integer k:kset){
            System.out.println("key: "+k);
        }

        System.out.println("Person present at 124 :"+hmap.get(124));

        System.out.println("Is Contain key 121: "+hmap.containsKey(121));
        System.out.println("Is Contain value Ram: "+hmap.containsValue("Ram"));

        hmap.remove(123);
        hmap.remove(125,"Bhawesh");
        System.out.println("+++++++++++++++ hmap after removal operation  +++++++++++++++++++++==");
        eset=hmap.entrySet();      // intialize updated hmap.entrySet()

        for(Entry<Integer,String> entry:eset){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    
}
//In case of TreeMap, entries get sorted in ascending order on basis of key