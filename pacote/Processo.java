package ListaDeExercicios6.pacote;

class Processo {
    private int id;
    private int tempoEspera;

    public Processo(int id, int tempoEspera) {
        this.id = id;
        this.tempoEspera = tempoEspera;
    }

    public int getId() {
        return id;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
