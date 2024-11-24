package lab2;
import java.util.ArrayList;
import java.util.List;


public class StoreNNH {
	// List DVDs 
	private List<DigitalVideoDiscNNH> itemsInStore = new ArrayList<DigitalVideoDiscNNH>();
	
	public void addDVDNNH(DigitalVideoDiscNNH dvd)
	{
		int index = itemsInStore.indexOf(dvd);
		if (index != -1) {
            System.out.println(dvd.getTitleNNH() + " is already in the store.");
        } else {
            itemsInStore.add(dvd);
            System.out.println(dvd.getTitleNNH() + " has been added to the store.");
        }
	}
	
	public void removeDVDNNH(DigitalVideoDiscNNH dvd)
	{
		boolean removed = itemsInStore.remove(dvd);
		if(removed)
		{
			System.out.println(dvd.getTitleNNH() + " has been removed from the store.");
		} else {
			System.out.println(dvd.getTitleNNH() + " is not found in the store.");
		}
	}
	
	public void printNNH() {
		for (int i=0; i < itemsInStore.size(); i++)
		{
			System.out.println(itemsInStore.get(i));
		}
	}
}
