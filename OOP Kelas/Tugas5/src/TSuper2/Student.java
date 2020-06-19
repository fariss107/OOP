/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSuper2;

/**
 *
 * @author Annisa Olga Z
 */
public class Student extends Person 
{ 
	void message() 
	{ 
		System.out.println("This is student class"); 
	} 
	// Note that display() is only in Student class 
	void display() 
	{ 
		// will invoke or call current class message() method 
		message(); 
		// will invoke or call parent class message() method 
		super.message(); 
	}     
}

