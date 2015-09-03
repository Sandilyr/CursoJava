package com.softtek.java.academy.exercises.enums;

public enum CitiesEnum {
	
	MEXICALI(1),
	ENSENADA(2),
	TIJUANA(3),
	TECATE(4),
	ROSARITO(5),
	GUADALAJARA(6),
	ZAPOPAN(7),
	ACAPULCO(8);
	
	
	private int num;

	private CitiesEnum(int num) {

		this.setNum(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
