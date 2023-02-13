package com.seymakotan.coffeeshop;

import java.util.HashMap;
import java.util.Map;

/*
 *	Tubitak Bilgem tarafindan gonderilen case icin gelistirilmistir
 *	Kahve siparis uygulamasinin Menu classidir. CoffeeMenu bilgilerini tutarak ve isleyerek console islemlerini gerceklestirmektedir.
 * 
 *  @author Seyma Kotan
 *  @version 1.0
 *  @since 2023.02.12
 */
public class Menu {

	HashMap<Integer, CoffeeInfo> coffeeMenu;

	public Menu() {

		coffeeMenu = new HashMap<Integer, CoffeeInfo>();

	}

	public void addItem(CoffeeInfo coffeeInfo) {

		coffeeMenu.put(coffeeInfo.coffeeId, coffeeInfo);
	}

	public void removeItem(int coffee) {

		coffeeMenu.remove(coffee);
	}

	public void showMenu() {

		System.out.println("TUBITAK BILGEM COFFEESHOP ");

		for (Map.Entry<Integer, CoffeeInfo> coffeeItem : coffeeMenu.entrySet()) {

			System.out.println(String.format("%-10s : [%-20s] %s ", coffeeItem.getValue().coffeeId,
					coffeeItem.getValue().coffeeName, coffeeItem.getValue().coffeePrice));

		}

		System.out.println("Lutfen icmek istediginiz kahve numarasini giriniz ...");

	}

	public void showCoffeeContent(int coffeeId) {

		String[] content = coffeeMenu.get(coffeeId).coffeeContent;

		StringBuilder sContent = new StringBuilder();
		sContent.append("Bu icecegimiz ");

		for (String string : content) {

			sContent.append(string).append(" ");

		}
		sContent.append("icermektedir afiyet olsun");

		System.out.println(sContent.toString());

	}
}
