package Enum;

public enum TipoPeca {
		
	PLACA_MAE("Placa-mae"),
    MEMORIA("Memoria"),
    HD("HD"),
    GRAVADOR("Gravador"),
	PLACA_VIDEO("Placa de video"),
	PROCESSADOR("Processador");
    
    private String nome;

    private TipoPeca(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
	
}
