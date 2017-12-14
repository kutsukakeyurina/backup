package com.humam;

public class HumanName {
	public String say;
	private String mey;

	public HumanName() {
		say = "kutsukake";
		mey = "yurina";

	}

	public HumanName(String say,String mey){
		this.say=say;
		this.mey=mey;

	}


	public String getName() {
		return say + mey;
	}

	public String getMey(){
		return mey;
	}


}
