package Sala;

import Room.*;
import Personaje.Player;


public class Inferno extends EnemyRoom {
    private int damage;

    public Inferno(int damage){
        super(damage);
        this.damage = damage;
    }

    @Override
    public void enter(Player player){
        System.out.println("///////////////////////////////////////////");
        System.out.println("Juanito despertó en el infierno, rodeado de llamas y gritos distantes.");
        System.out.println("Enfrente suyo, una figura imponente emergió de las sombras: el Diablo en persona.");
        System.out.println("Con un solo golpe, el Diablo lanzó a Juanito contra las rocas, dejándolo al borde de la muerte.");
        System.out.println("¿Quién osa entrar a mi dominio? rugió el Diablo...");
        System.out.println("pero Juanito, con su última pizca de fuerza, sacó la llave de oro que había encontrado en el cine.");
        System.out.println("la llave brilló intensamente, cegando al Diablo por un instante,");
        System.out.println("aprovechando la distracción, Juanito se levantó, determinado a encontrar una salida de ese abismo ardiente.");
        System.out.println("sabe que la llave es su única esperanza, y con cada paso, su voluntad de sobrevivir se fortalece...");
        System.out.println("Enfrentándose a lo desconocido con valentía.");
        System.out.println("Juanito, a pasos agigantados y respiración intensa encuentra un portal...  logra escapar del infierno y sobrevivir al mismísimo Diablo");
        System.out.println("///////////////////////////////////////////");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.takeDamage(damage);
        System.out.println("Un enemigo te ha atacado y te ha inflingido: " + damage + " de daño.");

    }
}