public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerKamar;
    private boolean isTersedia;
    double totalTagihan;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal){
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerKamar = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerKamar){
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerKamar = hargaPerKamar;
        this.isTersedia = true;
    }
    
    public String getNomorKamar(){
        return nomorKamar;
    }

    public String getTipeKamar(){
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar){
        if(tipeKamar.equalsIgnoreCase("Regular") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")){
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Tipe kamar tidak tersedia || Tipe kamar Regular untuk Anda");
            this.tipeKamar = "Regular";
        }
    }

    public int getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }
    
    public double getHargaPerKamar(){
        return hargaPerKamar;
    }

    public void setHargaPerKamar(double hargaPerKamar){
        if(hargaPerKamar < 50000){
            System.out.println("Harga per kamar tidak valid.");
            this.hargaPerKamar = 50000;
        } else {
            this.hargaPerKamar = hargaPerKamar;
        }
    }

    public boolean isTersedia(){
        return isTersedia;
    }

    public String pesanKamar(){
        if(isTersedia){
            isTersedia = false;
            return "Kamar berhasil terisi";
        } else {
            return "Maaf, kamar tidak tersedia!";
        }
    } 

    public String pesanKamar(int jumlahTamu){
        if(isTersedia){
            if(jumlahTamu > kapasitasMaksimal){
                return "Maaf jumlah tamu Overcapacity!";
            } else {
                isTersedia = false;
                return "Kamar berhasil terisi";
            }
        } else {
            return "Maaf, kamar tidak tersedia!";
        }
    }

    public void batalPesan(){
        if(!isTersedia){
            isTersedia = true;
            System.out.println("Pesanan kamar berhasil di batalkan");
        } else {
            System.out.println("Kamar sudah tersedia");
        }
    }

    public double hitungTotalBayar(int jumlahMalam){
        if(jumlahMalam < 1){
            return 0;
        } else {
            return jumlahMalam * hargaPerKamar;
        }
    } 

    public String hitungTotalBayar(int jumlahMalam, String kodeVoucher){
        totalTagihan = jumlahMalam * hargaPerKamar;
        if(kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3){
            double diskon = totalTagihan * 0.2;
            totalTagihan = totalTagihan - diskon; 
            return "Total Tagihan: " + totalTagihan;
        } else {
            return "Total Pembayaran: " + totalTagihan;
        }
    }

    public void profilKamar(){
        System.out.println("\n========== STRUK INFORMASI ==========");
        System.out.println("Nomor Kamar\t\t: " + nomorKamar);
        System.out.println("Tipe Kamar\t\t: " + tipeKamar);
        System.out.println("Kapasitas Maksimal\t: " + kapasitasMaksimal);
        System.out.println("Harga Per Kamar\t\t: " + hargaPerKamar);
        System.out.println("Tersedia\t\t: " + (isTersedia ? "Tersedia" : "Tidak Tersedia"));
        System.out.println("Total Tagihan\t\t: " + totalTagihan);
    }
    
}






 


    
