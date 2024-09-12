//Driver Class
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
       Product product_input = new Product();
       Cd cd_input = new Cd();
       DVD dvd_input = new DVD();
       Scanner in = new Scanner(System.in);

       System.out.println("Produk apa yang mau anda beli: ");
       System.out.println("Nama Produk: ");
       product_input.setName(in.nextLine());
       System.out.println("Banyak produk: ");
       product_input.setQuantity(in.nextInt());
       System.out.println("Harga produk: ");
       product_input.setPrice(in.nextDouble());

       System.out.println("Jenis yg Anda memilih CD atau DVD? ");
       String jenis_input = in.next();
       if (jenis_input.equalsIgnoreCase("Cd")){
            System.out.println("Nama Artis: ");
            cd_input.setArtist(in.nextLine());
            in.nextLine();
            System.out.println("Ada berapa jumlah lagunya? ");
            cd_input.setNumSong(in.nextInt());
            in.nextLine();
            System.out.println("Apa labelnya?");
            cd_input.setLabel(in.nextLine());

            System.out.println("Inilah Produk-Produk yang anda beli" + "\nNama produk: " 
            + cd_input.getName()+ "\nNama produk: " + cd_input.getNumber() + "\nJumlah Produk: "
            + cd_input.getQuantity() + "Harga produk: " + cd_input.getPrice() + "\n" + "\nArtist: "
            + cd_input.getArtist() + "\nJumlah Lagu: " + cd_input.getNumSong() + "\nLabel: "+ cd_input.getLabel());
            
       }else if (jenis_input.equalsIgnoreCase("DVD")){
            System.out.println("Durasi: ");
            dvd_input.setLenght(in.nextInt());
            System.out.println("Rating: ");
            dvd_input.setRating(in.nextDouble());
            System.out.println("Nama studio: ");
            dvd_input.setStudio(in.nextLine());
            
            System.out.println("Inilah Produk-Produk yang anda beli" 
            + dvd_input.getName()+ "\nNama produk: " + dvd_input.getNumber() + "\nDurasi: "
            + dvd_input.getLenght() + "Rating: " + dvd_input.getRating() + "\n" + dvd_input.getStudio() + "\nNama studio: ");
          }
            
     }

}
