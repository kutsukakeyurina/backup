
public class Exercise04 {

	public static void main(String[] args) {
		Student[] students=new Student[5];
		students[0]=new Student("織田信二",77,82);
		students[1]=new Student("小松里奈",40,97);
		students[2]=new Student("鈴木千佳",90,49);
		students[3]=new Student("筑井喜一",75,81);
		students[4]=new Student("野並由佳",71,72);


		int ktotal=0;
		int stotal=0;

		for(int i=0;i<students.length; i++){
			ktotal=ktotal+students[i].getKokugo();
			stotal=stotal+students[i].getSansu();
		}

		System.out.println("国語の合計点は"+ktotal);
		System.out.println("算数の合計点は"+stotal);

	}

}
