package com.cisc181.eNums;

public enum eTitle {
	TEACHER(0),MAINTENANCE(1),DEAN(3);
	private int rank;
	private eTitle(int i){
		this.rank = rank;
	}
	public int getRank(){
		return rank;
	}
}
