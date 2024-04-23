import java.util.Scanner;

public class Fourth {
    public static void reverseOrder(String a, int n){
        if (n != 0){
            int a = sc.nextInt();
            reverseOrder(n-1, sc);
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = a.length();
        reverseOrder(a, n-1);
    }
}