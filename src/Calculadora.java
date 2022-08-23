public class Calculadora {
    void sumar(){
        int sumarFinal, par1 = 2, par2 = 2;
        sumarFinal = par1 + par2;
        System.out.println(sumarFinal);
    }
    void restar(){
        int restarFinal, par1 = 10, par2 = 2;
        restarFinal = par1 - par2;
        System.out.println(restarFinal);
    }
    void multiplicar(){
        int mulFinal, par1 = 10, par2 = 5;
        mulFinal = par1 * par2;
        System.out.println(mulFinal);
    }
    void calcularMayor (){
        int par1 = 10, par2 = 5;
        if (par1 > par2){
            System.out.println(par1);
        }else{
            System.out.println(par2);
        }
    }
    void calcularMenor (){
        int par1 = 10, par2 = 5;
        if (par1 < par2){
            System.out.println(par1);
        }else{
            System.out.println(par2);
        }
    }
}
