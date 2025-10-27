package modelos;


public class Zombie extends Pieza {

    public Zombie(int vida,int ataque, int escudo, String color){
        super(1, 1, escudo, color);
    }
    
    @Override
    public void mover(int mover){
        
    }
    
    @Override
    public void atacar(int atacar){
        
    }
    
    @Override
    public Boolean ataqueEspecial(){
        return false;
    }
}
