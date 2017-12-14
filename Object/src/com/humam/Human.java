package com.humam;

public class Human {

	public static String say;

	public static String mey;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		say = "kutsukake";
		mey = "yurina";
		System.out.println("HelloWorld");
		System.out.println(say + mey);

		HumanName humanName = new HumanName();

		System.out.println(humanName.getName());

		String say1 = humanName.say;
		System.out.println(say1);

		String mey = humanName.getMey();
		System.out.println(mey);

		HumanName hn = new HumanName("tanaka", "taro");
		System.out.println(hn.getName());

		HumanName human = new HumanName("yamada", "jiro");
		System.out.println(human.getName());

	}

}
