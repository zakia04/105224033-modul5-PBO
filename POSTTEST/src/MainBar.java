public class MainBar {
    public static void main(String[] args){
        Barang bar = new Barang();
        bar.setIDBarang("A001");
        bar.setNamaBarang("Kulkas");
        bar.setKategori("Elektronik");
        bar.setStockBarang(10);
        bar.setHargaSatuan(500000);
        bar.tampilkanDetailBarang(); 


        bar.tambahStock(5);
        bar.kurangiStock(-100);
        bar.tampilkanDetailBarang();
        
        // bar.kurangiStock(3);



    }
    
}
