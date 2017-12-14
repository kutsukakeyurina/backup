
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.tell="080-0000-0000";
		taro.email="abc123@gmail.com";
		taro.jyuusyo="東京都調布市";
		taro.seibetu="男";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.tell);
		System.out.println(taro.email);
		System.out.println(taro.jyuusyo);
		System.out.println(taro.seibetu);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.tell="080-1111-1111";
		jiro.email="abc222@gmail.com";
		jiro.jyuusyo="東京都小金井市";
		jiro.seibetu="男";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.tell);
		System.out.println(jiro.email);
		System.out.println(jiro.jyuusyo);
		System.out.println(jiro.seibetu);
		jiro.talk();
		jiro.walk();
		jiro.run();

		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=43;
		hanako.tell="080-2222-2222";
		hanako.email="abc333@gmail.com";
		hanako.jyuusyo="東京都府中市";
		hanako.seibetu="女";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.tell);
		System.out.println(hanako.email);
		System.out.println(hanako.jyuusyo);
		System.out.println(hanako.seibetu);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person yurina = new Person();
		yurina.name="沓掛由莉菜";
		yurina.age=24;
		yurina.tell="080-3333-3333";
		yurina.email="abc444@gmail.com";
		yurina.jyuusyo="埼玉県久喜市";
		yurina.seibetu="女";
		System.out.println(yurina.name);
		System.out.println(yurina.age);
		System.out.println(yurina.tell);
		System.out.println(yurina.email);
		System.out.println(yurina.jyuusyo);
		System.out.println(yurina.seibetu);
		yurina.talk();
		yurina.walk();
		yurina.run();

		Robot aibo = new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name="asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon = new Robot();
		doraemon.name="doraemon";
		System.out.println(doraemon.name);
		doraemon.talk();
		doraemon.walk();
		doraemon.run();

	}

}
