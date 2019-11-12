
public class Main {

	public static void main(String[] args) {
		Test t= new Test();
		//t.remove();
		//t.putCards();
		t.addCard("2");
		t.addCard("3");
		t.addCard("4");
		t.addCard("5");
		t.addCard("6");
		t.addCard("7");
		t.addCard("8");
		t.addCard("9");
		t.addCard("10");
		t.addCard("J");
		t.addCard("Q");
		t.addCard("K");
		t.addCard("A");
		t.printCards();
		System.out.println(t.getPos());
		t.remove();
		t.remove();
		//System.out.println(t.getPos());
		//t.setPos(12);
		t.addCard("2");
		t.addCard("5");
		t.printCards();
		t.sort();
		t.printCards();
	}

}
