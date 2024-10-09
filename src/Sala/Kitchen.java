package Sala;

import Room.*;
import Personaje.Player;


public class Kitchen extends EmptyRoom {
    @Override
    public void enter(Player player) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Una noche, Juanito el Vandalero decidió explorar una antigua mansión.");
        System.out.println("Según los rumores, estaba encantada...");
        System.out.println("Caminando con cautela por los pasillos oscuros y polvorientos, llegó a la cocina.");
        System.out.println("Era una sala enorme, llena de utensilios antiguos y muebles cubiertos de telarañas.");
        System.out.println("Sin embargo, lo que más le llamó la atención fue el silencio absoluto que reinaba en el lugar.");
        System.out.println("Con cada paso que daba, el crujido del suelo de madera resonaba en la cocina vacía.");
        System.out.println("Aparentemente no hay nada bueno en este lugar");
        System.out.println("Al abrir una alacena, un agujero sin fondo apareció bajo sus pies,");
        System.out.println("y antes de poder reaccionar, Juanito cayó al vacío...");
        System.out.println("----------------------------------------------------------------------");
    }
}