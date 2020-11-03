
package org.blagnac.cpoa.comportements.cancaner.impl;

import org.blagnac.cpoa.comportements.cancaner.ComportementCancan;

public class Cancan implements ComportementCancan {

	@Override
	public String cancaner() {
		String info = "Je cancane!";
		System.out.println(info);
		return info;
	}

}
