package projekpbo;

import java.util.List;

public class TransaksiPeminjaman extends Notifikasi {
    private String tanggalPinjam;
    private String waktuPinjam;
    private String durasiPinjam;

    public TransaksiPeminjaman(String tanggalPinjam, String waktuPinjam, String durasiPinjam) {
        this.tanggalPinjam = tanggalPinjam;
        this.waktuPinjam = waktuPinjam;
        this.durasiPinjam = durasiPinjam;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getWaktuPinjam() {
        return waktuPinjam;
    }

    public void setWaktuPinjam(String waktuPinjam) {
        this.waktuPinjam = waktuPinjam;
    }

    public String getDurasiPinjam() {
        return durasiPinjam;
    }

    public void setDurasiPinjam(String durasiPinjam) {
        this.durasiPinjam = durasiPinjam;
    }
    @Override
    public void notifikasiBatasWaktu() {
        System.out.println("Notifikasi: Batas waktu peminjaman telah mencapai.");
    }

}
