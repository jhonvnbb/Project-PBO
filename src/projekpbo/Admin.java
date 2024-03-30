package projekpbo;

import java.util.List;

class Admin {
    public void manajemenBuku(List<Buku> daftarBuku) {
        if (daftarBuku.isEmpty()) {
            System.out.println("\nTidak ada buku tersedia.");
        } else {
            System.out.println("\nDaftar Buku Tersedia:");
            for (Buku buku : daftarBuku) {
                if (buku.isStatusTersedia()) {
                    System.out.println("No ISBN: " + buku.getNoIsbn() +
                                       ", Judul: " + buku.getJudulBuku() +
                                       ", Pengarang: " + buku.getPengarang());
                }
            }
            
            System.out.println("\nDaftar Buku Telah Dipinjam:");
            for (Buku buku : daftarBuku) {
                if (!buku.isStatusTersedia()) {
                    System.out.println("No ISBN: " + buku.getNoIsbn() +
                                       ", Judul: " + buku.getJudulBuku() +
                                       ", Pengarang: " + buku.getPengarang());
                }
            }
        }
        System.out.println();
   
    }

    public void manajemenAnggota(List<AnggotaPerpustakaan> daftarAnggota) {
        System.out.println("Admin : Manajemen Anggota.");
        if (daftarAnggota.isEmpty()) {
            System.out.println("Tidak ada anggota terdaftar.");
        } else {
            System.out.println("Daftar Anggota Terdaftar:");
            for (AnggotaPerpustakaan anggota : daftarAnggota) {
                System.out.println("Nomor Anggota: " + anggota.getNomorAnggota() +
                                   ", Nama: " + anggota.getNama() +
                                   ", Alamat: " + anggota.getAlamat());
            }
        }
        System.out.println();
    }

    public void generateLaporan(List<TransaksiPeminjaman> daftarTransaksiPeminjaman,
                                List<TransaksiPengembalian> daftarTransaksiPengembalian) {
        System.out.println("Admin : Laporan");
        System.out.println("Transaksi Peminjaman :");
        for (TransaksiPeminjaman transaksi : daftarTransaksiPeminjaman) {
            System.out.println("Tanggal Pinjam: " + transaksi.getTanggalPinjam() +
                               ", Waktu Pinjam: " + transaksi.getWaktuPinjam() +
                               ", Durasi Pinjam: " + transaksi.getDurasiPinjam());
        }

        System.out.println("Transaksi Pengembalian :");
        for (TransaksiPengembalian transaksi : daftarTransaksiPengembalian) {
            System.out.println("Tanggal Kembali: " + transaksi.getTanggalKembali() +
                               ", Waktu Kembali: " + transaksi.getWaktuKembali() +
                               ", Durasi Kembali: " + transaksi.getDurasiKembali());
        }
        System.out.println();
    }
}