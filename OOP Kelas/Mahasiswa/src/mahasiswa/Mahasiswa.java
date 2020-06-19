/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Faris
 */
public class Mahasiswa {

	int NIM;

	String nama;

	String alamat;

	

	Mahasiswa(){}

	

	Mahasiswa(int NIM, String nama){

		this.NIM=NIM;

		this.nama=nama;

	}

	

	public void setNIM(int NIM) {

		this.NIM=NIM;

	}

	

	public void setNama(String nama) {

		this.nama=nama;

	}



	public int getNIM() {

		return this.NIM;

	}

	public String getNama() {

		return this.nama;

	}





public class KelasUtama {



	public static void main(String[] args) {

	Mahasiswa Unyil=new Mahasiswa(); //kita buat objek mhssw dgn nama Unyil

	Mahasiswa Usro=new Mahasiswa(); //kita buat objek mhssw dgn nama Usro



	Unyil.setNIM(15202201);

	Unyil.nama="Unyil Surunyil"; //melanggar prinsip OOP

	Unyil.setNama("Unyil Surunyil"); //seharusnya begini

	Usro.setNIM(15202202);

	

	Mahasiswa Ucrit=new Mahasiswa(15202204, "Ucrit");

	

	System.out.println("NIM mahasiswa 1 "+Unyil.getNIM());

	System.out.println("NIM mahasiswa 2 "+Usro.getNIM());

	System.out.println("NIM mahasiswa 3 "+Ucrit.getNIM()+

			"Nama "+Ucrit.getNama());

	}



}


    

