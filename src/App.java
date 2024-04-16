import AlatTulis.*;
public class App {
    public static void main(String[] args) {
        // Alat tulis bolpoint
        AlatTulis bolpoint = new AlatTulis();
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);
        
        // Alat tulis pensil
        AlatTulis pensil = new AlatTulis();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);
        
        // Alat tulis penghapus
        AlatTulis penghapus = new AlatTulis();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);
       
        // Menampilkan informasi alat tulis
        System.out.println("Nama: " + bolpoint.getNama());
        System.out.println("Stok: " + bolpoint.getStok());
        System.out.println("Harga Satuan: " + bolpoint.getHargaSatuan());
        System.out.println("Harga: " + bolpoint.getHarga());
        System.out.println();

        System.out.println("Nama: " + pensil.getNama());
        System.out.println("Stok: " + pensil.getStok());
        System.out.println("Harga Satuan: " + pensil.getHargaSatuan());
        System.out.println("Harga: " + pensil.getHarga());
        System.out.println();

        System.out.println("Nama: " + penghapus.getNama());
        System.out.println("Stok: " + penghapus.getStok());
        System.out.println("Harga Satuan: " + penghapus.getHargaSatuan());
        System.out.println("Harga: " + penghapus.getHarga());
        System.out.println();

        // Menghitung total harga
        int totalHarga = bolpoint.getHarga() + pensil.getHarga() + penghapus.getHarga();
        System.out.println("Total Harga: " + totalHarga);
    }
}
