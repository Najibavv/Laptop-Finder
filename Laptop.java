/*Eatemad sameer
201615968
Aseel Ibrahim  Al-Yanbawi
201808129
Ghada fahad
201715089
Samer Seif
28/11
*/
import java.lang.Math;
public abstract class Laptop{

private String laptopName, category;
int ram,ssd;
String core;
double price; 


public Laptop(){
}

    public Laptop(String laptopName,int ram,String core, int ssd,double price){
    	
 this.laptopName=laptopName;
 
 this.ram=ram;
 this.core=core;
 this.ssd=ssd;
 this.price=price;
    }
    
    
    public void setCatagory(String c ){
    	category=c;
    }
    
    public String getCatagory(){
    	return category;
    }
     
    public void setLapName(String n ){
    	laptopName=n;
    }
    public String getLaptopName(){
    	return laptopName;
    }
    
     public double getLaptopPrice(){
    	return price;
    }
    
    public double converCurrency(){
    	double converted;
    	converted=price*3.75;
    	
    	return Math.round(converted);
    	
    }
    public abstract void displayLaptop(double d);
    
    
    public String toString(){
    	return " Laptop name "+getLaptopName()+"|| catagory is: "+getCatagory()+"||\nRam: "+ram+" GB ||SSD: "+ssd+" ||core: "+core+" ||price: $"+price;
    }
    
    }
    
  