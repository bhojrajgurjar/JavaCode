package List.ArrayList.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import List.ArrayList.pojo.*;



public class Main {
    public static void main(String ar[]){
        List<Engine> lstEngines = new ArrayList<>();
        //List<Engine> lstEngines = new LinkedList<>();    //NO Major difference Use
                                                     //When changes are more (writing work)
                                                       // for better performance
        
        Engine e1 = new Engine(1200,"petrol");
        Engine e2 = new Engine(800,"cng");
        Engine e3 = new Engine(1500,"diesel");
        Engine e4 = new Engine(1300,"petrol");

        lstEngines.add(e1);
        lstEngines.add(e2);
        lstEngines.add(e3);
        lstEngines.add(e4);

        System.out.println("All Engine from lstEngines are: ");

        for(Engine item:lstEngines){
            System.out.println(item);
        }

        System.out.println("Engine present at index 2 in lstEngines is "+lstEngines.get(2));

        Engine e5 = new Engine(1700,"diesel");

        System.out.println("Is e5 present int lstEngines: "+lstEngines.contains(e5));

        System.out.println("e5 present at index: "+lstEngines.indexOf(e5));

        lstEngines.add(e5);
        System.out.println("e5 present at index: "+lstEngines.indexOf(e5));

        //lstEngines.remove(e5);
        System.out.println(lstEngines.remove(4));

        lstEngines.forEach(System.out::println);

        Engine e6 = new Engine(900,"cng");

        lstEngines.set(0,e6);
        System.out.println("....................");

        Iterator<Engine> it = lstEngines.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("..................");
        //array to list
        Integer[] arr = {11,22,33,44,55};
        List<Integer> lst1 = Arrays.asList(arr);
        System.out.println("All elements from lst1: ");
        lst1.forEach(System.out::println);

        System.out.println("......................");
        //List to arrray
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(100);
        lst2.add(200);
        lst2.add(300);
        lst2.add(400);
        lst2.add(500);

        Object[] arr2 = lst2.toArray();
        System.out.println("All elements from arr2: ");
        for(Object obj :arr2){
            System.out.println(obj);
        }
    }
    
}
