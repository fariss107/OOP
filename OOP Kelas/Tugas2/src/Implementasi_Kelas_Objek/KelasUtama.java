/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementasi_Kelas_Objek;

/**
 *
 * @author Annisa Olga Z
 */
public class KelasUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Mahasiswa Unyil=new Mahasiswa(); //kita buat objek mhssw dgn nama Unyil
	Mahasiswa Usro=new Mahasiswa(); //kita buat objek mhssw dgn nama Usro
        Mahasiswa Ucrit=new Mahasiswa(15202204, "Ucrit");
        
	Unyil.setNIM(15202201);
	Unyil.nama="Unyil Surunyil"; //melanggar prinsip OOP
	Unyil.setNama("Unyil Surunyil"); //seharusnya begini
	Usro.setNIM(15202202);
        
	System.out.println("NIM mahasiswa 1 "+Unyil.getNIM());
	System.out.println("NIM mahasiswa 2 "+Usro.getNIM());
	System.out.println("NIM mahasiswa 3 "+Ucrit.getNIM()+
			"Nama "+Ucrit.getNama());
    }

}
