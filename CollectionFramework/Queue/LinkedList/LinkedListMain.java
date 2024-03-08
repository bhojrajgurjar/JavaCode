package Queue.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String ar[]){
        LinkedList<Integer> lst = new LinkedList<>();

        lst.add(111);
        lst.add(122);
        lst.add(133);
        lst.add(144);
        lst.add(155);
        //lst.forEach(System.out::println);
        for(Integer item:lst){
            System.out.println(item);
        }
        //Feature of Deque in LinkedList
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        lst.addFirst(166);
        lst.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        lst.addLast(177);
        lst.forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        lst.remove();
        lst.forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        lst.remove(3);
        lst.forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        lst.removeLast();
        lst.forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Result of Peek: "+lst.peek());
        System.out.println("Result of PeekFirsr: "+lst.peekFirst());
        System.out.println("Result of PeekLast: "+lst.peekLast());
        System.out.println("All elements of lst after peek operations");
        lst.forEach(System.out::println);


        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Result of Poll: "+lst.poll());
        System.out.println("Result of PollFirsr: "+lst.pollFirst());
        System.out.println("Result of PollLast: "+lst.pollLast());
        System.out.println("All elements of lst after poll operations");
        lst.forEach(System.out::println);

        


    }
}
