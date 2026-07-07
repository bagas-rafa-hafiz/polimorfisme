public class BankBNI extends Bank {

    public BankBNI() {
        this.namaBank = "BNI";
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI"; // dipaksa sesuai nama bank
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan
                + " di bank " + bankTujuan);
    }

    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }

    @Override
    public double hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI")) {
            return 0; // gratis sesama BNI
        }
        return 7500;
    }
}
