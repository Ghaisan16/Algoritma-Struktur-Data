import java.util.Scanner;

public class mainSum12{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int nPerusahaan = sc.nextInt();

        sum12[] perusahaan = new sum12[nPerusahaan];

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i] = new sum12();
            perusahaan[i].nomor = i +1;
            perusahaan[i].input(sc);
        }

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i].hitungKeuntungan();
            System.out.println(
                "Total keuntungan perusahaan " + 
                (i + 1) + " selama " +
                perusahaan[i].jumlahBulan + 
                " bulan adalah " + perusahaan[i].totalKeuntungan);
        }
    }
}

