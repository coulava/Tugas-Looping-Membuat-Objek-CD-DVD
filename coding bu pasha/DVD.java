public class DVD  extends Product {

    private int lenght;
    private double rating;
    private String studio;

    public DVD() {
        super();
        lenght = 0;
        rating = 0;
        studio = "";
    }

    public DVD(int number, String name, int quantity, double price, int lenght, double rating, String studio) {
        super(number, name,quantity, price);
        this.lenght = lenght;
        this.rating = rating;
        this.studio = studio;

    }

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Lenght: " + lenght);
        System.out.println("Rating: " + rating);
        System.out.println("Studio: " + studio);
    }
    
}
