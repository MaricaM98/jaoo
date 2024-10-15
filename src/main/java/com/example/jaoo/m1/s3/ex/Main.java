/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s3.ex;

import java.util.Arrays;

/**
 * Exercise: create a few cats and let them meow accordingly to requests
 */
public class Main {
	/**
	 * Follow the instructions in the "to do" comments.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
		String[] colors = { "blue", "green", "yellow", "black", "blue" };

		System.out.println("The cats names: " + Arrays.toString(names));
		System.out.println("The cats colors: " + Arrays.toString(colors));

		// TODO 1: create an array of cats, same size of the arrays above
		Cat[] cats = new Cat[names.length];
		System.out.println("The array of cats length is " + cats.length);

		// TODO 2: initialize the cats array
		// each cat should have name and color from the arrays above
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat(names[i], colors[i]);
		}

		// TODO 3: each cat should meow
		for (Cat cat : cats) {
			cat.meow();

		}

		// TODO 4: each cat named Kit should meow
		for (int i =0; i<cats.length; i++) {
			if (cats[i].getName().equals("Kit")) {
				cats[i].meow();
			}
		}


		// TODO 5: only the first cat named Kit should meow
		for (int i =0; i<cats.length; i++) {
			if (cats[i].getName().equals("Kit")) {
				cats[i].meow();
				break;
			}
		}
//		for (Cat cat : cats) {
//			if(cat.getName().equals("Kit")) { perchè name deve rimanere PRIVATE e quindi è necessario scrivere un metodo per recuperare name
//				cat.meow();
//			}
//		}

		// TODO 6: only the cats in even position should meow
		for (int i =0; i<cats.length; i++) {
			if (i%2 == 0) {
				cats[i].meow();
			}
		}
	}
}
