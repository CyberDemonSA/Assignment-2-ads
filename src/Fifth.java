import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a.isEmpty() || b.isEmpty()) {break;}
                if (Objects.equals(a.getFirst(), b.getFirst())) {
                    System.out.println(a);
                    System.out.println(b);
                    a.removeFirst();
                    b.removeFirst();
                }
                else {
                    System.out.println(a);
                    System.out.println(b);
                    b.add(b.getFirst());
                    b.removeFirst();
                }
            }
        }
        System.out.println(b.size());
    }
}