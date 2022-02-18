package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Turtle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Register your turtle's data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Age: ");
		int age = sc.nextInt();
		System.out.print("Size in centimeters: ");
		double sizeInCentimeters = sc.nextDouble();

		Turtle turtle = new Turtle(name, age, sizeInCentimeters);

		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Successfully registered turtle!!");
		System.out.println(turtle);
		System.out.println("----------------------------------");

	}
}
