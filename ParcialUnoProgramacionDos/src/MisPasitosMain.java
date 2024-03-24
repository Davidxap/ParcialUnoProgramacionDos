import java.util.ArrayList;
public class MisPasitosMain {
public static void main(String[] args) {

//creo un arraylist de niños y añado los datos de cada niño
    ArrayList<Nino> niños = new ArrayList<>();
    niños.add(new Nino("Mariana",3,2));
    niños.add(new Nino("Pedrito",5,2));
    niños.add(new Nino("Sara",1,2));
    niños.add(new Nino("Miguel",2,0));
//creo dos niños adicionales para probar el caso en el que no cumple con los requisitos y otro en el que la edad sea 5 años
    niños.add(new Nino("Juan",6,2));
    niños.add(new Nino("Luis",5,3));


//recorro el arraylist de niños
for(Nino niño : niños) {
    double costoMatricula = JardinInfantil.CalcularValorMatricula(niño.getEdad(), niño.getCantidadDeHermanos());
 //si el costo de la matrícula es diferente de 0, se muestra el costo de la matrícula con el nombre delk niño y su edad  de lo contrario se muestra que no cumple con los requisitos y la edad del niño que sería el motivo por el cual no cumple con los requisitos
    if (costoMatricula != 0) {
    System.out.println("El costo de la matrícula para " + niño.getNombre() + " es de: " + costoMatricula);
    } else {
    System.out.println(niño.getNombre() + " no cumple con los requisitos para la matrícula, porque tiene " + niño.getEdad() + " años");
    }
}


}
}
