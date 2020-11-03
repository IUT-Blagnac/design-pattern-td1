package org.blagnac.cpoa.td1;

import org.blagnac.cpoa.comportements.cancaner.impl.Cancan;
import org.blagnac.cpoa.comportements.voler.impl.VolerAvecDesAiles;

/**
 * @author bruel
 *
 */
public class Colvert extends Canard {

	public Colvert() {
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

	@Override
	public String afficher() {
		String info = "Je suis un Colvert!";
		System.out.println(info);
		return info;
	}

}