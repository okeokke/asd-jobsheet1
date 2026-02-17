import java.util.Scanner;
public class pASD_J1T1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] KODE = {"A","B","D","E","F","G","H","L","N","T"};
    String[][] KOTA = {
      {"B","A","N","T","E","N"," "," "," "," "," "," "},
      {"J","A","K","A","R","T","A"," "," "," "," "," "},
      {"B","A","N","D","U","N","G"," "," "," "," "," "},
      {"C","I","R","E","B","O","N"," "," "," "," "," "},
      {"B","O","G","O","R"," "," "," "," "," "," "," "},
      {"P","E","K","A","L","O","N","G","A","N"," "," "},
      {"S","E","M","A","R","A","N","G"," "," "," "," "},
      {"S","U","R","A","B","A","Y","A"," "," "," "," "},
      {"M","A","L","A","N","G"," "," "," "," "," "," "},
      {"T","E","G","A","L"," "," "," "," "," "," "," "}
    };

    boolean found=false;
    do {
      System.out.print("Masukkan huruf plat nomor : ");
      String cari = sc.nextLine().toUpperCase();
      
      for (int i = 0; i < KODE.length; i++) {
        if (cari.equalsIgnoreCase(KODE[i])) {
          System.out.print("Kota = ");
          for (int j = 0; j < KOTA.length; j++) {
            System.out.print(KOTA[i][j]);
          }
          found=true;
          System.out.println();
          break;
        }  
      }
      if (found==true) {
        break;
      } else {
        System.out.println("Huruf plat nomor tidak ditemukan!");
        continue;
      }
    } while (found==false);
    sc.close();
  }
}