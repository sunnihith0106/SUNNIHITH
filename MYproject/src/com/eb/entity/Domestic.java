package com.eb.entity;

public class Domestic extends Connection {
	public Domestic(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);
		// TODO Auto-generated constructor stub
	}

	public float computeBill() {
		// TODO Auto-generated method stub
		int units=currentReading=previousReading;
		float bill=0;
		if(units<=50) {
			bill=units*slabs[0];
		}
		else if(units<=100) {
			bill=115+(units=50)*slabs[1];
		}
		else if(units>100) {
			bill=325+(units-100)*slabs[2];
		}
		return bill;
	}

}
