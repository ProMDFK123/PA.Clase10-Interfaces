package ejemplos.contratos;

public interface Calculadora {
    /**
     * Suma de dos números.
     * @param x
     * @param y
     * @return
     */
    int suma(int x, int y);

    /**
     * Resta entre 2 números.
     * @param x
     * @param y
     * @return
     */
    int resta(int x, int y);

    /**
     * Producto entre 2 números.
     * @param x
     * @param y
     * @return
     */
    int multiplicacion(int x, int y);

    /**
     * División entre 2 números.
     * @param x
     * @param y
     * @return
     */
    double division(int x, int y);
}
