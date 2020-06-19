/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Annisa Olga Z
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	Mahasiswa Unyil = new Mahasiswa();

		Unyil.setNama("Unyil");

		Unyil.setAlamat("Bandung");

		Unyil.setNIM(2022);

		

		Manusia Ogah=new Manusia();

		Ogah.setNama("Ogah Ogahan");

//		Ogah.setNIM(2003); //error karena kelas manusia tidak punya NIM
        System.out.println("NIM Mahasiswa    : "+ Unyil.getNIM());
        System.out.println("Nama Mahasiswa   : "+ Unyil.getNama());
        System.out.println("Alamat Mahasiswa : "+ Unyil.getAlamat());


	}

}