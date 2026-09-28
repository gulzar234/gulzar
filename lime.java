import java.util.Scanner;

public class lime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int totalKopecks = (a * 100 + b) * n;

        System.out.println(totalKopecks / 100 + " " + totalKopecks % 100);
    }
}
