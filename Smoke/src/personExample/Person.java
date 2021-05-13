package personExample;

import java.util.ArrayList;

public class Person {

	//fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;
	// Creem les dues variables necessàries 
	public double money;
	public int tobaccoPacket;
	public ArrayList<Expense> expenses;
	public String haveaLighter;
	
	
	//Constructor from Person Class
	public Person() {
		
	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary) {
		
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
		this.expenses = new ArrayList<Expense>();
		//double yearNetSalary = 0.0;
		
		
	}

	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	// Nou constructor 
	public Person(String name, int age, double money, int tobaccoPacket) {
		
		this.name = name;
		this.age = age;
		this.money = money;
		this.tobaccoPacket = tobaccoPacket;
		
	}

	//Methods from Person Class
	
	public void becomeOlder () {
		
		this.age = age + 1;
	}
	
	public double yearNetSalary() {

		double yearNetSalary = 0.0;

		// first i must check weather THIS object have got money
		// this.basicSalary > 1
		if (this.basicSalary > 1) {

			yearNetSalary = this.basicSalary * 14;

			if (this.age > 30) {
				yearNetSalary = yearNetSalary * 0.88;
			} else {
				yearNetSalary = yearNetSalary * 0.94;
			}

		} else {
			System.out.println(name + " has not got any salary, so YearNetSalary not available!");
		}

		return yearNetSalary;
	}
	
public double calculateExpenses (int month) {
		
		double expensesMonth = 0.0;
		
		for (Expense expense : this.expenses) {
			
			if (expense.getDate().getMonth() ==  month ) 
				expensesMonth = expensesMonth + expense.getValue();
			
		}
		
		
		return expensesMonth;
	}
	
	public boolean isAdult(int age) {
		
		if( age >= 18) {
			System.out.println("Ets major d'edat");
		
			return true;
		}
			System.out.println("Ets menor d'edat");
			return false;
	}
	
	
	public boolean tobaccoBuy(int tobaccoPacket) {
		if( (isAdult(age) == true) && (money >= 5 * tobaccoPacket)) {
			
			tobaccoPacket ++;
			money -= 5;
			System.out.println(" Pots comprar tabac i et queden " + money );
			return true;
		}
			System.out.println("No pots comprar tabac");
			return false;
		}
	
	
	public boolean haveaLighter() {
		if( haveaLighter.equals("Si")) {
	System.out.println ("puc fumar!");
	boolean haveaLighter= false;
	return true;
		}
		System.out.println("No puc fumar");
		return false;
	}
	
	public boolean smoking () {
		if( tobaccoPacket > 0) {
			System.out.println("Estic fumant");
			tobaccoPacket --;
			return true;
		}
		System.out.println("No puc fumar");
			return false;
	}
	
	
	
	
	//Getters and Setters and toString	
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
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getTobaccoPacket() {
		return tobaccoPacket;
	}

	public void setTobaccoPacket(int tobaccoPacket) {
		this.tobaccoPacket = tobaccoPacket;
	}

	//toString
	@Override
	public String toString() {
		return "Person Fields: (name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth + ", basicSalary="
				+ basicSalary + "money= " + money + "tobaccoPacket =" + tobaccoPacket + ")";
	}
	
	
	
	
	
	
}
