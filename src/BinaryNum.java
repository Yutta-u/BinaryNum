import java.util.Scanner;

public class BinaryNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long x = 1;
        long b = 1;
        long c = 0;
        while (b * x <= a) {
            c = b * x;
            b = b * 2;
        }
        if (a == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
