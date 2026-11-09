public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMb;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMb) {
        super(judul, penulis, harga);
        this.ukuranMb = ukuranMb;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() * 80 / 100; // diskon 20%
    }

    @Override
    public String keterangan() {
        return "Buku digital, " + ukuranMb + " MB";
    }

    @Override
    public String linkUnduh() {
        return "https://toko.buku/ebook/" + getJudul().toLowerCase().replace(' ', '-');
    }
}