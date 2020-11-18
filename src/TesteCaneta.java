public class TesteCaneta {

    public static void main(String[] args) {

        Caneta caneta = new Caneta("Bic", "Preta", 0.5);
        caneta.destampar();
        caneta.rabiscar();

        caneta.status();

    }
}
