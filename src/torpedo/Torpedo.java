package torpedo;

import java.util.Random;

public class Torpedo {

    public static void main(String[] args) {
        String[] palya = {"_", "_", "_", "_", "_", "_", "_"};
        
        Random rnd = new Random();
        for (int i = 0; i < palya.length; i++) {
                rnd.nextBoolean();
                if (true) {
                    palya[i] = "X";
                }else{
                    palya[i] = "_";
                } 

                System.out.println(palya);
            }
        
            
            
        
    }
    
}
