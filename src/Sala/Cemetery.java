package Sala;

import Room.*;
import Personaje.Player;


public class Cemetery extends EnemyRoom {
    private int damage;

    public Cemetery(int damage){
        super(damage);
        this.damage = damage;
    }

    @Override
    public void enter(Player player){
        System.out.println("///////////////////////////////////////////");
        System.out.println("En una noche sombría, Juanito el Vandolero llegó a un cementerio abandonado.");
        System.out.println("En busca de un antiguo tesoro... pero lo que encontró fue mucho más aterrador.");
        System.out.println("De repente, las tumbas comenzaron a abrirse, y de ellas emergieron zombies hambrientos.");
        System.out.println("Juanito, sorprendido, sacó su espada de madera y luchó con valentía.");
        System.out.println("A pesar del miedo, su determinación y habilidades le permitieron derrotar a los no muertos,");
        System.out.println("pero sin entender nada, siente algo frío en uno de sus tobillos...");
        System.out.println("Mira hacia el suelo y Juanito logra ver cómo uno de los no muertos se aferra a su pierna.");
        System.out.println("¡No superarás esto... ya vimos la copa que llevas en el bolsillo Juanito!, gritó un zombie que parecía ser un Líder");
        System.out.println("No debiste ingresar a la zona de los no muertos!...");
        System.out.println("Juanito sin poder moverse, es atacado con una mordida del líder de los no muertos.");
        System.out.println("El amuleto brillaba desde su bolsillo y sólo con tocar la copa juanito fue transportado a un nuevo lugar...");
        System.out.println("Juanito sólo logra ver cómo viaja a través de lúces para despertar bajo un puente...");
        System.out.println("///////////////////////////////////////////");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.takeDamage(damage);
        System.out.println("Un enemigo te ha atacado y te ha inflingido: " + damage + " de daño.");

    }
}