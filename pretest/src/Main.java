public class Main {
    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank();

        System.out.println(rekening.getNomorRekening());
        System.out.println(rekening.mengisiSaldo(500000));
        System.out.println(rekening.membaca());

    }
}

// class RekeningBank {

//     public RekeningBank() {
//     }
// }
