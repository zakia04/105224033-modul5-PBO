public class Karyawan {
    private String karyawanID;
    private String nama;
    private double gajiPokok; //no2
    private String departemen; //no3

    //no1
    Karyawan() {
        setKaryawanID(karyawanID);
        setNama(nama);
    }

    public String getKaryawanID() {
        return karyawanID;
    }

    public void setKaryawanID(String karyawanID) {
        this.karyawanID = karyawanID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //no2
    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if(gajiPokok < 0) {
            System.out.println("Gaji pokok tidak boleh negatif.");
            return;
        } else {
        this.gajiPokok = gajiPokok;
        }
    }

    //no3
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    public void tampilkanDataKaryawan(){
        System.out.println("ID Karyawan: " + getKaryawanID());
        System.out.println("Nama Karyawan: " + getNama());
        System.out.println("Departemen: " + getDepartemen());
        System.out.println("Gaji Pokok: " + getGajiPokok());
    }

}
