package main;

import interfaces.AreaCalculavel;
import interfaces.Circulo;
import interfaces.Retangulo;

class Teste {
 public static void main(String[] args) {
	 AreaCalculavel a = new Retangulo(3,2);
	 AreaCalculavel b = new Circulo(3);
	 System.out.println(a.calculaArea());
	 System.out.println(b.calculaArea());
 }
}
