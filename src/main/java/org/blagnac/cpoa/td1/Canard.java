package org.blagnac.cpoa.td1;

import org.blagnac.cpoa.comportements.cancaner.ComportementCancan;
import org.blagnac.cpoa.comportements.voler.ComportementVol;

/**
 * @author bruel
 * @navassoc - - comportementVol ComportementVol
 * @navassoc - - comportementCancan ComportementCancan
 */
abstract public class Canard {

	/**
	 * @overrideAssoc
	 */
	protected ComportementVol comportementVol;
	/**
	 * @overrideAssoc
	 */
	protected ComportementCancan comportementCancan;

	public final String cancaner() {
		return comportementCancan.cancaner();
	}

	public String nager() {
		String info = "Je nage comme un Canard!";
		System.out.println(info);
		return info;
	}

	abstract public String afficher();

	public final String voler() {
		return comportementVol.voler();
	}

}
