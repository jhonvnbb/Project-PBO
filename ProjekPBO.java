package projekpbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerpustakaanRWJ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Buku buku1 = new Buku(123456, "PBO (Pemrograman Berorientasi Objek)", "Jhon V Nababan", true);
        Buku buku2 = new Buku(113355, "PI (Pemrograman Interpreter)", "Wayan Santie Arif", true);
        Buku buku3 = new Buku(224466, "Multimedia", "Rio Arisandi", true);

        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan("Wayan", 2257051031L, "Jl. ABC");
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Jhon", 2217051087L, "Jl. ABC");

        Admin admin = new Admin();

        int pilihan;
        do {
            System.out.println("Login:");
            System.out.println("1. Admin");
            System.out.println("2. Anggota");
            System.out.println("0. Exit");
            
            System.out.print("Masukkan pilihan (0/1/2): ");
            pilihan = input.nextInt();
            
            switch (pilihan){
                case 1:
                    int pilihan1;
                    do {
                        System.out.println("Menu:");
                        System.out.println("1. Tampilkan Daftar Buku");
                        System.out.println("2. Tampilkan Daftar Anggota");
                        System.out.println("3. Generate Laporan");
                        System.out.println("0. Exit");
                        
                        System.out.print("Masukkan pilihan (0/1/2/3): ");
                        pilihan1 = input.nextInt();
                        
                        switch (pilihan1) {
                            case 1:
                                admin.manajemenBuku(Buku.getDaftarBuku());
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
                            case 0:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                        
                    }while (pilihan1 != 0);
                    break;
                case 2:
                    int pilihan2;
                    do {
                        System.out.println("Menu:");
                        System.out.println("1. Cari Buku");
                        System.out.println("2. Pinjam Buku");
                        System.out.println("3. Pengembalian Buku");
                        System.out.println("0. Exit");
                        
                        System.out.print("Masukkan pilihan (0/1/2/3): ");
                        pilihan2 = input.nextInt();
                        
                        switch (pilihan2){
                            case 1:
                                System.out.println("Find Book");
                                System.out.print("Masukkan judul buku: ");
                                input.nextLine();
                                String judulCari = input.nextLine();
                                anggota.cariDanTampilkanBuku(Buku.getDaftarBuku(), judulCari);
                                break;
                            case 2:
                                System.out.println("Pinjam Buku");
                                System.out.print("Masukkan judul buku: ");
                                input.nextLine();
                                String cariPinjamJudulBuku = input.nextLine();

                                boolean bukuDitemukan = false;
                                for (Buku buku : Buku.getDaftarBuku()) {
                                    if (buku.getJudulBuku().equalsIgnoreCase(cariPinjamJudulBuku) && buku.isStatusTersedia()) {
                                        bukuDitemukan = true;
                                        buku.pinjamBuku();
                                        anggota.getHistoriPeminjaman().add(buku);
                                        break;
                                    }
                                }

                                if (!bukuDitemukan) {
                                    System.out.println("Buku dengan judul \"" + cariPinjamJudulBuku + "\" tidak tersedia atau stok habis.");
                                }
                                break;
                            case 3:
                                System.out.println("Kembalikan Buku");
                                System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                                input.nextLine();
                                String judulKembalikan = input.nextLine();

                                boolean bukuDitemukanKembali = false;
                                for (Buku buku : anggota.getHistoriPeminjaman()) {
                                    if (buku.getJudulBuku().equalsIgnoreCase(judulKembalikan)) {
                                        bukuDitemukanKembali = true;
                                        buku.kembalikanBuku();
                                        break;
                                    }
                                }

                                if (!bukuDitemukanKembali) {
                                    System.out.println("Buku dengan judul \"" + judulKembalikan + "\" tidak ditemukan dalam riwayat peminjaman.");
                                }
                                break;
                            case 0:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                        
                    }while (pilihan2 !=0);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
        }while (pilihan != 0);
    }
}
