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

        double totalNilai = strukturData + pemrogramanBerorientasiObjek + basisData + adp + rpl;
        rataRata100 = totalNilai / 5.0;

        ipk = (rataRata100 / 100.0) * 4.0;

        System.out.println("Hasil Penilaian Akademik");
        System.out.println("Rata-rata Nilai (skala 100): " + rataRata100);
        System.out.println("IPK Sederhana (skala 4.0):   " + ipk);

        if (ipk >= 3.75) {
            predikatNilai = "A (Sangat Baik)";
        } else if (ipk >= 3.50) { // 3.50 - 3.74
            predikatNilai = "AB (Baik Sekali)";
        } else if (ipk >= 3.00) { // 3.00 - 3.49
            predikatNilai = "B (Baik)";
        } else if (ipk >= 2.50) { // 2.50 - 2.99
            predikatNilai = "BC (Cukup)";
        } else { // < 2.50
            predikatNilai = "C (Kurang)";
        }
        System.out.println("Predikat nilai: " + predikatNilai);

        if (predikatNilai.equals("A (Sangat Baik)") || predikatNilai.equals("AB (Baik Sekali)")) {
            System.out.println("Selamat, Anda memenuhi syarat predikat untuk mendaftar.");
            System.out.println("Silakan pilih mata kuliah yang ingin diajukan:");
        }
    }
}

