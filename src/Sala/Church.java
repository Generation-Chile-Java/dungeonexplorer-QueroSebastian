package Sala;

import Room.*;
import Personaje.Player;


public class Church extends EnemyRoom {
    private int damage;

    public Church(int damage){
        super(damage);
        this.damage = damage;
    }

    @Override
    public void enter(Player player){
        System.out.println("///////////////////////////////////////////");
        System.out.println("Juanito el Vandolero viajaba por los caminos polvorientos del viejo pueblo.");
        System.out.println("Una tarde, al acercarse el crepúsculo, llegó a una pequeña iglesia.");
        System.out.println("El cura del pueblo, un hombre de apariencia amable, le dio la bienvenida.");
        System.out.println("Esa noche, mientras Juanito se acomodaba en una de las bancas para descansar, escuchó un susurro...");
        System.out.println("El cura se acercó lentamente, y ante los ojos de Juanito, comenzó a transformarse.");
        System.out.println("Su piel se tornó roja como el fuego, sus ojos se iluminaron con un brillo demoníaco y cuernos afilados emergieron de su cabeza.");
        System.out.println("¡Así que has llegado, Juanito!, rugió el demonio.");
        System.out.println("Este pueblo es mío, y tú serás mi ofrenda.");
        System.out.println("Sin poder reaccionar, el demonio se acerca a Juanito dándole un golpe en su mejilla que apenas lo daña.");
        System.out.println("El demonio grita: Notaste mi velocidad Juanito... el Maldito Vandolero!");
        System.out.println("Juanito, sin perder la calma, sacó de su bolsa un amuleto que había encontrado en una de sus aventuras pasadas...");
        System.out.println("el amuleto brillaba con luz pura y cuando Juanito levantó aquella copa, el demonio gritó y retrocedió");
        System.out.println("Juanito sólo recibe la mitad de daño y logra ver cómo el demonio desaparece lentamente entre las sombras de la iglesia");
        System.out.println("///////////////////////////////////////////");
        interact(player);
    }

    @Override
    public void interact(Player player) {
        player.takeDamage(damage);
        System.out.println("Un enemigo te ha atacado y te ha inflingido: " + damage + " de daño.");

    }
}