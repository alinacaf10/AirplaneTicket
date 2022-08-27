package Airplane;

import java.util.Scanner;

public class Airplane_Ticket {

	public static void main(String[] args) {
		//price = distance * 0.10$
		//if passanger age bigger than 65 30% discount
		//if pass age smaller than 12 50% discount
		//if Flight type is return 20% discount
		
		int distance, type_flight, pas_age;
		double price;
		String city, pas_name, pas_surn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Which City You Go");
		city = sc.nextLine();
		System.out.println("Enter Distance of City(km)");
		distance = sc.nextInt();
		System.out.println("Type of Your Flight");
		System.out.println("1- One Way\n2- Return");
		type_flight = sc.nextInt();
		System.out.println("Enter Passangers Name");
		pas_name = sc.next();
		System.out.println("Enter Passangers Surname");
		pas_surn = sc.next();
		System.out.println("Enter Passangers Age");
		pas_age = sc.nextInt();
		if(distance>0&&pas_age>=0&&(type_flight==1||type_flight==2)) {
			System.out.println("Road to "+city);
			System.out.println("Name: "+pas_name+" "+pas_surn);
			System.out.println("Age: "+pas_age);
			if(type_flight==1) {
				System.out.println("Fligt type: One Way");
			}
			else if(type_flight==2) {
				System.out.println("Fligt type: Return");
			}
			System.out.println("Price calculating...");
			price=distance/10;
			if(type_flight==2) {
				price*=2;
				price=price-(price*0.2);
			}
			if(pas_age<12) {
				price=price/2;
			}
			else if(pas_age>=65) {
				price=price-(price*0.3);
			}
			System.out.println("Price: "+price+"$");
			
		}
		else {
			System.out.println("You entered wrong answer");
		}
	}

}
