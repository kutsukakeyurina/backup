package test2;

public class Switch {

	public static void main(String[] args) {

		int a=1;

		switch(a){
		case 0:
			System.out.println("aは0に等しい");
		break;

		case 1:
			System.out.println("aは1に等しい");
			break;
		}


		int a1=5;

		switch(a1){
		case 0:
			System.out.println("a1は0に等しい");
			break;

		case 1:
			System.out.println("a1は1に等しい");
			break;

		default:
			System.out.println("a1は0でも1でもない");
		}


		String a2="赤";

		switch(a2){
		case "赤":
			System.out.println("赤組です");
			break;

		case "白":
			System.out.println("白組です");
			break;
		}


		String a3="青";

		switch(a3){
			case "黄":
			System.out.println("黄組です");
		        break;

			case "緑":
				System.out.println("緑組です");
				break;

				default:
					System.out.println("エラーです");
	}
		
		
		
		

	}
}
