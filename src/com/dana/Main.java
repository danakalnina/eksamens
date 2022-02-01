package com.dana;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {

    private static List<String> currentList = new ArrayList<String>();

    public static void main(String[] args) {


        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = izvēlne();
            switch (menuItem) {

                case 1:
                    rādītSarakstu();
                    break;

                case 2:
                    pievienotDarbību();
                    break;

                case 3:
                    dzēstDarbību();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Mēģiniet citu darbību!");



            }
        }
    }


    public static int izvēlne() {


        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("\n Galvenā izvēlne \n");
        System.out.println("0. iziet no aplikācijas");
        System.out.println("1. Parādīt darāmo darbu sarakstu ");
        System.out.println(" 2. Pievienot darbību");
        System.out.println("3. Izdzēst darbību");
        System.out.println("Izvēlaties opciju");
        choice = input.nextInt();
        return choice;

    }



    // sākas mans saraksts


    public static void rādītSarakstu() {
        System.out.println();
        System.out.println("----------------");
        System.out.println("Darāmo darbu saraksts");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("-------------");
    }



   // pievienot sarakstam darbību


    public static void pievienotDarbību() {
            System.out.println("Pievienojiet darbību");
            System.out.println("Ievadiet darbību");
            Scanner scanner = new Scanner(System.in);
            String item = scanner.nextLine();
            currentList.add(item);
            rādītSarakstu();

        }

        // izdzēst darbību no saraksta


        public static void dzēstDarbību() {
            System.out.println("Dzēst darbību");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kuru darbību vēlaties dzēst?");
            int index = scanner.nextInt();
            if ((index - 1) < 0 || index > currentList.size()) {
                System.out.println("Nepareiza darbība, lūdzu, ievadiet ciparu no 1-3");

            } else {
                currentList.remove(index - 1);
            }
            rādītSarakstu();
        }
    }









