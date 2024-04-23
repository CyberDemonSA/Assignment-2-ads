import java.util.ArrayList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1){
                int y = sc.nextInt();
                a.addFirst(y);
            }
            if (x == 2){
                int y = sc.nextInt();
                a.add(y);
            }
            if (x == 3){
                System.out.println(a.getFirst());
//                a.removeFirst();
            }
            if (x == 4){
                System.out.println(a.getLast());
//                a.remove(a.size()-1);
            }
        }
    }
}
