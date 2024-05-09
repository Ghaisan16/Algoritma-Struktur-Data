package sortingHotel;

public class MainHotel12 {
    public static void main(String[] args) {
    HotelService12 list = new HotelService12();
    Hotel12 h1 = new Hotel12("Tungga Rupa", "Malang", 350000, (byte)3);
    Hotel12 h2 = new Hotel12("Trino jaya", "Batu", 145000, (byte)2);
    Hotel12 h3 = new Hotel12("Apart Suhat", "Kayen", 550000, (byte)5);
    Hotel12 h4 = new Hotel12("Jaya abadi", "Sukun", 90000, (byte)1);
    
    list.tambahHotel(h1);
    list.tambahHotel(h2);
    list.tambahHotel(h3);
    list.tambahHotel(h4);

    System.out.println("Data Harga Hotel sebelum sorting:");
    list.tampil();

    System.out.println("Daftar Hotel Berdasarkan Bintang");
    System.out.println("Metode Bubble Sort");
    list.bubbleSortRtHotel();
    list.tampil();
    System.out.println("Metode Selection Sort");
    list.selectionSortRtHotel();;
    list.tampil();
    
    System.out.println("Daftar Hotel Berdasarkan Harga");
    System.out.println("Metode Bubble Sort");
    list.bubbleSortHrgHotel();
    list.tampil();
    System.out.println("Metode Selection Sort");
    list.selectionSortHrgHotel();
    list.tampil();
    }
}
