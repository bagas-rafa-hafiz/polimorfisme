public class Main {
    public static void main(String[] args) {

        System.out.println("=== Testing Bank (Overloading) ===");
        Bank bank = new Bank();
        bank.transferUang(100000, "123456");
        bank.transferUang(200000, "654321", "Mandiri");
        bank.transferUang(300000, "111222", "BRI", "Bayar kos bulan Juli");
        bank.sukuBunga();

        System.out.println("\n=== Testing BankBNI (Overriding) ===");
        BankBNI bni = new BankBNI();
        bni.transferUang(150000, "777888", "BRI"); // otomatis jadi "BNI"
        bni.sukuBunga();
        System.out.println("Biaya transfer ke BRI: Rp" + bni.hitungBiayaTransfer("BRI"));
        System.out.println("Biaya transfer ke BNI: Rp" + bni.hitungBiayaTransfer("BNI"));

        System.out.println("\n=== Testing BankBCA (Overriding) ===");
        BankBCA bca = new BankBCA();
        bca.transferUang(250000, "999000", "Mandiri"); // otomatis jadi "BCA"
        bca.sukuBunga();
        System.out.println("Biaya transfer ke Mandiri: Rp" + bca.hitungBiayaTransfer("Mandiri"));
        System.out.println("Biaya transfer ke BCA: Rp" + bca.hitungBiayaTransfer("BCA"));
    }
}
