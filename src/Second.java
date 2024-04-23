import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                a.add(x, y);
            }
            else if(query.equals("Delete")){
                int x = sc.nextInt();
                a.remove(x);
            }
        }
        System.out.println(a);
    }
}
