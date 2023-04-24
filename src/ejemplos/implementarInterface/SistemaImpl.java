package ejemplos.implementarInterface;

public class SistemaImpl implements Sistema {

    public SistemaImpl() {
        this.menu();
    }

    @Override
    public void menu() {
        System.out.println("Impl1: 'awa ewe iwi owo uwu'");
    }
}
