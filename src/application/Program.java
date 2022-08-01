package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Subject;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int quantityPeople = sc.nextInt();
		Subject[] vector = new Subject[quantityPeople];

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade:");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double hight = sc.nextDouble();
			vector[i] = new Subject(name, age, hight);
		}

		double sum = 0.0;
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i].getHight();
		}

		System.out.println("Altura m�dia: " + Subject.averageHight(sum, vector.length));
		//System.out.printf("Altura m�dia: %.2f%n" + Subject.averageHight(sum, vector.length));
		//System.out.printf("\nAltura media = %.2f\n" + Subject.averageHight(sum, vector.length));
		
		int count = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].getAge() < 16) {
				count++;
			}
		}

		System.out.println("Pessoas com menos de 16 anos: " + Subject.menorDe16(count, vector.length) + "%");

		for (int i = 0; i < vector.length; i++) {
			if (vector[i].getAge() < 16) {
				System.out.println(vector[i].getName());
			}
		}

		sc.close();

	}

}
