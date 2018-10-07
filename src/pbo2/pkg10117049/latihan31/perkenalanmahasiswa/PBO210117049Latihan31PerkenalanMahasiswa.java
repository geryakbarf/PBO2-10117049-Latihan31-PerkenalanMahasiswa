/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program yang memiliki 1 class tambahan
 * untuk memperkenalkan Mahasiswa
 */
public class PBO210117049Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);

        Mahasiswa mhs2 = new Mahasiswa();

        mhs2.nim = "10110270";
        mhs2.nama = "Indra Tiola";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);

        Mahasiswa mhs3 = new Mahasiswa();

        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tansil Ganefi";
        mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
        
        Mahasiswa mhs4 = new Mahasiswa();
        
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awaludin";
        mhs4.perkenalkanDiri(mhs4.nim, mhs4.nama);

    }

}
