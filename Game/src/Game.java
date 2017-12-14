
public class Game {
  private String name=null;
  private int cost=0;
  private double rate=0;


  public Game(){}

  public Game(String name,int cost,double rate){
	  this.name=name;
	  this.cost=cost;
	  this.rate=rate;
  }


  public String getName(){
	  return this.name;
  }
  public int getCost(){
	  return this.cost;
  }
  public double getRate(){
	  return this.rate;
  }

  public void show(){
	  System.out.println("商品:"+this.name);
	  System.out.println("税抜価格:"+this.cost);
	  System.out.println("消費税:"+this.rate);
	  System.out.println("税込価格;"+(int)((1+this.rate)*this.cost));
  }
}
