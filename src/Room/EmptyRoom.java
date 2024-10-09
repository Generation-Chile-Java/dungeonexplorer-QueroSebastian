package Room;

import Interfaz.Room;
import Personaje.Player;

public class EmptyRoom implements Room {
    @Override
    public void enter(Player player) {
        System.out.println("Este lugar parece silencioso, has entrado en una habitación vacía");
    }
}
