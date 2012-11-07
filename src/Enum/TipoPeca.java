package Enum;

public enum TipoPeca {
		
	PLACA_MAE("Placa-mae"),
	PROCESSADOR("Processador"),
	MEMORIA("Memoria"),
    HD("HD"),
    GRAVADOR("Gravador"),
	PLACA_VIDEO("Placa de video"),
	;
    
    private String nome;

    private TipoPeca(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
	
}
