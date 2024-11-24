package lab2;

public class DigitalVideoDiscNNH {
    private String title;
    private String category;
    private int length;
    private String director;
    private float price;

    private static int nbDigitalVideoDiscs = 0;
	private int id;

    public int getIdNNH() {
        return this.id;
    }

    public String getTitleNNH() {
        return this.title;
    }

    public String getCategoryNNH() {
        return this.category;
    }

    public int getLengthNNH() {
        return this.length;
    }

    public String getDirectorNNH() {
        return this.director;
    }

    public float getPriceNNH() {
        return this.price;
    }

    public void setTitleNNH(String title) {
        this.title = title;
    }

    	
	public boolean isMatch(String keyword)
	{
		return this.title.toLowerCase().contains(keyword.toLowerCase());
	}

    public DigitalVideoDiscNNH(String title) {
		super();
		this.title = title;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDiscNNH(String title, String category, float price) {
		super();
		this.title = title;
		this.category = category;
		this.price = price;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDiscNNH(String title, String category, String director, float price) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.price = price;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDiscNNH(String title, String category, String director, int length, float price) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.price = price;
		this.id = ++nbDigitalVideoDiscs;
	}
	
	@Override
	public String toString()
	{
		return this.id + ". DVD: " + this.title +
				" - Category: " + this.category +
				" - Director: " + this.title +
				" - DVD length: " + this.length +
				" - Cost: " + this.price + "$";
	}

    
}
