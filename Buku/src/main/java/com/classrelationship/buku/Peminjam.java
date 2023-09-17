/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classrelationship.buku;

/**
 *
 * @author ASUS
 */
// Kelas yang menggambarkan "Dependency" dengan menggunakan "Buku"
class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tanggalPeminjaman;

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPeminjaman) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public String getInfoPeminjaman() {
        return anggota.getNama() + " meminjam buku '" + buku.getJudul() + "' pada tanggal " + tanggalPeminjaman;
    }
}
