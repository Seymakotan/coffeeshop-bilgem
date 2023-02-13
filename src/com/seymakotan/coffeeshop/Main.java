package com.seymakotan.coffeeshop;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		CoffeeInfo espresso = new CoffeeInfo("Espresso", 20, 1, new String[] { "1x Espresso" });

		CoffeeInfo doubleEspresso = new CoffeeInfo("Double Espresso ", 29, 2, new String[] { "2x Espresso" });
		CoffeeInfo cappuccino = new CoffeeInfo("Cappuccino", 27, 3, new String[] { "1x Espresso,4x Hot Water" });
		CoffeeInfo caffeLatte = new CoffeeInfo("Caffe Latte", 27, 4,
				new String[] { "1x Espresso,2x Steamed Milk,2x Milk Foam" });
		CoffeeInfo mocha = new CoffeeInfo("Mocha", 32, 5, new String[] { "1x Espresso,3x Steamed Milk,1x Milk Foam" });
		CoffeeInfo americano = new CoffeeInfo("Americano", 25, 6,
				new String[] { "1x Espresso,1x Steamed Milk,1x Milk Foam,2x Hot Chocolate" });
		CoffeeInfo hotWater = new CoffeeInfo("Hot Water", 5, 7, new String[] { "5x Hot Water" });

		Menu menu = new Menu();
		System.out.println(espresso);
		menu.addItem(espresso);
		menu.addItem(doubleEspresso);
		menu.addItem(cappuccino);
		menu.addItem(caffeLatte);
		menu.addItem(mocha);
		menu.addItem(americano);
		menu.addItem(hotWater);

		menu.showMenu();

		Scanner s = new Scanner(System.in);
		int selectedCoffeId = s.nextInt();
		System.out.println("Tesekkurler Kahveniz Hazirlaniyor.");
		menu.showCoffeeContent(selectedCoffeId);

	}
}
