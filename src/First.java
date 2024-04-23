import java.util.Scanner;
import java.util.ArrayList;
public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            ArrayList<Integer> b = new ArrayList<>();
            for (int j = 0; j < n1; j++) {
                b.add(sc.nextInt());
            }
            a.add(b);
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < a.get(i).size(); j++) {
//                System.out.print(a.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
        System.out.println();
        int nq = sc.nextInt();
        for (int i = 0; i < nq; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(a.get(x-1).get(y-1));
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        System.out.println("AAA");

    }
}