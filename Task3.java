import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(5);
        hs.add(6);
        hs.add(6);
        hs.add(3);
        hs.add(8);
        hs.add(8);

        System.out.println(hs);
    }
}