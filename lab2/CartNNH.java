package lab2;

public class CartNNH {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDiscNNH itemsOrdered[] = new DigitalVideoDiscNNH[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDiscNNH(DigitalVideoDiscNNH disc) {
        if (qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("DigitalVideoDisc has been added");
        } else {
            System.out.println("Your cart is full, can not added new item!");
        }
    }
    public void removeDigitalVideoDiscNNH(DigitalVideoDiscNNH disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitleNNH().equals(disc.getTitleNNH())) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];

                }
            }

            qtyOrdered--;
            System.out.println("DigitalVideoDisc has been removed");
            break;
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getPriceNNH();
        }
        return total;
    }
}
