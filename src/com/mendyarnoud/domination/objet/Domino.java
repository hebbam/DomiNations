package com.mendyarnoud.domination.objet;

public class Domino {

	private int couronne1;
	private String type1;
	private int couronne2;
	private String type2;
	private int dominoNumber;
	
	public int getDominoNumber() {
		return dominoNumber;
	}
	public void setDominoNumber(int dominoNumber) {
		this.dominoNumber = dominoNumber;
	}
	public int getCouronne1() {
		return couronne1;
	}
	public void setCouronne1(int couronne1) {
		this.couronne1 = couronne1;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public int getCouronne2() {
		return couronne2;
	}
	public void setCouronne2(int couronne2) {
		this.couronne2 = couronne2;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	@Override
	public String toString() {
		return "Domino [couronne1=" + couronne1 + ", type1=" + type1 + ", couronne2=" + couronne2 + ", type2=" + type2
				+ ", dominoNumber=" + dominoNumber + "]";
	}

	
	
}
