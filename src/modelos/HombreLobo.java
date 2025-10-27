package modelos;


public class HombreLobo extends Pieza {

    public HombreLobo(int vida,int ataque, int escudo, String color){
        super(5, 5, 2, color);
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
