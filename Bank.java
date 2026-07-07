public class Bank {
    protected String namaBank = "Bank Umum";

    // 1) Transfer ke rekening lain (bank sama)
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan);
    }

    // 2) Transfer ke rekening lain di bank berbeda
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan
                + " di bank " + bankTujuan);
    }

    // 3) Transfer dengan tambahan berita
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan
                + " di bank " + bankTujuan);
        System.out.println("Berita: " + berita);
    }

    // 4) Info suku bunga standar
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    // Bonus: hitung biaya transfer berdasarkan bank tujuan
    public double hitungBiayaTransfer(String bankTujuan) {
        return 6500; // biaya default transfer beda bank
    }
}
