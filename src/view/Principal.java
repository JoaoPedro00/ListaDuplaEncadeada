package view;

import controller.DNode;
import controller.JDLinkedList;
import controller.UnderflowException;

public class Principal {
	public static void main(String args[]) {
		JDLinkedList lista = new JDLinkedList();
		try {
		lista.insertFirst(new DNode("D"));
		lista.insertFirst(new DNode("A"));
		lista.insertFirst(new DNode("B"));
		lista.insertLast(new DNode("S"));
		lista.insertLast(new DNode("C"));
		lista.removeFirst(); //pode lançar UnderflowException
		lista.removeLast(); //pode lançar UnderflowException
		lista.insertAfter(new DNode("T"), 0);
		lista.removeAfter(0);
		lista.insertLast(new DNode("Tarde"));
		lista.insertAfter(new DNode("3"), 2);
		} catch (UnderflowException e) {
		System.out.println("ERRO: Impossível remover!");
		e.printStackTrace();
		}
		lista.show();
		}

}
