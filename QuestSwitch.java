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

            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
            System.out.print("\nPilih mata kuliah (1-5) yang ingin diajukan: ");
            int mataKuliah = ns.nextInt();

            System.out.println("\n--- Hasil Seleksi Akhir ---");
            switch (mataKuliah) {
                case 1:
                    System.out.println("Anda memilih mata kuliah: Struktur Data (Nilai: " + strukturData + ")");
                    if (strukturData >= 75) {
                        System.out.println("STATUS: ELIGIBLE! Anda lulus seleksi Asisten Dosen.");
                    } else {
                        System.out.println("STATUS: TIDAK ELIGIBLE. Nilai Anda di bawah 75.");
                    }
                    break;
                case 2:
                    System.out.println("Anda memilih mata kuliah: Pemrograman Berorientasi Objek (Nilai: " + pemrogramanBerorientasiObjek + ")");
                    if (pemrogramanBerorientasiObjek >= 75) {
                        System.out.println("STATUS: ELIGIBLE! Anda lulus seleksi Asisten Dosen.");
                    } else {
                        System.out.println("STATUS: TIDAK ELIGIBLE. Nilai Anda di bawah 75.");
                    }
                    break;
                case 3:
                    System.out.println("Anda memilih mata kuliah: Basis Data (Nilai: " + basisData + ")");
                    if (basisData >= 75) {
                        System.out.println("STATUS: ELIGIBLE! Anda lulus seleksi Asisten Dosen.");
                    } else {
                        System.out.println("STATUS: TIDAK ELIGIBLE. Nilai Anda di bawah 75.");
                    }
                    break;
                case 4:
                    System.out.println("Anda memilih mata kuliah: Algoritma dan Pemrograman (Nilai: " + adp + ")");
                    if (adp >= 75) {
                        System.out.println("STATUS: ELIGIBLE! Anda lulus seleksi Asisten Dosen.");
                    } else {
                        System.out.println("STATUS: TIDAK ELIGIBLE. Nilai Anda di bawah 75.");
                    }
                    break;
                case 5:
                    System.out.println("Anda memilih mata kuliah: Rekayasa Perangkat Lunak (Nilai: " + rpl + ")");
                    if (rpl >= 75) {
                        System.out.println("STATUS: ELIGIBLE! Anda lulus seleksi Asisten Dosen.");
                    } else {
                        System.out.println("STATUS: TIDAK ELIGIBLE. Nilai Anda di bawah 75.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Program berakhir.");
                    break;
            }
        } else {
            System.out.println("Maaf, predikat Anda (" + predikatNilai + ") belum memenuhi syarat.");
            System.out.println("Anda tidak lulus seleksi asisten dosen.");
        }
        System.out.println("Terima kasih telah menggunakan sistem program seleksi asisten dosen.");
        ns.close();
    }
}
