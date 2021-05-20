import java.util.ArrayList;
import java.util.Scanner;

public class Arraypromediodeunalista {

    public static void main(String[] args) {
        // primero lee la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Agrega los numeros a una lista hasta que la usuario escribe -1
        
        ArrayList<Integer> list = new ArrayList<>();
         while (true) {
          int input = Integer.valueOf(scanner.nextLine());
          if (input == -1){
              break;
              
          }
           //calcula el promedio de los números de la lista.
        
          list.add(input);
         
         }
         
         int sum = 0;
         for (Integer integer : list ){
         sum += integer;
        
         }
         
         //lo imprime.
                
        System.out.println("Average: " + (sum * 1.0 / list.size()));
      
              
    }
}