package Elektronik;
public class Elektronik{
        private String nama;
        private int stok;
        private int hargaSatuan;
        private int harga;
    
        // Setter Nama
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        // Setter Stok
        public void setStok(int stok) {
            this.stok = stok;
            hitungHarga();
        }
    
        // Setter Harga Satuan
        public void setHargaSatuan(int hargaSatuan) {
            this.hargaSatuan = hargaSatuan;
            hitungHarga();
        }
    
        // Getter Nama
        public String getNama() {
            return nama;
        }
    
        // Getter Stok
        public int getStok() {
            return stok;
        }
    
        // Getter Harga Satuan
        public int getHargaSatuan() {
            return hargaSatuan;
        }
    
        // Getter Harga
        public int getHarga() {
            return harga;
        }
    
        // Method untuk menghitung harga
        private void hitungHarga() {
            this.harga = stok * hargaSatuan;
        }
}

