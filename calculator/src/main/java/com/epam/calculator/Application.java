/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

import com.epam.calculator.calexp.Calculator;
import com.epam.calculator.calexp.Expr;
import com.epam.calculator.calexp.Parse;

/**
 *
 * @author homepc
 */
public class Application {
    private void startApp() {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				String str=reader.readLine();
				Expr exp=Parse.parse(str);
				if(exp==null) {
					throw new InvalidParameterException("Invalid Expression");
				}
				System.out.println("Entered Expression  : "+exp);
				System.out.println("Answer              : "+Calculator.calculateExp(exp));
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	public void start() {
		startApp();
	}
}




