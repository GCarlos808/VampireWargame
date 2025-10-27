package modelos;


public class Necromancer extends Pieza {

    public Necromancer(int vida,int ataque, int escudo, String color){
        super(3, 4, 1, color);
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
