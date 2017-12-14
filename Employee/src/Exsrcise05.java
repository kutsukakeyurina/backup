
public class Exsrcise05 {

	public static void main(String[] args) {
		for(int i=0;i<30;i++){
			String u="-";
			System.out.print(u);
		}
		System.out.println();
		System.out.println("☆"+"社員名簿システム"+"☆");
		for(int i=0;i<30;i++){
			String u="-";
			System.out.print(u);
		}
		System.out.println();
		Employee s1=new Employee("矢沢 晃",5,28);
		Employee s2=new Employee("宮本 純子",10,33);
		Employee s3=new Employee("藤原 美和子",3,23);
		Employee s4=new Employee("土浦 巧",25,45);
		Employee s5=new Employee("野崎 りさ",18,38);
		Employee s6=new Employee("浅井 真治",8,31);

		s1.display();
		s1.line();
		s2.display();
		s2.line();
		s3.display();
		s3.line();
		s4.display();
		s4.line();
		s5.display();
		s5.line();
		s6.display();
		s6.line();
		Employee.showTotalNumber();

	}

}