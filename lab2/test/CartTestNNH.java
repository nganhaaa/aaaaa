package lab2.test;

import lab2.CartNNH;
import lab2.DigitalVideoDiscNNH;

public class CartTestNNH {

    public static void main(String[] args) {

        CartNNH cart = new CartNNH();

        DigitalVideoDiscNNH dvd1 = new DigitalVideoDiscNNH("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDiscNNH(dvd1);

        DigitalVideoDiscNNH dvd2 = new DigitalVideoDiscNNH("Star War",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDiscNNH(dvd2);

        DigitalVideoDiscNNH dvd3 = new DigitalVideoDiscNNH("Aladin",
                "Animation", 18.99f);
        cart.addDigitalVideoDiscNNH(dvd3);

        cart.printNNH();

        cart.searchByIDNNH(3);
        cart.searchByTitleNNH("Lion");
    }
}
