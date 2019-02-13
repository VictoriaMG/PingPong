package Jugadores_como_threads;

public class Player implements Runnable{
    private final String texto;
    private int turnos =Game.MAX_TURNOS;
    private Player nextPlayer;
    private volatile boolean es_su_turno=false;


    @Override
    public void run() {
        //Codigo que se ejecuta en el hilo
        while (!acabado()){
            //Cuando no es su turno no hace nada
            while (!es_su_turno);
            System.out.println(texto);
            turnos--;
            setEs_su_turno(false);
            nextPlayer.setEs_su_turno(true);
        }

    }

    public Player(String texto) {
        this.texto = texto;
    }
    public boolean acabado (){
        return turnos == 0;
    }

    public void setNextPlayer(Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public void setEs_su_turno(boolean es_su_turno) {
        this.es_su_turno = es_su_turno;
    }
}
