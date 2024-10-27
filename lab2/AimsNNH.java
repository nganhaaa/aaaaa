package lab2;

public class AimsNNH {
    public static void main(String[] args) {
        // Create a new cart
        CartNNH anOrder = new CartNNH();
        
        // Create new DVD objects and add them to the cart
        DigitalVideoDiscNNH dvd1 = new DigitalVideoDiscNNH("The Lion King", 
            "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDiscNNH(dvd1);
        
        DigitalVideoDiscNNH dvd2 = new DigitalVideoDiscNNH("Star Wars", 
            "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDiscNNH(dvd2);
        
        DigitalVideoDiscNNH dvd3 = new DigitalVideoDiscNNH("Aladin", 
            "Animation", 18.99f);
        anOrder.addDigitalVideoDiscNNH(dvd3);
        
        // Add dvd4
        DigitalVideoDiscNNH dvd4 = new DigitalVideoDiscNNH("The Incredibles", 
            "Animation", "Brad Bird", 115, 21.99f);
        anOrder.addDigitalVideoDiscNNH(dvd4);
        
        anOrder.removeDigitalVideoDiscNNH(dvd4);
        // Print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
