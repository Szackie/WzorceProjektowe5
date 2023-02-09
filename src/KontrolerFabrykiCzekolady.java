public class KontrolerFabrykiCzekolady {
	public static void main(String args[]) {
		CzekoladowyKocioł boiler = CzekoladowyKocioł.pobierzInstancję();
		boiler.napełniaj();
		boiler.gotuj();
		boiler.opróżniaj();

		// Zwróci istniejącą instancję
		CzekoladowyKocioł boiler2 = CzekoladowyKocioł.pobierzInstancję();
	}
}
