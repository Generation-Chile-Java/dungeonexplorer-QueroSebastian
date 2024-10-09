package Sala;

import Room.*;
import Personaje.Player;


public class Cinema extends TreasureRoom {
    private String treasure;

    public Cinema(String treasure) {
        super(treasure);
        this.treasure = treasure;
    }

    @Override
    public void enter(Player player) {
        System.out.println("///////////////////////////////////////////");
        System.out.println("Una noche, Juanito el Vandolero decidió refugiarse en un viejo cine abandonado.");
        System.out.println("Las butacas, cubiertas de polvo, se alineaban en penumbra...");
        System.out.println("Al explorar, algo brilló debajo de uno de los asientos,");
        System.out.println("era una llave de oro, perdida en el olvido.");
        System.out.println("Juanito, intrigado por su origen, la guardó en su bolsillo,");
        System.out.println("sabiendo que esta llave misteriosa lo llevaría a su próxima aventura.");
        System.out.println("Juanito se retira del lugar...");
        System.out.println("///////////////////////////////////////////");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.collectTreasure(treasure);
        System.out.println("Acabas de encontrar un tesoro: '" +  treasure + "' se ha añadido a tu inventario");
    }
}