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

}
