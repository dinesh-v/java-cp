import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            if (s.contains("cookie cookie") || s.endsWith("cookie")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
