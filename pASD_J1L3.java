import java.util.Scanner;
public class pASD_J1L3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] MK =  {"Praktikum Dasar Pemrograman", "Agama", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris Dasar", "Dasar Pemrograman", "Pengantar Akuntansi, Manajemen, dan Bisnis", "Bahasa Indonesia"};
    int[] bobotSKS = {3,2,2,2,2,2,2,2,2};
    int[] nilaiMK = new int[MK.length];
    String[] nilaiHuruf = new String[MK.length];
    double[] setara = new double[MK.length];
    
    System.out.println("Program Penghitung IP Semester");
    System.out.println("_______________________");


    for (int i = 0; i < MK.length; i++) {
      while (true) {
        System.out.print("Masukkan nilai Angka untuk MK "+MK[i]+" : ");
        int n = sc.nextInt(); sc.nextLine();
        if (n>=0&&n<=100) {
          nilaiMK[i]=n;
          break;
        } else {
          System.out.println("Input tidak valid! Masukkan angka 0-100!");
        }
      }

      if (nilaiMK[i] > 80 && nilaiMK[i] <= 100) {
          nilaiHuruf[i] = "A";  setara[i] = 4.0;
        } else if (nilaiMK[i] > 73) {
          nilaiHuruf[i] = "B+"; setara[i] = 3.5;
        } else if (nilaiMK[i] > 65) {
          nilaiHuruf[i] = "B";  setara[i] = 3.0;
        } else if (nilaiMK[i] > 60) {
          nilaiHuruf[i] = "C+"; setara[i] = 2.5;
        } else if (nilaiMK[i] > 50) {
          nilaiHuruf[i] = "C";  setara[i] = 2.0;
        } else if (nilaiMK[i] > 39) {
          nilaiHuruf[i] = "D";  setara[i] = 1.0;
        } else {
          nilaiHuruf[i] = "E";  setara[i] = 0.0;
        }
      }

    System.out.println("_______________________");
    System.out.println("Hasil Konversi Nilai");
    System.out.println("_______________________"); 

    double totalPoin = 0;
    int totalSKS = 0;

    System.out.printf("%-45s %-12s %-12s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Nilai Setara/Bobot");
    for (int i = 0; i < MK.length; i++) {
      totalPoin+=(setara[i]*bobotSKS[i]);
      totalSKS+=bobotSKS[i];
      System.out.printf("%-45s %-12d %-12s %-10.2f\n", MK[i], nilaiMK[i], nilaiHuruf[i], setara[i]);
    }
    double ipSemester=totalPoin/totalSKS;
    System.out.println("==============================");
    System.out.printf("IP : %.2f\n", ipSemester);
    sc.close();
  }
}
