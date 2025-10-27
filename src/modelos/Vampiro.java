package modelos;


public class Vampiro extends Pieza {

    public Vampiro(int vida,int ataque, int escudo, String color){
        super(4, 3, 5, color);
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
