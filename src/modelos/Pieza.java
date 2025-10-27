package modelos;


public abstract class Pieza {

    protected int vida;
    protected int ataque;
    protected int escudo;
    protected String color;
    
    public Pieza(int vida, int ataque, int escudo, String color){
        this.vida = vida;
        this.ataque = ataque;
        this.escudo = escudo;
        this.color = color;
    }
    
    protected int mover;
    protected int atacar;
    
    
    public abstract void mover(int mover);
    
    public abstract void atacar(int atacar);
    
    public Boolean ataqueEspecial(){
        return false;
    }
}   
