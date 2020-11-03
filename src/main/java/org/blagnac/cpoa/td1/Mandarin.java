package org.blagnac.cpoa.td1;

import org.blagnac.cpoa.comportements.cancaner.impl.Cancan;
import org.blagnac.cpoa.comportements.voler.impl.VolerAvecDesAiles;

/**
 * @author bruel
 *
 */
public class Mandarin extends Canard {

	public Mandarin() {
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}
	
	@Override
	public String afficher() {
		String info = "Je suis un Mandarin!";
		System.out.println(info);
		return info;
	}

}