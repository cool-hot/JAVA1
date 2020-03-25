
public class MyClass {

	public static void main(String[] args) {
		
		String remind = "I will be king of Java!";
        String[] words = remind.split("\\s");
        
        for (String wor : words ) {
            System.out.println(wor);
        }
        
        System.out.println("\n\n"+words.length+" words");
		
        
       
      
	}

}
