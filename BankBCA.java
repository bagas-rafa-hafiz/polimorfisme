public class BankBCA extends Bank {

    public BankBCA() {
        this.namaBank = "BCA";
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA"; // dipaksa sesuai nama bank
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan
                + " di bank " + bankTujuan);
    }

    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah 4.5%");
    }

    @Override
    public double hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BCA")) {
            return 0; // gratis sesama BCA
        }
        return 6500;
    }
}
