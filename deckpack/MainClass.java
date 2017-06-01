package deckpack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards c1=new Cards("five", "heart", "red");
		Cards c2=new Cards("ten", "club", "black");

		Cards c3=new Cards("three", "spade", "black");

		Cards c4=new Cards("king", "heart", "red");

		Cards c5=new Cards("five", "heart", "red");

		Cards c6=new Cards("jack", "club", "black");

		Cards c7=new Cards("queen", "spade", "black");
		
		Cards c8=new Cards("ace", "diamond", "black");

		Cards c9=new Cards("three", "spade", "black");
		Cards c10=new Cards("four", "diamond", "black");
		
		Deck dc = new Deck();
		dc.add(c1);
		dc.add(c2);
		dc.add(c3);
		dc.add(c4);
		dc.add(c5);
		dc.add(c6);
		dc.add(c7);
		dc.add(c8);
		dc.add(c9);
		dc.add(c10);
	
		dc.print();
		dc.shuffle();
		dc.print();
	}

}
