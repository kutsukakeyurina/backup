package test2;

public class For {

	public static void main(String[] args) {

		for(int a=0; a<=3; a++){
			for(int b=1; b<4; b++){
				System.out.print(b);
			}
			System.out.print("\n");
		}


		int a1=2;

		String b=a1%2==0?"偶数":"奇数";
		System.out.println(b);



		for(int i=0;i<=5; i++){
        String b1="☆";
        System.out.print(b1);
		}
	}

}