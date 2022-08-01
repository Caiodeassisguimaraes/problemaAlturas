package entities;

public class Subject {
	private String name;
	private int age;
	private double hight;

	// Construtores
	public Subject(String name, int age, double hight) {
		super();
		this.name = name;
		this.age = age;
		this.hight = hight;
	}

	// Metodos get e Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	// Metodos
	
	public static double averageHight (double sum, int quantityPeople) {
		double average = sum / quantityPeople;
		return average;
	}

	public static double menorDe16(int count, int quantityPeople) {
		double percent = count*100/quantityPeople;
		return percent;
	}

}
