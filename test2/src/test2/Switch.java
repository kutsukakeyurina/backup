package test2;

public class Switch {

	public static void main(String[] args) {

		int a=1;

		switch(a){
		case 0:
			System.out.println("a��0�ɓ�����");
		break;

		case 1:
			System.out.println("a��1�ɓ�����");
			break;
		}


		int a1=5;

		switch(a1){
		case 0:
			System.out.println("a1��0�ɓ�����");
			break;

		case 1:
			System.out.println("a1��1�ɓ�����");
			break;

		default:
			System.out.println("a1��0�ł�1�ł��Ȃ�");
		}


		String a2="��";

		switch(a2){
		case "��":
			System.out.println("�ԑg�ł�");
			break;

		case "��":
			System.out.println("���g�ł�");
			break;
		}


		String a3="��";

		switch(a3){
			case "��":
			System.out.println("���g�ł�");
		        break;

			case "��":
				System.out.println("�Αg�ł�");
				break;

				default:
					System.out.println("�G���[�ł�");
	}
		
		
		
		

	}
}
