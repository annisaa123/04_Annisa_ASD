import java.util.Scanner;

/**
 * Array_04
 */
public class Array_04 {

    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);
        
        double [] nilaiMhs = new double[8];
        int[] sks = {2,2,2,3,2,2,3,2};
        String[] nilaiHuruf= new String[8];
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking And Problem Solving", "Matematika Dasar", "Bahasa inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] bobotNilai = new double[8];
        double ip, totalIp = 0, ipSemester;
        int totalSks=0;

        System.out.println("==================Program Hitung IP====================");

        for (int i = 0; i<mk.length; i++) {
        System.out.print("Masukkan nilai Angka untuk MK " + mk[i]+":");
        nilaiMhs[i]= sc14.nextDouble();

        if (nilaiMhs[i] <=100 && nilaiMhs[i] > 80) {
            nilaiHuruf[i] = "A";
            bobotNilai[i] = 4;
        } else if (nilaiMhs[i] <= 80 && nilaiMhs[i] > 73) {
            nilaiHuruf[i] = "B+";
            bobotNilai[i] = 3.5;
        } else if (nilaiMhs[i] <= 73 && nilaiMhs[i] > 65) {
            nilaiHuruf[i] = "B";
            bobotNilai[i] = 3;
        } else if (nilaiMhs[i] <= 65 && nilaiMhs[i] > 60) {
            nilaiHuruf[i] = "C+";
            bobotNilai[i] = 2.5;
        } else if (nilaiMhs[i] <= 60 && nilaiMhs[i] > 50) {
            nilaiHuruf[i] = "C";
            bobotNilai[i] = 2;
        } else if (nilaiMhs[i] <= 50 && nilaiMhs[i] > 39) {
            nilaiHuruf[i] = "D";
            bobotNilai[i] = 1;
        } else if (nilaiMhs[i] <= 39){
            nilaiHuruf[i] = "E";
            bobotNilai[i] = 0;
        } if (nilaiMhs[i] > 100 && nilaiMhs[i] <1) {
            nilaiHuruf[i] = "Nilai Tidak Valid";
            bobotNilai[i] = 0;
            nilaiMhs[i] = 0;


        }
        }


        System.out.println("========================");
        System.out.println(" Hasil Konversi Nilai");
        System.out.println("========================");
        
        System.out.printf("%-40s %-15s %-15s %-15s \n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0;i < mk.length;i++) {
            System.out.printf("%-43s %-17s %-14s %-1s \n", mk[i], nilaiMhs[i], nilaiHuruf[i], bobotNilai[i]);
        }

        for (int i = 0;i < mk.length;i++) {
            ip = bobotNilai[i] * sks[i];
            totalIp += ip;
            totalSks += sks[i];
        }

        ipSemester = totalIp/totalSks;
        System.out.printf("IP anda adalah " + "%.2f", ipSemester);

            
    }
}