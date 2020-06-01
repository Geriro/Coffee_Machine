import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int[] list = new int[s];
        for (int i = 0; i < s; i++) {
            list[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int sum = 0;

        for (int val : list) {
            if (val > n) {
                sum += val;
            }
        }
        System.out.println(sum);
    }
}