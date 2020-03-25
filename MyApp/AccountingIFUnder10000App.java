
public class AccountingIFUnder10000App {
    
	public static void main(String[] args) {
		
		double Valueofsupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = Valueofsupply*vatRate;
		double total = Valueofsupply+vat;
		double expense = Valueofsupply*expenseRate;
		double income = Valueofsupply - expense;
		
		double diviend1 = (income) * 1;
		double diviend2 = (income) * 0;
		double diviend3 = (income) * 0;
		
		System.out.println("Value of supply : "+Valueofsupply);
        System.out.println("VAT : " + vat );
        System.out.println("Total : " + total );
		System.out.println("expense : " + expense );
        System.out.println("Income : " + income );
        System.out.println("Dividend 1 : " + diviend1 );
        System.out.println("Dividend 2 : " + diviend2 );
        System.out.println("Dividend 3 : " + diviend3 );
        
        
	}

}
