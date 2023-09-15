package fabrikaMaasHesaplama;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		if (this.salary >= 1000) {
			return salary * 0.03;
		}

		return salary;

	}

	double bonus() {
		if (this.workHours > 40) {

			return (this.workHours - 40) * 30;
		}
		return 0;
	}

	double raiseSalary() {
		int currentYear=2021;
		int yearsWorked=currentYear-hireYear;
		
		if (yearsWorked < 10) {
			return salary * 0.05;
		} else if (yearsWorked> 9 && yearsWorked < 20) {
			return salary * 0.10;
		} else if (yearsWorked > 19) {
			return salary * 0.15;
		}
		return 0;
	}

	public String toString() {
		return "Adı : " + name +
				"\nMaaşı : " + salary +
				"\nÇalışma Saati : " + workHours +
				"\nBaşlangıç yılı : "+ hireYear + 
				"\nVergi : " + tax() + 
				"\nBonus : " + bonus() + 
				"\nMaaş Artışı : " + raiseSalary()+ 
				"\nVergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) + 
				"\nToplam Maaş : "+ (salary + raiseSalary());
	}

}
