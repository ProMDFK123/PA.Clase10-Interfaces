package ejemplos.contratos;

import ejemplos.contenedores.ListaCalculadora;

public class Sistema3Impl implements Sistema2 {
    private ListaCalculadora listaCalculadora;

    public Sistema3Impl() {
        this.listaCalculadora = new ListaCalculadora(10);
        menu();
    }

    @Override
    public void menu() {
        Calculadora c = new CalculadoraImpl();
        Calculadora c2 = new CalculadoraImpl();

        int s = c.suma(35,45);
        double d = c.division(23,432);
        int m = c.multiplicacion(23,43);
        int r = c.resta(32,-23);

        System.out.println(s+", "+r+", "+m+", "+d);

        listaCalculadora.agregarCalculadora(c);
        listaCalculadora.agregarCalculadora(c2);
    }
}
