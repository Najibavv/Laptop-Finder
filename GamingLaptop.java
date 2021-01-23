
public class GamingLaptop extends Laptop implements Places{

   
public  GamingLaptop(){
 } 
    
     public void displayLaptop(double p){
     	if((p>=800)&&(p<=900)){
     	
     		setCatagory("Gaming Laptop");
     		setLapName("Dell G5 15");
     			price=849.99;
     			ram=16;
     			core="i7";
     			ssd=512;
     			}
     			
     				  
    		  else if((p>=900)&&(p<=1000)){
    		  	
    		  	setCatagory("Gaming Laptop");
     		setLapName("MSI GF63 8RB");
     			price=900;
     			ram=4;
     			core="i7";
     			ssd=256;
    		  }
    		  
    		   else if((p>=1000)&&(p<=1500)){
    		  	
    		  	setCatagory("Gaming Laptop");
     		setLapName("Lenovo Legion Y545");
     			price=1200.5;
     			ram=16;
     			core="i7";
     			ssd=518;
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
     			System.out.println("You can find this laptop in California Computer Systems, and Jarir");
     	
     	
     	
     }
    
     public void printWebsites(){
     	System.out.println();
    	System.out.println("These are the websites that you can get the laptop from");
    	System.out.println("https://www.jarir.com/");
    	System.out.println("https://www.amazon.com/");
    	
    }
}