public class App {
    public static void main(String[] args){
        KamarHotel kamar1 = new KamarHotel("101", "Regular", 2);
        kamar1.setTipeKamar("Presidential");
        kamar1.setHargaPerKamar(-10000);
        
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 2, 100000);
        kamar2.pesanKamar(4);
        kamar2.pesanKamar(2);
        kamar2.pesanKamar();

        kamar1.hitungTotalBayar(2, "PROMO");
        kamar2.hitungTotalBayar(4, "PROMO");

        kamar1.profilKamar();
        kamar2.profilKamar();

    }
}    

