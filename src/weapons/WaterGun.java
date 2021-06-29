package weapons;

import weapons.Weapon;

public class WaterGun extends Weapon {
    @Override
    public void shoot() {
        System.out.println("Pew Pew :)");
    }
}