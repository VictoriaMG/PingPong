package SinConcurrencia;

public class Player {
    //Variables
    private final String texto;
    private Player nextPlayer;
    private int turno = Game.MAX_TURNOS;

    //Metodos
    public Player(String texto) {
        this.texto = texto;
    }
    public void setNextPlayer(Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
    public void play(){
        if(!juegoAcabado()){
            System.out.println(texto);
            turno--;
            nextPlayer.play();
        }
    }
    public boolean juegoAcabado(){
        return turno == 0;
    }

}
