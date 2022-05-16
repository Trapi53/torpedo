package torpedo;

import java.util.Random;

public class Palya {
    String palya[];
    
    public Palya(String palya[]) {
        
        
        this.palya = palya;
     
        
    }
    public void PalyaKiir(){
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
                rnd.nextBoolean();
                if (true) {
                    palya[i] = "X";
                }else{
                    palya[i] = "_";
                } 
            }
            System.out.println(palya);
    } 

    public static void main(String[] args) {
        
    }
    
    public String[] getPalya() {
        return palya;
    }    
}
