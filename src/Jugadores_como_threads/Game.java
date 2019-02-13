package Jugadores_como_threads;

public class Game {
    public static final int MAX_TURNOS = 10;

    public static void main(String[] args) {

        Player jugador1 = new Player("Ping");
        Player jugador2 = new Player("Pong");

        jugador1.setNextPlayer(jugador2);
        jugador2.setNextPlayer(jugador1);

        System.out.println("Game starting...!");

        jugador1.setEs_su_turno(true);
        Thread jugada1 = new Thread(jugador1);
        jugada1.start();
        Thread jugada2 = new Thread(jugador2);
        jugada2.start();

        try{
            jugada1.join();
            jugada2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Game finished!!");

    }
}
