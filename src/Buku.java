public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public abstract int hargaAkhir();

    public abstract String keterangan();

    public void tampilkanInfo() {
        System.out.println("Judul      : " + judul);
        System.out.println("Penulis    : " + penulis);
        System.out.println("Keterangan : " + keterangan());
        System.out.println("Harga akhir: Rp" + hargaAkhir());
    }
}