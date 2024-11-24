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

    public void addDigitalVideoDiscNNH(DigitalVideoDiscNNH[] dvdList) {
        if (dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                System.out.println(dvdList[i].getTitleNNH() + " has been added!");
                qtyOrdered += 1;
            }

        }
    }

    public void addDigitalVideoDiscNNH(DigitalVideoDiscNNH dvd1, DigitalVideoDiscNNH dvd2) {
        DigitalVideoDiscNNH[] dvdList = {dvd1, dvd2};
        addDigitalVideoDiscNNH(dvdList);
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
    public void printIdNNH() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("ID: " + itemsOrdered[i].getIdNNH()
                    + " - " + itemsOrdered[i].getTitleNNH());
        }
    }

    public void printNNH() {
        System.out.println("**************************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("*****************************************************");
    }

    public void searchByIDNNH(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getIdNNH() == id) {
                System.out.println("Found" + itemsOrdered[i]);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Sorry, no DVDs were found that match the ID provided!");
        }
    }

    public void searchByTitleNNH(String keyword) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keyword)) {
                System.out.println("Found" + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (matchFound == false) {
            System.out.println("Sorry, no DVDs were found with \"" + keyword + "\" in the title!");
        }
    }

    public void searchByCategoryNNH(String category) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCategoryNNH().equalsIgnoreCase(category)) {
                System.out.println("Found" + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no DVDs matching the \"" + category + "\" category were found!");
        }
    }

    public void searchByPriceNNH(float maxCost) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getPriceNNH() <= maxCost) {
                System.out.println("Found" + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no DVDs were found that match the maximum cost provided!");
        }
    }

    public void searchByPriceNNH(float minCost, float maxCost) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getPriceNNH() >= minCost && itemsOrdered[i].getPriceNNH() <= maxCost) {
                System.out.println("Found" + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no DVDs were found that match the cost range between your specified minimum and maximum!");
        }
    }
}
