package Enum;

public enum Marca {
		
	ASUS("Asus"),
    INTEL("Intel"),
    SEAGATE("Seagate"),
    WD("Western Digital"),
	ATI("ATI"),
	NVIDIA("Nvidia"),
	AMD("AMD"),
	SAMSUNG("Samsung"),
	KINGSTON("Kingston"),
	CORSAIR("Corsair");
	
    private String nome;

    private Marca(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
	
}
