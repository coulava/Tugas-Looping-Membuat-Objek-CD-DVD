public class Cd extends Product {
    
    private String artist;
    private int numSong;
    private String label;

    public Cd() {
       super(); //mengakses  Constructor Superclass
       artist = "";
       numSong = 0;
       label = "";

    }

    public Cd(int number, String name, int quantity, double price, String artist, int numSong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }

    

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override //membuat method yg sama dengan method di superclass
    public void print() {
        System.out.println("Artist " + artist);
        System.out.println("total Song " + numSong);
        System.out.println("label " + label);
    }

}
 