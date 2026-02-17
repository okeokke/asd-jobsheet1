import java.util.Scanner;
public class pASD_J1L4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] harga = {75000, 50000, 60000, 10000};
    int[][] stok = {
      {10,5,15,7},
      {6,11,9,12},
      {2,10,10,5},
      {5,7,12,9}
    };
    
    do {
      System.out.println("==== Menu Utama ====");
      System.out.println("1. Tampilkan Status Penjualan Cabang");
      System.out.println("2. Keluar");
      System.out.print("Pilih Menu (lalu tekan enter) : "); String pilih = sc.nextLine();
      if (pilih.equalsIgnoreCase("1")) {
        tampilPendapatanDanStatus(stok, harga);
      } else if (pilih.equalsIgnoreCase("2")) {
        System.out.println("Keluar dari menu...");
        break;
      } else {
        System.out.println("===============================");
        System.out.println("Hanya pilih angka yang tersedia!");
        System.out.println("===============================");
      }
    } while (true);
    sc.close();
  }
  
  static void tampilPendapatanDanStatus(int[][] stock, int[] harga) {
    System.out.println("=== Laporan Pendapatan & Status Cabang ===");
    for (int i = 0; i < stock.length; i++) {
      int totalPendapatan = 0;
      for (int j = 0; j < stock[i].length; j++) {
        totalPendapatan += stock[i][j] * harga[j];
      }
      System.out.println("RoyalGarden " + (i+1));
      
      System.out.println("Pendapatan : Rp."+totalPendapatan);

      if (totalPendapatan>1500000) {
          System.out.println("Status \t : Sangat Baik");
      } else {
          System.out.println("Status \t : Perlu Evaluasi");
      }
      System.out.println("--------------------------------");
    }
  }
}