package weapons;

import weapons.Weapon;

public class RPG extends Weapon {
    @Override
    public void shoot() {
        System.out.println("BIG Bada-Boom!");
    }
}