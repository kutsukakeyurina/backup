
public class Goods {
private String name=null;
private int cost=0;
private double rate=0;

public Goods(){}

public Goods(String name,int cost){
	this.name=name;
	this.cost=cost;
}

public Goods(String name,int cost, double rate){
	this.name=name;
	this.cost=cost;
	this.rate=rate;
}

public String getName(){
	return this.name;
}
public double getRate(){
	return this.rate;
}
public int getCost(){
	return this.cost;
}
public int getPrice(){
	return this.getPrice();
}

public void setName(String name){
	this.name=name;
}
public void setRate(double rate){
	this.rate=rate;
}
public void setCost(int cost){
	this.cost=cost;
}

public void show(){
	System.out.println("商品名:"+this.name);
	System.out.println("税抜価格:"+this.cost);
	System.out.println("消費税率:"+this.rate);
	System.out.println("税込価格:"+(int)((1+this.rate)*this.cost));
}
}
