package constructoresconset;

public class ConstructoresConSet{
	private int atributo1;
	private int atributo2;
	private String atributo3;

	public void setAtributo1(int attr1){
		atributo1 = attr1;
	}

	public void setAtributo2(int attr2){
		atributo2 = attr2;
	}

	public void setAtributo3(String attr3){
		atributo3 = attr3;
	}

	public static void main(String []args){
		ConstructoresConSet ac1 = new ConstructoresConSet();
		ConstructoresConSet ac2 = new ConstructoresConSet();
		ac1.setAtributo1(5);
		ac1.setAtributo2(10);
		ac1.setAtributo3("x");

		ac2.atributo1 = 5;
		ac2.atributo2 = 10;
		ac2.atributo3 = "x";

		System.out.println(ac1.atributo1 + ", " + ac1.atributo2 + ", " + ac1.atributo3);
		System.out.println(ac2.atributo1 + ", " + ac2.atributo2 + ", " + ac2.atributo3);
	}
}
