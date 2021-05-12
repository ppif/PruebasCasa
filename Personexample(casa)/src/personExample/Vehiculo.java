package personExample;

class Vehiculo {
    int pasajeros;  //números de pasajeros
    int capacidad;  //capacidad del combustible en litros
    int kpl;        //combustible consumido en kilometros por litro
}
//Esta clase declara un objeto de tipo Vehiculo

class DemoVehiculo {
    public static void main(String[] args) {
        Vehiculo mini = new Vehiculo();
        int rango;
        //asignando valores a los campos de mini
        mini.pasajeros = 9;
        mini.capacidad = 15;
        mini.kpl = 20;
        
        //Calcular el rango asumiendo un deposito lleno
        rango = mini.capacidad * mini.kpl;
        System.out.println("El Mini puede llevar " + mini.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
    }
}
    
    
    
    
    