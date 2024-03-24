public class JardinInfantil 
{
//inicializo los valores de los nivelfes,utilizando final ya que son constantes y static para que puedan ser accedidos sin necesidad de instanciar la clase en la clase main y usados en el método CalcularValorMatricula
static final double PRECIO_NIVEL_1=4300000;
static final double PRECIO_NIVEL_2=3900000;
static final double PRECIO_NIVEL_3=3500000;

//creo un método que calculara el costo de la matricula de cada niño,el metodo es estatico para que pueda ser accedido sin necesidad de instanciar la clase en la clase main
public static  double CalcularValorMatricula(int edad,int cantidadDeHermanos){
double costo=0;
double descuento=0; 
// se asigna el valor del costo sin descuento teniendo en cuenta el rango de edad en el que se encuentra el niño
if(edad>=1&&edad<=2){
costo=PRECIO_NIVEL_1;
}
else if(edad>=3&&edad<=4){
costo=PRECIO_NIVEL_2;
}
else if(edad==5){
costo=PRECIO_NIVEL_3;
}

//si el niño tiene 1 hermano, se le asigna un descuento del 15%
if(cantidadDeHermanos>=1){
     descuento=0.15;
{
//si el niño tiene más de 1 hermano, se le asigna un descuento del 15% y un 5% adicional por cada hermano adicional con un máximo de 4 hermanos
    if (cantidadDeHermanos>=2&&cantidadDeHermanos<=4) {
        descuento+=0.05*(cantidadDeHermanos-1);
    }
}
}
//se calcula el costo final de la matrícula y se retorna
 return costo-=costo*descuento;
}
}
