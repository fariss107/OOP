/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;

/**
 *
 * @author Annisa Olga Z
 */
public class Car {
//engine is a mandatory part of the car

 private final Engine engine;


 Car (String jenis) {

    engine = new Engine(jenis);

 }

 

 public Engine getEngine () {

	return this.engine;

 }    
}
