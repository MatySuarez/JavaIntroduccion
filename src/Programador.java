public class Programador {
    void repetirMensaje(String mensaje, int cantidad){

        for (int i = 0; i <= cantidad ; i++) {
            System.out.println(mensaje);
        }

    }

    void sePuedeDividir(int num1, int num2){
        int numFinal;
        boolean sePuede = true, noSePuede = false;
        if (num2 != 0){
            numFinal = num1 / num2;
            System.out.println(sePuede + " " + numFinal);
        }else {
            System.out.println("No se puede" + noSePuede);
        }

    }
}
