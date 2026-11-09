public class TokoBuku {
    public static void main(String[] args) {
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        Buku[] keranjang = { cetak1, cetak2, digital, audio };

        for (Buku b : keranjang) {
            b.tampilkanInfo();
            System.out.println();
        }
    }
}