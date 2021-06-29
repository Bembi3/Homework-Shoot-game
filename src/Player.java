import weapons.MachineGun;
import weapons.Pistol;
import weapons.WaterGun;
import weapons.Weapon;

class Player {
    // Указываем тип данных weapons.Weapon, который будет храниться в "слотах игрока"
    private final Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new MachineGun(),
                new Pistol(),
                new WaterGun()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }


    public void shotWithWeapon(int slot) {
            slot--;
                if (slot < 0 || slot >= getSlotsCount()){
            System.out.println("Такого оружия нет. Попробуй снова");
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shoot();
    }
}

