package ejemplos.implementarInterface;

public class Sistema2Impl implements Sistema {
    public Sistema2Impl() {
        this.menu();
    }

    @Override
    public void menu() {
        System.out.println("Impl2: 'momento roonin numero 50'");
    }
}
