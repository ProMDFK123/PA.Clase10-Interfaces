package ejemplos;

import ejemplos.contratos.Sistema2;
import ejemplos.contratos.Sistema3Impl;
import ejemplos.implementarInterface.Sistema;
import ejemplos.implementarInterface.Sistema2Impl;
import ejemplos.implementarInterface.SistemaImpl;

public class Main {
    public static void main(String[] args) {
        //Implementación de Interface.
        Sistema s = new SistemaImpl();
        Sistema s2 = new Sistema2Impl();

        //Contratos.
        Sistema2 sistema = new Sistema3Impl();
    }
}