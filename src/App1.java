import Makanan.*;
public class App1{
    public static void main(String[] args) {
        //Makanan Roti
        Makanan Roti = new Makanan();
        Roti.setNama("Roti");
        Roti.setStok(20);
        Roti.setHargaSatuan(5000);

        //Makanan biskuit
        Makanan biskuit = new Makanan();
        biskuit.setNama("Biskuit");
        biskuit.setStok(50);
        biskuit.setHargaSatuan(2000);
       
          //Makanan permen
          Makanan permen = new Makanan();
          permen.setNama("permen");
          permen.setStok(100);
          permen.setHargaSatuan(1000);
       
        // Menampilkan informasi alat tulis
        System.out.println("Nama: " + Roti.getNama());
        System.out.println("Stok: " + Roti.getStok());
        System.out.println("Harga Satuan: " + Roti.getHargaSatuan());
        System.out.println("Harga: " + Roti.getHarga());
        System.out.println();

        System.out.println("Nama: " + biskuit.getNama());
        System.out.println("Stok: " + biskuit.getStok());
        System.out.println("Harga Satuan: " + biskuit.getHargaSatuan());
        System.out.println("Harga: " + biskuit.getHarga());
        System.out.println();

        System.out.println("Nama: " + permen.getNama());
        System.out.println("Stok: " + permen.getStok());
        System.out.println("Harga Satuan: " + permen.getHargaSatuan());
        System.out.println("Harga: " + permen.getHarga());
        System.out.println();

        // Menghitung total harga
        int totalHarga = Roti.getHarga() + biskuit.getHarga() + permen.getHarga();
        System.out.println("Total Harga: " + totalHarga);
    }
}
