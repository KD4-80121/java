package foodMenu;

import java.util.Scanner;

public class foodMenu {
	public static void main(String[] args) {
		int choice;
		double bill = 0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("EXIT PREES 0");
		System.out.println("1 DOSA");
		System.out.println("2 SAMOSA");
		System.out.println("3 IDLI");
		System.out.println("GENERATE BILL");
		System.out.print("ENTER THE CHOICE");
		choice = sc.nextInt();
		
			switch (choice) {
			case 1:
				System.out.println("YOU ORDERED DOSA");
				bill += 20;
				break;
			case 2:
				System.out.println("YOU ORDERED SAMOSA");
				bill += 10;
				break;
			case 3:
				System.out.println("YOU ORDERED SAMOSA");
				bill += 10;
				break;

			case 4:
				System.out.println("YOU BILL IS = " + bill);

				break;
			default:
				System.out.println("PLEASE ENTER THE VALID CHOICE.....):");
				break;

			}
		}while(choice!=0);
	}
}
