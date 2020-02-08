package com.epam.gift.sweets;

public class KajuBarfi extends Sweet{
	public KajuBarfi() {
		setSweetness(0);
		setWeight(0);
	}
	public KajuBarfi(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}
