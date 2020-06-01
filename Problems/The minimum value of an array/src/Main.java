import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = remplissage(scanner);



        int res = Integer.MAX_VALUE;
        for (int val : tab) {
            if (val < res) {
                res = val;
            }
        }

        System.out.println(res);

    }

    public static int[] remplissage(Scanner scanner) {
        int taille = scanner.nextInt();
        int[] tab = new int[taille];



        for (int i = 0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        return tab;
    }
}