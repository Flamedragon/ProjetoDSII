package Enum;

public enum TipoPeca {
		
	PLACA_MAE("Placa-mãe"),
    MEMORIA("Memória"),
    HD("HD"),
    GRAVADOR("Gravador"),
	PLACA_VIDEO("Placa de vídeo");
    
    private String nome;

    private TipoPeca(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
	
}
