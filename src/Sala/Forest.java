package Sala;

import Room.*;
import Personaje.Player;


public class Forest extends TreasureRoom {
    private String treasure;

    public Forest(String treasure) {
        super(treasure);
        this.treasure = treasure;
    }

    @Override
    public void enter(Player player) {
        System.out.println("///////////////////////////////////////////");
        System.out.println("Al parecer, se quedó dormido...");
        System.out.println("Despiertas y te encuentras en El Bosque Encantado.");
        System.out.println("En el corazón del Bosque Encantado, el joven llamado Juanito el Vandolero");
        System.out.println("descubrió un Búho que le entregó una Copa de Cristal,");
        System.out.println("diciendo que la Copa abrirá un portal que lo llevaría a su verdadero destino.");
        System.out.println("Una Copa de Cristal que parece servir para algo...");
        System.out.println("Luego, al tocar la copa, fue transportado a un lugar extraño...");
        System.out.println("///////////////////////////////////////////");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.collectTreasure(treasure);
        System.out.println("Acabas de encontrar un tesoro: '" +  treasure + "' se ha añadido a tu inventario");
    }
}
