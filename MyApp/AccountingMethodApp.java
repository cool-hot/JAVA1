
public class AccountingMethodApp {
	public static double Valueofsupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		Valueofsupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();
        
	}

	public static void print() {
		System.out.println("Value of supply : "+Valueofsupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
	}

	public static double getDividend1() {
		return getExpense() * 0.5;
	}

	public static double getDividend2() {
		return getExpense() * 0.3;
	}
	
	public static double getDividend3() {
		return getExpense() * 0.2;
	}
	public static double getIncome() {
		return Valueofsupply - getExpense();
	}

	public static double getExpense() {
		return Valueofsupply*expenseRate;
	}

	public static double getTotal() {
		return Valueofsupply+getVAT();
	}

	public static double getVAT() {
		return Valueofsupply*vatRate;
	}

}
