public class bukuMain12 {
    public static void main(String[] args) {
        // Buku12 bk1 = new Buku12();
        // bk1.judul = "Toda Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 250;
        // bk1.stok = 10;
        // bk1.harga = 80000;

        // bk1.tampilInformasi();
        // bk1.terjual(2);
        // bk1.gantiHarga(78000);
        // bk1.tampilInformasi();

        // Buku12 bk2 = new Buku12("Self Reward", "Maheera Ayesha", 230, 33, 60000);
        // bk2.terjual(22);
        // bk2.tampilInformasi();

        // Buku12 ghaisan = new Buku12("Si Buta dari goa hantu", "Rafa", 25, 12, 20000);
        // ghaisan.terjual(8);
        // ghaisan.tampilInformasi();

        buku21 bk2 = new buku21("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.tampilInformasi();
        System.out.println("Harga yang terjual : "+ bk2.hitungHargaTotal(5));
        System.out.println("Diskon: "+ bk2.hitungDiskon(5));
        System.out.println("Harga Bayar: "+ bk2.hitungHargaBayar(5));
    }
}
