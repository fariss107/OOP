/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSuper1;

/**
 *
 * @author Annisa Olga Z
 */
public class Mobil {
	int kecMax=120;
}
class MobilBalap extends Mobil{
	int kecMax=300;

	public void tampil() {
		System.out.println("Kec maks mobil biasa "+super.kecMax);
		System.out.println("Kec maks mobil balap "+kecMax);
		System.out.println("Kec maks mobil balap "+this.kecMax);
	}    
}
