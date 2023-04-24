package ejemplos.contratos;

public class CalculadoraImpl implements Calculadora {
    public CalculadoraImpl() {
    }

    @Override
    public int suma(int x, int y) {
        return x+y;
    }

    @Override
    public int resta(int x, int y) {
        return x-y;
    }

    @Override
    public int multiplicacion(int x, int y) {
        return x*y;
    }

    @Override
    public double division(int x, int y) {
        if(y==0){
            System.out.println("La división no se puede realizar.");
            return -1;
        }
        return (double) x /y;
    }
}
