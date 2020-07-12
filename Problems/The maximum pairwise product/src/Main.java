import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = remplissage(scanner);



        int res = Integer.MIN_VALUE;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i - 1] * tab[i] > res) {
                res = tab[i - 1] * tab[i];
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