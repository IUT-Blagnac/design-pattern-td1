package org.blagnac.cpoa;
/**
 * @author bruel
 *
 */

public class CanardEnPlastique extends Canard {

	@Override
	public String afficher() {
		String info = "Je suis un CanardEnPlastique!";
		System.out.println(info);
		return info;
	}

	@Override
	public String voler() {
		String info = "I can't!";
		System.out.println(info);
		return info;	
	}

}
