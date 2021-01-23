
import java.util.Scanner;
public class LaptopFinder{
        
   
    public static void main(String[] args) {
    	
    	int profission;
    	String city;
        String answer;
        
        Scanner input=new Scanner(System.in);
        System.out.println("******************");
        System.out.println("The system is called Laptop finder helps you find the right laptop for you");
        System.out.println();
        System.out.println("What do you do?");
        System.out.println("1-Im a programmer");
        System.out.println("2-Im a gamer");

        profission=input.nextInt();
        
        System.out.println("Enter your budget in dollars :");
        double budget=input.nextDouble();
        
        switch(profission){
        	
        	case 1:
        		ProgrammingLaptop p=new ProgrammingLaptop();
        		p.displayLaptop(budget);
        		System.out.println("Result: "+p.toString());
        		
        	    System.out.println("The prices are displayed in dollars would you like to convert it into riyals?");
        		answer=input.next();
        		if(answer.equalsIgnoreCase("yes"))
        		System.out.println("the price will be: "+p.converCurrency()+" SAR");	
        		System.out.println("Enter your city to view places that sell the resulted laptop");
                city=input.next();
                p.printSellingPlaces(city);
                System.out.println("Or you can easily order it from the following websites");
                p.printWebsites();
        		break;
        		
        			
        	
        		
        	case 2:
        		GamingLaptop g=new GamingLaptop();
        		g.displayLaptop(budget);
        		System.out.println("Result: "+g.toString());
        		System.out.println();
        		 System.out.println("The prices are displayed in dollars would you like to convert it into riyals?");
        		 answer=input.next();
        		 if(answer.equalsIgnoreCase("yes"))
        		 System.out.println("the price will be: "+g.converCurrency()+" SAR");	
        		
        		System.out.println("Enter your city to view places that sell the resulted laptop");
                city=input.next();
                g.printSellingPlaces(city);
                System.out.println("Or you can easily order it from the following websites");
                g.printWebsites();
        		break;
        }
        
       
        
        
        
        
        
    }
}
