import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println(q);
    }
}