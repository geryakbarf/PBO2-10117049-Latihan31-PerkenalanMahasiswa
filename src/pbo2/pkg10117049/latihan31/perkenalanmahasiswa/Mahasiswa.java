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
public class Mahasiswa {

    public String nama;
    public String nim;

    public void perkenalkanDiri(String parNim, String parNama) {
        System.out.println("Hello everyone");
        System.out.println("My nim is : " + parNim);
        System.out.println("My name is : " + parNama);
        System.out.println("");
    }
}
