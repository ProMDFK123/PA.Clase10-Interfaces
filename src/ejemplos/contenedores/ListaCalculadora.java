package ejemplos.contenedores;

import edu.princeton.cs.stdlib.StdOut;
import ejemplos.contratos.Calculadora;

public class ListaCalculadora {
    private int cantCalculadoras;
    private int cantMax;
    private Calculadora[] listaCalculadoras;

    public ListaCalculadora(int cantMax) {
        this.cantMax = cantMax;
        this.listaCalculadoras = new Calculadora[cantMax];
        this.cantCalculadoras = 0;
    }

    public int getCantCalculadoras() {
        return cantCalculadoras;
    }

    public void setCantCalculadoras(int cantCalculadoras) {
        this.cantCalculadoras = cantCalculadoras;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public void agregarCalculadora(Calculadora calculadora){
        if(this.cantCalculadoras>=this.cantMax){
            StdOut.println("El elemento no se puede agregar.");
            return;
        }
        this.listaCalculadoras[this.cantCalculadoras]=calculadora;
        this.cantCalculadoras++;
    }
}
