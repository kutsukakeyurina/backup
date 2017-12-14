
public class Test3 {

	public static void main(String[] args) {
	    Person3 taro = new Person3();
	    taro.name="田中太郎";
	    taro.age=28;
	    taro.tell="090-0000-0000";
	    taro.email="aaa111@gmail.com";
	    System.out.println(taro.name);
	    System.out.println(taro.age);
	    System.out.println(taro.tell);
	    System.out.println(taro.email);
	    taro.talk();
	    taro.walk();
	    taro.run();

        Robot3 aibo = new Robot3();
        aibo.name="aibo";
        System.out.println(aibo.name);
        aibo.talk();
        aibo.walk();
        aibo.run();

        Robot3 asimo = new Robot3();
        asimo.name="asimo";
        System.out.println(asimo.name);
        asimo.talk();
        asimo.walk();
        asimo.run();

        Robot3 pepper = new Robot3();
        pepper.name="pepper";
        System.out.println(pepper.name);
        pepper.talk();
        pepper.walk();
        pepper.run();

	}

}
