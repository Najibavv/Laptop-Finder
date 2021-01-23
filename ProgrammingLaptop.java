
public class ProgrammingLaptop extends Laptop implements Places{
 
 
 
    public ProgrammingLaptop() {
    }
    
    public void displayLaptop(double d){
    	if((d>=500)&&(d<=600)){
    		setCatagory("Programming Laptop");
     		setLapName("HP 15-dy1036nr");
     			price=550.99;
     			ram=8;
     			core="i5";
     			ssd=265;
    		  }
    		  
    		  else if((d>=600)&&(d<=700)){
    		  	
    		  	setCatagory("Programming Laptop");
     		setLapName("Acer Aspire 5");
     			price=683.23;
     			ram=8;
     			core="i5";
     			ssd=518;
    		  }
    		  
    		   else if((d>=700)&&(d<=800)){
    		  	
    		  	setCatagory("Programming Laptop");
     		setLapName("Lenovo Flex 5");
     			price=720.23;
     			ram=16;
     			core="i5";
     			ssd=256;
    		  }
    		  
    		  else
    		  	System.out.println("We couldnt find the right laptop for you");
 
}

 public void printSellingPlaces(String city){
 	
 	if(city.equalsIgnoreCase("Hail"))
     		System.out.println("You can find this laptop in jarir and extra");
     		
     		else if(city.equalsIgnoreCase("Riyadh"))
     		System.out.println("you can find this laptop in Jarir, Extra, lulu market and version mega store");
     		
     		else if(city.equalsIgnoreCase("Jeddah"))
     			System.out.println("You can find this laptop in California Computer Systems, Extra and Jarir");
 	
 }
   
    public void printWebsites(){
    	System.out.println();
    	System.out.println("These are the websites that you can get the laptop from");
    	System.out.println("https://www.jarir.com/");
    	System.out.println("https://www.extra.com/ar-sa");
    	System.out.println("https://www.amazon.com/");
    	
    }

}