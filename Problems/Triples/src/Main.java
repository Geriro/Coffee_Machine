import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = remplissage(scanner);
        int res =  0;
        for (int i = 0; i < tab.length - 2; i++) {
            if (tab[i] + 1 == tab[i + 1] && tab[i] + 2 == tab[i + 2]) {
                res++;
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