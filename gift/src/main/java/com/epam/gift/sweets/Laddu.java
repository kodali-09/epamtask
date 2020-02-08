package com.epam.gift.sweets;

public class Laddu extends Sweet {
	public Laddu() {
		setSweetness(0);
		setWeight(0);
	}
	public Laddu(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}
