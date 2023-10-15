package actividad;

public class Actividad {
	public static void main(String[] args) {
		Test nuevoTest = new Test();
		System.out.println(nuevoTest.UnNuevoRadio(10));
	}
}

class Test {
	int radio = 2;
	Test() {
		radio = 5;
	}
	int UnNuevoRadio(int nuevoRadio) {
		radio = nuevoRadio;
		return radio;
	}
}
