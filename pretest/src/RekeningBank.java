public class RekeningBank {
    private String nomorRekening; 
    private double saldo;  

    public RekeningBank(){
        this.nomorRekening = "1234556789";
        this.saldo = 0;
    }

    public RekeningBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String membaca(){
        return "Nomor Rekening: " + nomorRekening + ", Saldo: " + saldo;
    }

    public String mengisiSaldo(double jumlah){
        if(jumlah < 0){
            return "Jumlah yang dimasukkan tidak valid.";
        } else{
            saldo += jumlah;
            return "Saldo berhasil diisi. Saldo saat ini: " + saldo;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNomorRekening(){
        return nomorRekening;
    }

}
