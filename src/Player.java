class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
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


    public void shotWithWeapon(int slot) throws Exception {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно
        try {
            slot--;
            if (slot < 0 || slot >= getSlotsCount())
                throw new IllegalArgumentException("Такого оружия нет. Попробуй снова");
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return;
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shoot();
    }
}

