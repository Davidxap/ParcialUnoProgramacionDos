public class Nino {
//creo los atributos de la clase niño(Nino) porque no me dejo usar nombre Niño por la "Ñ"
String nombre;
int edad;
int cantidadDeHermanos;

//creo el constructor de la clase niño(Nino) con los atributos que se utilizaran 
    public Nino(String nombre, int edad, int cantidadDeHermanos) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadDeHermanos = cantidadDeHermanos;
    }

//creo los métodos get para obtener los valores de los atributos que utilziare
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getCantidadDeHermanos() {
        return this.cantidadDeHermanos;
    }


}
