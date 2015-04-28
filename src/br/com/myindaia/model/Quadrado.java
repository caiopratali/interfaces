package br.com.myindaia.model;

class Quadrado implements AreaCalculavel {
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
		
	public double calculaArea() {
		return this.lado * this.lado;
	}
}