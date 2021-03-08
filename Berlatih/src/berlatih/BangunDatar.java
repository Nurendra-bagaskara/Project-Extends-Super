/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berlatih;

/**
 *
 * @author ASUS
 */
public class BangunDatar {

    // variable instance
    double jari2;
    double phi;
    double hasil;

    void Nilai(double jari2, double phi) {
        this.phi = phi;
        this.jari2 = jari2;
    }

    void hitung() {
        hasil = phi * jari2 * jari2;
        System.out.println("Hasil dari Luas Lingkaran adalah : " + hasil);
    }

}
