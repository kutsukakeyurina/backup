
public class Student {
 private String name=null;
 private int kokugo=0;
 private int sansu=0;

 public Student(){}

 public Student(String name,int kokugo,int sansu){
     this.name=name;
	 this.kokugo=kokugo;
	 this.sansu=sansu;
 }


 public String getName(){
	 return this.name;
 }
 public int getKokugo(){
	 return this.kokugo;
 }
 public int getSansu(){
	 return this.sansu;
 }
 public void setName(String name){
	 this.name=name;
 }
 public void setKokugo(int kokugo){
	 this.kokugo=kokugo;
 }
 public void setSansu(int sansu){
	 this.sansu=sansu;
 }

}
