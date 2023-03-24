package fibonacci;

import java.util.List;
import java.util.ArrayList;

public class fibonacci { 
    
        int fibo = 0;
        int fibo2 = 1;
        int aux;
        int limite = 1000000;
        List<Integer> Fibonacci = new ArrayList<Integer>();

        public List<Integer> generar_llenar_serie(){
        
        while (fibo2 + fibo <= limite) {
            aux = fibo;
            fibo = fibo2;
            fibo2 = aux + fibo;
            
            Fibonacci.add (fibo2);
            
        }
        	System.out.println(Fibonacci);
        
        return Fibonacci;
        
        
        
    }
        
}

