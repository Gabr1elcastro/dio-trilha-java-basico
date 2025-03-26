package sistema_smart_tv;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumnetarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void aumentarVolume(){
     //volume = volume + 1;   
        volume++;
    }

}
