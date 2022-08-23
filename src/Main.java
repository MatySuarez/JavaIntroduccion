public class Main {
    public static void main(String[] args){
        Monitor monitor = new Monitor();
        Persona persona = new Persona();
        Calculadora calculadora = new Calculadora();
        Programador programador = new Programador();


        monitor.imprimir();
        monitor.imprimirNombre();
        monitor.imprimirNombreYApellido();

        persona.esMayorDeEdad();
        persona.calcularEdad();

        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.calcularMayor();
        calculadora.calcularMenor();

        programador.repetirMensaje("Hola", 3);
        programador.sePuedeDividir(20, 5);
    }
}
