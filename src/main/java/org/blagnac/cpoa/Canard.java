package org.blagnac.cpoa;
/**
 * @author bruel
 *
 */
abstract public class Canard {

	public String cancaner() {
		String info = "Je cancane!";
		System.out.println(info);
		return info;
	}

	public String nager() {
		String info = "Je nage comme un Canard!";
		System.out.println(info);
		return info;
}

	abstract public String afficher();
	
}