package Enum;

public enum TipoPeca {
		
	PLACA_MAE("Placa-m�e"),
    MEMORIA("Mem�ria"),
    HD("HD"),
    GRAVADOR("Gravador"),
	PLACA_VIDEO("Placa de v�deo"),
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
