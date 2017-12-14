import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		Person saburo = new Person("saburo",20);
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person shiro = new Person("shiro");
		System.out.println(shiro.name);

		Person nanasi =new Person(16);
		System.out.println(nanasi.age);

		Person p = new Person();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<5; i++){
		System.out.println("名前を入力してください");
		p.name=br.readLine();
		System.out.println(p.name);
		p.talk();
		p.walk();
		p.run();


		}
	}

}
