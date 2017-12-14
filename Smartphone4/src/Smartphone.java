
public class Smartphone {
   private String name=null;
   private int price=0;

   public Smartphone(){}

   public Smartphone(String name){
	   this.name=name;
   }
   public Smartphone(int price){
	   this.price=price;
   }
   public Smartphone(String name,int price){
	   this.name=name;
	   this.price=price;
   }
   public Smartphone(int price,String name){
	   this.price=price;
	   this.name=name;
   }


   public String getName(){
	   return this.name;
   }
   public int getPrice(){
	   return this.price;
   }
}
