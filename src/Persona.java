public class Persona {
     void esMayorDeEdad(){
        int edad = 20;
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }

    void calcularEdad(){
         int añoDeNacimiento = 2005, edadFinal;

         edadFinal = (2021 - añoDeNacimiento);
        System.out.println(edadFinal);
    }
}
