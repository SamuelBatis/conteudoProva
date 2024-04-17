package ListaDeExercicios6.revisao;

public class CelulaD {
    CelulaD proxima;
    Object elemento;
    CelulaD anterior;

    public CelulaD(CelulaD proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
        this.anterior = anterior;
    }

    public CelulaD(Object elemento) {
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
    }

    public CelulaD getProxima() {
        return proxima;
    }

    public void setProxima(CelulaD proxima) {
        this.proxima = proxima;
    }

    public CelulaD getAnterior() {
        return anterior;
    }

    public void setAnterior(CelulaD anterior) {
        this.anterior = anterior;
    }
}
