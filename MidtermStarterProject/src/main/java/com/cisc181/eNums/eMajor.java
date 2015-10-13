package com.cisc181.eNums;

public enum eMajor {
BUSINESS(1), COMPSI(2), CHEM(3), PHYSICS(4), NURSING(5);
	private eMajor(final int rank){
		this.rank = rank;
	}
	private int rank;
	public int getRank(){
		return rank;
	}
}
