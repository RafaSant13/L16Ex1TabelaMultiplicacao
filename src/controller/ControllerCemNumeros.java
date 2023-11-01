package controller;

import model.Lista;

public class ControllerCemNumeros {
	Lista<Integer>[] tb = new Lista[100];
	private int hashCode(int numero) {
		double x = ((Math.sqrt(7) - 1)/2) * numero;
		int hash = (int) (100 * (x % 1));
		return hash;
	}
	public ControllerCemNumeros() {
		int tamanho = tb.length;
		for (int i = 0; i < tamanho; i++) {
			tb[i] = new Lista<Integer>();
		}
	}
	public void add(int valor) throws Exception {
			int hash = hashCode(valor);
			Lista<Integer> l = tb[hash];
			if (l.isEmpty()) {
				l.addFirst(valor);
			} else {
				l.addLast(valor);
			}
 
	}
	public void conta() throws Exception {
		int total = 0;
		for (int i = 0; i < tb.length; i++) {
			Lista<Integer> l = tb[i];
			int tamanho = l.size();
			System.out.print("Linha " + i + ": ");
			for (int j = 0;j<tamanho;j++) {
				System.out.print(l.get(j)+" -> ");
			}
			System.out.print("NULL\n");
			total = total + tamanho;
			
		}
		System.out.println("Total: " + total);
	}
}