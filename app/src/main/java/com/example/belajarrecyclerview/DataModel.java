package com.example.belajarrecyclerview;

public class DataModel {

    private Integer gambar;
    private String Nama;
    private String alamat;

    private String noTelp;

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public Integer getGambar() {
        return gambar;
    }

    public void setGambar(Integer gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public DataModel(Integer gambar, String Nama, String alamat, String noTelp) {
        this.gambar = gambar;
        this.Nama = Nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }


}
