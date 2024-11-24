package lab2.test;

import lab2.DigitalVideoDiscNNH;

public class TestPassingParameterNNH {

	public static void main(String[] args) {
		DigitalVideoDiscNNH jungleDVD = new DigitalVideoDiscNNH("Jungle");
		DigitalVideoDiscNNH cinderellaDVD = new DigitalVideoDiscNNH("Cinderella");
		
		DigitalVideoDiscWrapperNNH wjungleDVD = new DigitalVideoDiscWrapperNNH(jungleDVD);
		DigitalVideoDiscWrapperNNH wcinderellaDVD = new DigitalVideoDiscWrapperNNH(cinderellaDVD);
		
		// Wrong swap() function
		swap(jungleDVD, cinderellaDVD);
		System.out.println("Wrong swap jungle dvd title: " + jungleDVD.getTitleNNH());
		System.out.println("Wrong swap cinderella dvd title: " + cinderellaDVD.getTitleNNH());
		
		
		// Correct swap() function
		swap(wjungleDVD, wcinderellaDVD);
		System.out.println("Correct swapped jungle dvd title: " + wjungleDVD.dvd.getTitleNNH());
		System.out.println("Correct swapped cinderella dvd title: " + wcinderellaDVD.dvd.getTitleNNH());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitleNNH());
		System.out.println("Change jungle dvd title: " + jungleDVD.getTitleNNH());
	}
	
	// Wrong
	public static void swap(Object o1, Object o2)
	{
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	// Correct
	public static void swap(DigitalVideoDiscWrapperNNH o1, DigitalVideoDiscWrapperNNH o2)
	{
		DigitalVideoDiscNNH tmp = o1.dvd;
		o1.dvd = o2.dvd;
		o2.dvd = tmp;
	}
	
	public static void changeTitle(DigitalVideoDiscNNH dvd, String title)
	{
		String oldTitle = dvd.getTitleNNH();
		dvd.setTitleNNH(title);
		dvd = new DigitalVideoDiscNNH(oldTitle);
	}

}
