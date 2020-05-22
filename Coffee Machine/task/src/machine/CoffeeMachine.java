package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsN = scanner.nextInt();

        int cupW = water / 200;
        int cupM = milk / 50;
        int cupB = beans / 15;

        int cupsP = cupW < cupM ? (cupW < cupB ? cupW : cupB) : (cupM < cupB ? cupM : cupB);

        if (cupsP == cupsN) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsP > cupsN) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsP - cupsN) + "more than that)");
        } else {
            System.out.println("No, I can make only " + cupsP + "cup(s) of coffee");
        }



    }
}
