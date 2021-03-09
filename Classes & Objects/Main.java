// Manjesh Prasad
// Feb 14, 2021

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int option = 0;
        int a;
        String b;

        char c = 'y';

        Scanner input = new Scanner(System.in);
        entity n = new entity();
        n.ChangeAll("Toyota", 4, 2004);
        while( c == 'y') {
            n.viewAll();
            System.out.println("\n\n1: Change Name ");
            System.out.println("2: Change Wheels");
            System.out.println("3: Change year");
            System.out.println("4: Quit");
            System.out.println("Please enter an option ");
            option = input.nextInt();
            switch (option) {
                case 1:                     // For changing the name of the car
                    System.out.println(" Please enter a new make ");
                    b = input.next();
                    n.changeCar(b);
                    break;

                case 2:                     // for changing the wheel of the car
                    System.out.println(" Please enter a new wheel ");
                    a = input.nextInt();
                    n.changeWheel(a);
                    break;
                case 3:
                    System.out.println(" Please enter a new year ");
                    a = input.nextInt();
                    n.changeyear(a);
                    break;
                case 4:
                    c = 'n';
                    break;
                default:
                    continue;
            }

            System.out.println("Have a nice day");
        }

    }
    }
