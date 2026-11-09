public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() * 90 / 100; // diskon 10%
    }

    @Override
    public String keterangan() {
        return "Buku audio, " + durasiMenit + " menit";
    }

    @Override
    public String linkUnduh() {
        return "https://toko.buku/audio/" + getJudul().toLowerCase().replace(' ', '-');
    }
}