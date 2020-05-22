package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int machine[] = {400, 540, 120, 9, 550};

        etat(machine);

        System.out.println("Write action (buy, fill, take):");
        String action = getAction(scanner);

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int drink = getDrink(scanner);

                switch (drink) {
                    case 1:
                        machine = doDrink(machine, 250, 0, 16, 4);
                        break;

                    case 2:
                        machine = doDrink(machine, 350, 75, 20, 7);
                        break;

                    case 3:
                        machine = doDrink(machine, 200, 100, 12, 6);
                        break;

                    default:
                        System.out.println("Not a drink");
                }
                break;

            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int waterF = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int milkF = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int beansF = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int cupsF = scanner.nextInt();
                machine = fill(machine, waterF, milkF, beansF, cupsF);
                break;

            case "take":
                machine = take(machine);
                break;

            default:
                System.out.println("Not a good action");
        }

        etat(machine);
    }

    private static void etat (int[] list) {
        System.out.println("The coffee machine has:");
        System.out.println(list[0] + " of water");
        System.out.println(list[1] + " of milk");
        System.out.println(list[2] + " of coffee beans");
        System.out.println(list[3] + " of disposable cups");
        System.out.println(list[4] + " of money");
    }

    private static String getAction(Scanner scanner) {
        return scanner.nextLine();
    }

    private static int getDrink(Scanner scanner) {
        return scanner.nextInt();
    }

    private static int[] doDrink(int[] list, int waterp, int milkp, int beansp, int moneyp) {
        int[] listRes = list;

        list[0] -= waterp;
        list[1] -= milkp;
        list[2] -= beansp;
        list[3] -= 1;
        list[4] += moneyp;

        return listRes;
    }

    private static int[] fill(int[] list, int waterp, int milkp, int beansp, int cupsp) {
        int[] listRes = list;

        list[0] += waterp;
        list[1] += milkp;
        list[2] += beansp;
        list[3] += cupsp;

        return listRes;
    }

    private static int[] take(int[] list) {
        int[] listRes = list;

        list[4] = 0;

        return listRes;
    }






}
