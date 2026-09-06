import java.time.LocalDate;

public class vinho {
    private String tipo, marca;
    private int volume;
    private double valor;
    private LocalDate data;

    public vinho(String tipo, String marca, int volume, double valor, LocalDate data)
    {
        setTipo(tipo);
        setMarca(marca);
        setVolume(volume);
        setValor(valor);
        setData(data);
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getVolume() {
        return this.volume;
    }

    public double getValor() {
        return this.valor;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVolume(int volume) {
        if(volume >= 0)
            this.volume = volume;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setValor(double valor) {
        if(valor >= 0)
            this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %dml | R$ %.2f | Fabricado em: %s",
                marca, tipo, volume, valor, data);
        }
}
