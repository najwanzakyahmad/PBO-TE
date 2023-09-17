/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classrelationship.buku;


import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author ASUS
 */
// Kelas yang menggambarkan "Aggregation"
class Perpustakaan {
    private String nama;
    private List<Buku> koleksiBuku = new ArrayList<>();

    public Perpustakaan(String nama) {
        this.nama = nama;
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }
    
    public String getNama() {
        return nama;
    }
}
