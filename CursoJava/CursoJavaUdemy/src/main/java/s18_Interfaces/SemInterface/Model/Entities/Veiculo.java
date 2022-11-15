package s18_Interfaces.SemInterface.Model.Entities;

public class Veiculo {
    private String modelo;

    public Veiculo() {
    }

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModel(String modelo) {
        this.modelo = modelo;
    }
}
