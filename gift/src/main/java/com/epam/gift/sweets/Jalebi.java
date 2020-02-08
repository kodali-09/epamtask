package com.epam.gift.sweets;
public class Jalebi extends Sweet{
	public Jalebi() {
		setSweetness(0);
		setWeight(0);
	}
	public Jalebi(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}
