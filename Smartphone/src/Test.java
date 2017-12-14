
public class Test {

	public static void main(String[] args) {
		Smartphone s=new Smartphone();

		s.setName("iphone");
		s.setPrice(150000);

		String name=s.getName();
		int price=s.getPrice();

		System.out.println(name);
		System.out.println(price);

	}

}
