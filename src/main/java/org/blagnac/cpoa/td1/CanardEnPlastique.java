package org.blagnac.cpoa.td1;

import org.blagnac.cpoa.comportements.cancaner.impl.Cancan;
import org.blagnac.cpoa.comportements.voler.impl.NePasVoler;

/**
 * @author bruel
 *
 */

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique() {
		comportementCancan = new Cancan();
		comportementVol = new NePasVoler();
	}

	@Override
	public String afficher() {
		String info = "Je suis un CanardEnPlastique!";
		System.out.println(info);
		return info;
	}

}
