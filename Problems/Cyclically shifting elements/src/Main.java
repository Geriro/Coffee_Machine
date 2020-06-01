import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] list = new int[n];

        for (int i = 1; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        list[0] = scanner.nextInt();

        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}