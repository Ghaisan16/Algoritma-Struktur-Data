import java.util.Scanner;

public class sum12 {

    int nomor;
    int jumlahBulan;
    double[] keuntungan;
    double totalKeuntungan;

    sum12() {
    }

    void input(Scanner sc) {
        // Input jumlah bulan
        System.out.print("Masukkan jumlah bulan untuk perusahaan " + (this.nomor) + ": ");
        this.jumlahBulan = sc.nextInt();

        // Deklarasi array untuk keuntungan
        this.keuntungan = new double[jumlahBulan];

        // Input keuntungan untuk setiap bulan
        for (int i = 0; i < jumlahBulan; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            this.keuntungan[i] = sc.nextDouble();
        }
    }

    void hitungKeuntungan() {
        totalKeuntungan = 0;
        for (int i = 0; i < jumlahBulan; i++) {
            totalKeuntungan += keuntungan[i];
        }
    }
}