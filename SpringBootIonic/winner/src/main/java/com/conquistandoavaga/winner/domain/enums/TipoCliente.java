package com.conquistandoavaga.winner.domain.enums;



public enum TipoCliente {
	
	PessoaFisica(1,"Pessoa Física"),
	PessoaJuridica(2, "Pessoa Jurídica");
	
	private int cod;
	private String desc;
	
	private TipoCliente(int cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public int getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}
	
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("erro no enum - ID INVALIDO" +  cod);
	}
	 
	 
}
