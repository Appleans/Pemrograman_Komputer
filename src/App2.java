import Elektronik.*;
public class App2{
    public static void main(String[] args) {
        //Elektronik Kipasangin
        Elektronik Kipasangin = new Elektronik();
        Kipasangin.setNama("Kipas Angin");
        Kipasangin.setStok(10);
        Kipasangin.setHargaSatuan(120000);

        //Elektronik TV
        Elektronik TV = new Elektronik();
        TV.setNama("TV");
        TV.setStok(5);
        TV.setHargaSatuan(3000000);

        //Elektronik Radio
        Elektronik Radio = new Elektronik();
        Radio.setNama("Radio");
        Radio.setStok(2);
        Radio.setHargaSatuan(100000);

        // Menampilkan informasi alat tulis
        System.out.println("Nama: " + Kipasangin.getNama());
        System.out.println("Stok: " + Kipasangin.getStok());
        System.out.println("Harga Satuan: " + Kipasangin.getHargaSatuan());
        System.out.println("Harga: " + Kipasangin.getHarga());
        System.out.println();

        System.out.println("Nama: " + TV.getNama());
        System.out.println("Stok: " + TV.getStok());
        System.out.println("Harga Satuan: " + TV.getHargaSatuan());
        System.out.println("Harga: " + TV.getHarga());
        System.out.println();

        System.out.println("Nama: " + Radio.getNama());
        System.out.println("Stok: " + Radio.getStok());
        System.out.println("Harga Satuan: " + Radio.getHargaSatuan());
        System.out.println("Harga: " + Radio.getHarga());
        System.out.println();

        // Menghitung total harga
        int totalHarga = Kipasangin.getHarga() + TV.getHarga() + Radio.getHarga();
        System.out.println("Total Harga: " + totalHarga);
    }
}
