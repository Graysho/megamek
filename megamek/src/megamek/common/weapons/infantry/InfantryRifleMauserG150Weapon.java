/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.TechConstants;

/**
 * @author Ben Grills
 */
public class InfantryRifleMauserG150Weapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantryRifleMauserG150Weapon() {
        super();

        name = "Rifle (M&G G-150)";
        setInternalName(name);
        addLookupName("InfantryM&GG150");
        addLookupName("Mauser and Grey G-150");
        ammoType = AmmoType.T_NA;
        cost = 270;
        bv = 1.64;
        flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
        infantryDamage = 0.32;
        infantryRange = 2;
        introDate = 3053;
        techLevel.put(3053, TechConstants.T_IS_EXPERIMENTAL);
        techLevel.put(3060, TechConstants.T_IS_ADVANCED);
        techLevel.put(3075, TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[] { RATING_X,RATING_X ,RATING_C ,RATING_B};
        techRating = RATING_C;
        rulesRefs = "273, TM";
    }
}
