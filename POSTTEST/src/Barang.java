public class Barang {
        private String idBarang;
        private String namaBarang;
        private int stockBarang;
        private double hargaSatuan;
        private String kategori;

        Barang(){
            this.idBarang = idBarang;
            this.namaBarang = namaBarang;
            this.stockBarang = 0;
            this.hargaSatuan = 0;
            this.kategori = null;
        }

        public String getIDBarang(){
            return idBarang;
        }

        public void setIDBarang(String idBarang){
            this.idBarang = idBarang;
        }

        public String getNamaBarang(){
            return namaBarang;
        }

        public void setNamaBarang(String namaBarang){
            this.namaBarang = namaBarang;
        }

        public int getStockBarang(){
            return stockBarang;
        }

        public void setStockBarang(int stockBarang){
            if(stockBarang < 0){
                System.out.println("Stock tidak boleh negatif!\n");
            } else {
                this.stockBarang = stockBarang;
            }
        }

        public void tambahStock(int jumlah){
            if (jumlah < 0){
                System.out.println("Jumlah yang ingin ditambah harus lebih dari Nol!\n");
            } else {
                    this.stockBarang +=jumlah;
            }
        }

        public void kurangiStock(int jumlah){
            if(jumlah < 0){
                System.out.println("Jumlah yang barang yang ingin di kurangi harus lebih dari Nol!\n");
            }else if(jumlah > stockBarang){
                System.out.println("jumlah barang yang ingin dikurangi melebihi stock yang tersedia!\n");
            } else{
                this.stockBarang -= jumlah;
            }
        }

        public double getHargaSatuan(){
            return hargaSatuan;
        }

        public void setHargaSatuan(double hargaSatuan){
            if(hargaSatuan < 0){
                System.out.println("Harga satuan tidak boleh negatif!\n");
            } else {
                this.hargaSatuan = hargaSatuan;
            }
        }
        public String getKategori(){
            return kategori;
        }

        public void setKategori(String kategori){
            this.kategori = kategori;
        }

        public void tampilkanDetailBarang(){
            System.out.println("ID Barang\t: " + getIDBarang());
            System.out.println("Nama Barang\t: " + getNamaBarang());
            System.out.println("Kategori\t: " + getKategori());
            System.out.println("Stock Barang\t: " + getStockBarang());
            System.out.println("Harga Satuan\t: " + getHargaSatuan() + "\n");

        }


}
