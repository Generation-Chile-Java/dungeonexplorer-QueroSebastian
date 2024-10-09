package Room;

import Interfaz.Room;
import Interfaz.GameObject;
import Personaje.Player;


public class TreasureRoom implements Room, GameObject {
    private String treasure;

    public TreasureRoom(String treasure) {
        this.treasure = treasure;
    }

    @Override
    public void enter(Player player) {
        System.out.println("Acabas de entrar a una habitación con un tesoro");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.collectTreasure(treasure);
        System.out.println("Acabas de encontrar un tesoro: '" +  treasure + "' se ha añadido a tu inventario");
    }
}
