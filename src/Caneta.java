public class Caneta {

    private String modelo;
    private String cor;
    private double ponta;
    private boolean tampada;

    public Caneta (String modelo, String cor, double ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não consigo escrever porque estás tampada");
        } else {
            System.out.println("Posso escrever");
        }

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
