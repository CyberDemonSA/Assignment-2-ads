import java.util.Scanner;

public class Fourth {
    public static void reverseOrder(String s, int n) {
        if (n!=-1) {
            System.out.print(s.charAt(n));
            reverseOrder(s, n-1);
//            System.out.print(s.charAt(n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseOrder(s, s.length() - 1);
        sc.close();
    }
}
