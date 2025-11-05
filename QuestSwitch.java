import java.util.Scanner;

public class QuestSwitch {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        double strukturData, pemrogramanBerorientasiObjek, basisData, adp, rpl;
        double rataRata100, ipk;
        String predikatNilai;

        System.out.println("Welcome to system program seleksi asisten dosen");
        System.out.println("--------------------------------------------------");
        System.out.println("Silakan masukkan nilai (0-100) untuk 5 mata kuliah:");
        
        System.out.print("Masukkan nilai Struktur Data: ");
        strukturData = ns.nextDouble();
        System.out.print("Masukkan nilai Pemrograman Berorientasi Objek: ");
        pemrogramanBerorientasiObjek = ns.nextDouble();
        System.out.print("Masukkan nilai Basis Data: ");
        basisData = ns.nextDouble();
        System.out.print("Masukkan nilai Algoritma dan Pemrograman: ");
        adp = ns.nextDouble();
        System.out.print("Masukkan nilai Rekayasa Perangkat Lunak: ");
        rpl = ns.nextDouble();
    }
}

