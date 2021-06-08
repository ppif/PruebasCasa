import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class EjeArrayL {
    
    boolean tal=false;
    ArrayList <ArryL> Arr=null;
    	
    
    public static void main(String args[]){
        EjeArrayL obEjeA = new EjeArrayL();
        obEjeA.menu();
    }
    
    public void menu(){
        String op = null;
       do{
           op = JOptionPane.showInputDialog(null,"1. Crear ArrayListn"+"2.  Introducir datos"+"3.  Modificar datos"
        		                                +"4.  Eliminar datos"+"5.  Buscar datos" +"6.  Mostrar datos"
        		                                +"7.  Salir");
           
        // Con JCombobox
           //Object seleccion = JOptionPane.showInputDialog(
              
             // null, "Seleccione opcion",
              //"Selector de opciones",
              //JOptionPane.QUESTION_MESSAGE,
               //null, // null para icono defecto
              //new Object[] { "Crear ArrayList", "Introducir datos", "modificar datos", "eliminar datos", "buscar datos","mostrar datos","salir"}, 
             // "opcion 1");

           //System.out.println("El usuario ha elegido "+seleccion);
           
                                    
           switch(op){
           case "1"://Bloque para crear el array list
               if(!tal){
                  Arr = new ArrayList <ArryL> ();
                  tal=true;
                  JOptionPane.showMessageDialog(null, "Ya se ha creado el array list :D");
               }else{
                   JOptionPane.showMessageDialog(null, "Ya esta creado el Array List", "", JOptionPane.ERROR_MESSAGE);
               }
               break;
           case "2"://Bloque para introducir datos al array list

        	   if(!tal){
                   JOptionPane.showMessageDialog(null, "Crea el array list, usa la opcion 1.");
                  }else{
                      int a; String b;
                       a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero a ingresar: "));
                       b = JOptionPane.showInputDialog(null, "Digite el nombre a ingresar: ");
                       Arr.add(new ArryL(a, b));                        
                  }                   
                  break;
                  
           case "3"://Bloque para modificar datos al array list
               if(!tal){
                JOptionPane.showMessageDialog(null, "Crea el array list, usa la opcion 1.");
               }else{
                    int indice, b;
                    String c;
                    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice a Modificar: "));
                    if(existEnArray(b)){                            
                        indice = indiceDato(b);
                        c = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre al indice: ");
                        Arr.get(indice).setNom(c); 
                    }else{
                        JOptionPane.showMessageDialog(null, "No existe el dato a modificar !", "", JOptionPane.ERROR_MESSAGE);
                    }
               }                   
               break;
               
           case "4"://Bloque para eliminar dato del array
        	   
        	   if(!tal){
                   JOptionPane.showMessageDialog(null, "No existen datos !");
                  }else{
                       int id;
                       id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Id a eliminar: "));
                       for(int i=0; i<Arr.size(); i++){
                           if(Arr.get(i).getId()==id){
                               Arr.remove(i);
                           }
                       }
                  }   
                  break;

           case "5"://Bloque para buscar datos en el array list
        	   
               if(tal){
                   String mostrarBus= "No se ha encontrado nada!";
                   int id;
                   id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Id a buscar: "));
                   for( int i = 0 ; i  < Arr.size(); i++){
                       if(Arr.get(i).getId()==id){
                           mostrarBus  ="";
                           mostrarBus += "Numero posicion "+i+" : "+Arr.get(i).getId();
                           mostrarBus += "nNombre posicion "+i+" : "+Arr.get(i).getNom();
                           mostrarBus += "n"+"n";
                       }                        
                  }
                    JOptionPane.showMessageDialog(null, mostrarBus);
              }else{
                  JOptionPane.showMessageDialog(null, "Crea el array list, usa la opcion 1.");
              }
              
              break;
              
           case "6"://Bloque para mostar los datos del array list
        	   
        	   if(tal){
                   
                   String Salida= "";
                   for( int i = 0 ; i  < Arr.size(); i++){
                    Salida += "Numero posicion "+i+" : "+Arr.get(i).getId();
                    Salida += "nNombre posicion "+i+" : "+Arr.get(i).getNom();
                    Salida += "n"+"n";
                   }
                    JOptionPane.showMessageDialog(null, Salida);
               }else{
                   JOptionPane.showMessageDialog(null, "Crea el array list, usa la opcion 1.");
               }                   
               break; 
               
           case "7":
               System.exit(0);
               break;
               
           default:
               JOptionPane.showMessageDialog(null, "Opcion invalida !");
               break;
       }      
       }while(!op.equals("7"));
    }
    
    public boolean existEnArray(int bus){
        
        boolean saber=false;
        
        for(int i=0; i<= Arr.size(); i++){
            if(Arr.get(i).getId()==bus){
                saber=true;
                break;
            }
        }
        return saber;
    }
    
    public int indiceDato(int bus){
        int j=0;
        
        for (int i=0 ;i < Arr.size(); i++) {
            if(Arr.get(i).getId()== bus){
                j=i;
                break;
            }
        }
        return j;
    }    
}






