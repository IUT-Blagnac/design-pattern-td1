package org.blagnac.cpoa;
/**
 * @author bruel
 *
 */
public class Mandarin extends Canard {

	@Override
	public String afficher() {
		String info = "Je suis un Mandarin!";
		System.out.println(info);
		return info;
	}

}