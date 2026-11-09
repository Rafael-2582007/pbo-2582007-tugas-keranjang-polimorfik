public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public int hargaAkhir() {
        int blok = (beratGram + 499) / 500; // ongkir per 500 gram, dibulatkan ke atas
        return getHarga() + blok * 5000;
    }

    @Override
    public String keterangan() {
        return "Buku cetak, " + beratGram + " gram";
    }
}