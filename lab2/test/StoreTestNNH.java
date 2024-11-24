package lab2.test;

import lab2.DigitalVideoDiscNNH;
import lab2.StoreNNH;

public class StoreTestNNH {
	public static void main(String[] args) {
		StoreNNH store = new StoreNNH();
		
		// Create new dvd objects and add them to the store
		DigitalVideoDiscNNH dvd1 = new DigitalVideoDiscNNH("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addDVDNNH(dvd1);
		
		DigitalVideoDiscNNH dvd2 = new DigitalVideoDiscNNH("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		store.addDVDNNH(dvd2);
		
		DigitalVideoDiscNNH dvd3 = new DigitalVideoDiscNNH("Aladin", 
				"Animation", 18.99f);
		store.addDVDNNH(dvd3);
		
		store.printNNH();
		
		store.addDVDNNH(dvd3);
		store.removeDVDNNH(dvd3);
		
		store.printNNH();
		
		store.addDVDNNH(dvd3);
		
		store.printNNH();
	}
}
