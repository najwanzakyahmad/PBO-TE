/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classrelationship.buku;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Java Programming");
        Buku buku2 = new Buku("Data Structures");
        
        Perpustakaan perpustakaan = new Perpustakaan("Universitas XYZ");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Mahasiswa mahasiswa = new Mahasiswa("Alice", "M12345");
        Dosen dosen = new Dosen("Dr. Bob", "D98765");

        System.out.println("Selamat datang di " + perpustakaan.getNama());
        System.out.println(mahasiswa.getNama() + " (" + mahasiswa.getNim() + ") adalah anggota.");
        System.out.println(dosen.getNama() + " (" + dosen.getNip() + ") adalah anggota.");
    }
}