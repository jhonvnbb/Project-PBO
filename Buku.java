package projekpbo;

class Buku {
    private int noIsbn;
    private String judulBuku;
    private String pengarang;
    private boolean statusTersedia;

    public Buku(int noIsbn, String judulBuku, String pengarang, boolean statusTersedia) {
        this.noIsbn = noIsbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.statusTersedia = statusTersedia;
    }

    public int getNoIsbn() {
        return noIsbn;
    }

    public void setNoIsbn(int noIsbn) {
        this.noIsbn = noIsbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public boolean isStatusTersedia() {
        return statusTersedia;
    }

    public void setStatusTersedia(boolean statusTersedia) {
        this.statusTersedia = statusTersedia;
    }

    public void pinjamBuku() {
        if (statusTersedia) {
            System.out.println("Buku dengan judul :" + judulBuku + " berhasil dipinjam.");
            statusTersedia = false;
        } else {
            System.out.println("Maaf, buku dengan judul :" + judulBuku + " tidak tersedia untuk dipinjam.");
        }
    }

    public void kembalikanBuku() {
        if (!statusTersedia) {
            System.out.println("Buku dengan judul :" + judulBuku + " berhasil dikembalikan.");
            statusTersedia = true;
        } else {
            System.out.println("Error: Buku dengan judul :" + judulBuku + " sudah tersedia.");
        }
    }
}

