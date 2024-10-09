package Personaje;

import java.util.ArrayList;
import java.util.List;


//Encapsulando los atributos del jugador dentro e la clase Player, incluyendo un array para el inventario
//Indicar los atributos del jugador
//Indicar las acciones del jugador como recibir daño, recoger tesoro, saber si está vivo y mostrar los stats del personaje.

public class Player {
    private String name;
    private int health;
    private List<String> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " ha recibido " + damage + " de daño. Ahora su vida es: " + health + ".");
    }

    public void collectTreasure(String treasure) {
        inventory.add(treasure);
        System.out.println(name + " ha recibido " + treasure + ".");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStatus() {
        System.out.println("-ESTADO DEL JUGADOR-");
        System.out.println("Nombre del jugador: " + name + ".");
        System.out.println("Puntos de vida actuales: " + health + " puntos.");
        System.out.println("Items en inventario: " + inventory);
    }


}
