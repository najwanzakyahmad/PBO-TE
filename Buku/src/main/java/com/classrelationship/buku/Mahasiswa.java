/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classrelationship.buku;

/**
 *
 * @author ASUS
 */
class Mahasiswa extends Anggota {
    private String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
}