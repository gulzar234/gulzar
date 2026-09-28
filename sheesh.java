import java.util.Scanner;

public class sheesh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int minutes = 9 * 60 + n * 45 + (n / 2) * 5 + ((n - 1) / 2) * 15;

        System.out.println(minutes / 60 + " " + minutes % 60);
    }
}
