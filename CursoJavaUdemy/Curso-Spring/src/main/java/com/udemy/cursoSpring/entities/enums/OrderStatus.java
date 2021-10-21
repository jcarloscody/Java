package com.udemy.cursoSpring.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	/*
	 * por padrao o java vai atribuir um valor numero para cada um destes,
	 * 0,1,2,3,4,
	 * porém para a segurança do banco de dados devido a manutencoa futuramente
	 * é importante deixar expresso a numeracaao.*/
	
private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
	
}
