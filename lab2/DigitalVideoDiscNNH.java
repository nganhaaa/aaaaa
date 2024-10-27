package lab2;

public class DigitalVideoDiscNNH {
    private String title;
    private String category;
    private int length;
    private String director;
    private float price;

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

    public DigitalVideoDiscNNH(String title) {
        this.title = title;
    }

    public DigitalVideoDiscNNH(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public DigitalVideoDiscNNH(String director, String category, String title, float price) {
        this(title, category, price);
        this.director = director;
    }

    public DigitalVideoDiscNNH(String title, String category, String director, int length, float price) {
        this(director, category, title, price);
        this.length = length;
    }
}
