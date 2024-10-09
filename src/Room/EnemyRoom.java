package Room;

import Interfaz.*;
import Personaje.Player;


public class EnemyRoom implements Room, GameObject {
    private int damage;

    public EnemyRoom(int damage){
            this.damage = damage;
    }

    @Override
    public void enter(Player player){
        System.out.println("Has entrado en una habitación con un enemigo!");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.takeDamage(damage);
        System.out.println("Un enemigo te ha atacado y te ha inflingido: " + damage + " de daño.");

    }
}
