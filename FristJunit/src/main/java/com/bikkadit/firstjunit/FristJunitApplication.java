package com.bikkadit.firstjunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bikkadit.firstjunit.calculator.Calculators;

@SpringBootApplication
public class FristJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FristJunitApplication.class, args);

		System.out.println("Calculator Application Start.....");

		Calculators calculators = new Calculators();
		int addition = calculators.addition(45, 78);
		System.out.println("This is Addition : " + addition);

		int divistion = calculators.divistion(75, 5);
		System.out.println("This is Divistion : " + divistion);

		int subtraction = calculators.subtraction(789, 123);
		System.out.println("This is Subtraction :" + subtraction);

		int multiplication = calculators.multiplication(10, 10);
		System.out.println("This is Multiplication :" + multiplication);
	}

}
