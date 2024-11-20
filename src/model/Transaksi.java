package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Transaksi {
    private String nama;
    private double jumlah;
    private String kategori;
    private String tanggal;

    // Constructor
    public Transaksi(String nama, double jumlah, String kategori, String tanggal) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.kategori = kategori;
        this.tanggal = tanggal;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jumlah: " + jumlah + ", Kategori: " + kategori + ", Tanggal: " + tanggal;
    }
}
