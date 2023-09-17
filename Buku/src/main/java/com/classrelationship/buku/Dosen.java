/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classrelationship.buku;

/**
 *
 * @author ASUS
 */
class Dosen extends Anggota {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }
}
