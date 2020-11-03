
package org.blagnac.cpoa.comportements.voler.impl;

import org.blagnac.cpoa.comportements.voler.ComportementVol;

public class VolerAvecDesAiles implements ComportementVol {

	@Override
	public String voler() {
		String info = "Je vole avec des ailes!";
		System.out.println(info);
		return info;
	}

}