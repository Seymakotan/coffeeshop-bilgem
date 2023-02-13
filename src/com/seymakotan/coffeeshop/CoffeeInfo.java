package com.seymakotan.coffeeshop;

/*
 *	Tubitak Bilgem tarafindan gonderilen case icin gelistirilmistir
 *	Kahve siparis uygulamasinin CoffeeInfo classidir. Name, price, content ve coffeeid bilgilerini tutmaktadir.
 * 
 *  @author Seyma Kotan
 *  @version 1.0
 *  @since 2023.02.12
 */
public class CoffeeInfo {

	String coffeeName;

	int coffeePrice;

	String[] coffeeContent;

	int coffeeId;

	public CoffeeInfo(String coffeeName, int coffeePrice, int coffeeId, String[] content) {

		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
		this.coffeeId = coffeeId;
		this.coffeeContent = content;
	}

}
