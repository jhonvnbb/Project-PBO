package projekpbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjekPBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Buku buku1 = new Buku(123456, "Pemrograman Berorientasi Objek", "Jhon V Nababan", true);
        Buku buku2 = new Buku(113355, "Pemrograman Interpreter", "Wayan Santie Arif", true);
        Buku buku3 = new Buku(224466, "Multimedia", "Rio Arisandi", true);

        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan("Wayan", 2257051031L, "Jl. ABC");
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Jhon", 2217051087L, "Jl. ABC");

        Admin admin = new Admin();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Tampilkan Daftar Anggota");
            System.out.println("3. Generate Laporan");
            System.out.println("4. Cari Buku");
            System.out.println("0. Exit");

            System.out.print("Masukkan pilihan (0-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    List<Buku> daftarBuku = new ArrayList<>();
                    daftarBuku.add(buku1);
                    daftarBuku.add(buku2);
                    daftarBuku.add(buku3);
                    admin.manajemenBuku(daftarBuku);
                    break;
                case 2:
                    List<AnggotaPerpustakaan> daftarAnggota = new ArrayList<>();
                    daftarAnggota.add(anggota);
                    daftarAnggota.add(anggota1);
                    admin.manajemenAnggota(daftarAnggota);
                    break;
                case 3:
                    List<TransaksiPeminjaman> daftarTransaksiPeminjaman = new ArrayList<>();
                    List<TransaksiPengembalian> daftarTransaksiPengembalian = new ArrayList<>();
                    admin.generateLaporan(daftarTransaksiPeminjaman, daftarTransaksiPengembalian);
                    break;
                case 4:
                    System.out.println("Find Book");
                    System.out.print("Masukkan judul buku: ");
                    input.nextLine();
                    String judulCari = input.nextLine();
                    List<Buku> daftarBuku1 = new ArrayList<>();
                    daftarBuku1.add(buku1);
                    daftarBuku1.add(buku2);
                    daftarBuku1.add(buku3);
                    anggota.cariDanTampilkanBuku(daftarBuku1, judulCari);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}


