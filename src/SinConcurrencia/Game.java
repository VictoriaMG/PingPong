package SinConcurrencia;
// Basado en: http://raulavila.com/2015/05/multithreading-1/
public class Game {
    //Variables
    public static final int MAX_TURNOS = 10;

    //Main
    public static void main(String[] args) {
        //Creamos los jugadores
        Player jugador1 = new Player("Ping");
        Player jugador2 = new Player("Pong");
        //Establecemos los siguientes jugadores para cada uno
        //Sino dara NullPointerException
        jugador1.setNextPlayer(jugador2);
        jugador2.setNextPlayer(jugador1);
        //Empieza el juego
        System.out.println("Game starting...!");
        jugador1.play();
        System.out.println("Game finished!");
    }
}
