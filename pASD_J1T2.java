import java.util.Scanner;
public class pASD_J1T2 {
  static String[][] jadwal;
  static int jumlahJadwal;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Jumlah jadwal: ");
    jumlahJadwal = sc.nextInt();
    sc.nextLine();

    jadwal = new String[jumlahJadwal][4];
    
    boolean cond=true;
    String pilihan;
    do {
      System.out.println("\n=== MENU ===");
      System.out.println("1. Input jadwal");
      System.out.println("2. Tampilkan semua jadwal");
      System.out.println("3. Cari berdasarkan hari");
      System.out.println("4. Cari berdasarkan mata kuliah");
      System.out.println("0. Keluar");
      System.out.print("Pilih: ");
      pilihan = sc.nextLine();
      System.out.println("___________________________");
      
      switch(pilihan) {
        case "1" :
          inputJadwal(); break;
        case "2":
          tampilkanJadwal(); break;
        case "3":
          cariByHari(); break;
        case "4":
          cariMatKul(); break;
        case "0":
          cond=false; 
        break;
        default:
        System.out.println("______________________________________");
        System.out.println("Pilihan tidak valid! (Pilih angka 0-4)");
        System.out.println("______________________________________");
      }
    } while(cond==true);
  }
    
  static void inputJadwal() {
    for(int i = 0; i < jumlahJadwal; i++) {
      System.out.println("\nJadwal ke-" + (i+1));
      System.out.print("Mata Kuliah: ");
      jadwal[i][0] = sc.nextLine();
      System.out.print("Ruang: ");
      jadwal[i][1] = sc.nextLine();
      System.out.print("Hari: ");
      jadwal[i][2] = sc.nextLine();
      System.out.print("Jam: ");
      jadwal[i][3] = sc.nextLine();
    }
  }
    
  static void tampilkanJadwal() {
    System.out.println("\n" + "=".repeat(80));
    System.out.printf("%-30s %-20s %-15s %-15s%n", "Mata Kuliah", "Ruang", "Hari", "Jam");
    System.out.println("=".repeat(80));
    for(int i = 0; i < jumlahJadwal; i++) {
      if(jadwal[i][0] != null) {
        System.out.printf("%-30s %-20s %-15s %-15s%n", 
        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
      }
    }
    System.out.println("=".repeat(80));
  }
    
  static void cariByHari() {
    System.out.print("Masukkan hari: ");
    String hari = sc.nextLine();
      
    System.out.println("\n" + "=".repeat(80));
    System.out.printf("%-30s %-20s %-15s %-15s%n", "Mata Kuliah", "Ruang", "Hari", "Jam");
    System.out.println("=".repeat(80));
      
    boolean found = false;
    for(int i = 0; i < jumlahJadwal; i++) {
        if(jadwal[i][2] != null && jadwal[i][2].equalsIgnoreCase(hari)) {
            System.out.printf("%-30s %-20s %-15s %-15s%n", 
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            found = true;
        }
    }
      
    if(!found) {
      System.out.println("Tidak ada jadwal pada hari " + hari);
    }
    System.out.println("=".repeat(80));
  }

  static void cariMatKul() {
    System.out.print("Masukkan nama mata kuliah yang dicari : ");
    String matkul = sc.nextLine();
    
    System.out.println("\n" + "=".repeat(80));
    System.out.printf("%-30s %-20s %-15s %-15s%n", "Mata Kuliah", "Ruang", "Hari", "Jam");
    System.out.println("=".repeat(80));
    
    boolean found = false;
    for(int i = 0; i < jumlahJadwal; i++) {
      if(jadwal[i][0] != null && jadwal[i][0].equalsIgnoreCase(matkul)) {
        System.out.printf("%-30s %-20s %-15s %-15s%n", 
        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        found = true;
      }
    }
    
    if(!found) {
      System.out.println("Mata kuliah " + matkul + " tidak ditemukan");
    }
    System.out.println("=".repeat(80));
  }
  
}