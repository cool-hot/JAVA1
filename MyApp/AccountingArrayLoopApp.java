
public class AccountingArrayLoopApp {
    
	public static void main(String[] args) {
		
		double Valueofsupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = Valueofsupply*vatRate;
		double total = Valueofsupply+vat;
		double expense = Valueofsupply*expenseRate;
		double income = Valueofsupply - expense;
		
		
		
		System.out.println("Value of supply : "+Valueofsupply);
        System.out.println("VAT : " + vat );
        System.out.println("Total : " + total );
		System.out.println("expense : " + expense );
        System.out.println("Income : " + income );
        
        double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		int i = 0;
		while(i < dividendRates.length) {
            System.out.println("Dividend : " + (income*dividendRates[i]) );
            i = i + 1;
        }     
		
	
	}
	
}