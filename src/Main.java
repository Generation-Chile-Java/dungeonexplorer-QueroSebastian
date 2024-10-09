import Interfaz.*;
import Personaje.*;
import Room.*;
import Sala.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player player = new Player("Juanito el Vandolero", 100);
        Room[] dungeon = {
            new Forest("Copa de Cristal"),
            new Church(10),
            new Cemetery(29),
            new Cinema("Llave de oro"),
            new Kitchen(),
            new Inferno(60),
        };

        Scanner scanner = new Scanner(System.in);
        for (Room room: dungeon) {
            if (!player.isAlive()) {
                System.out.println("Game Over!");
                break;
            }

            System.out.println("--------------------------------"); //separación de consola
            room.enter(player);
            System.out.println("---------------"); // separación de entrada del jugador al Room
            player.showStatus(); //mostrar estado del jugador con la acción desde
            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
        }

        if (player.isAlive()) {
            System.out.println("Felicitaciones!, has explorado todas las salas.");
        }

    }
}