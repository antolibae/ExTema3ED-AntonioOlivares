package fecha;

public class Fecha {
<<<<<<< HEAD
	private int d; //dia
	private int m; //mes
	private int a; //anyo
=======
	private int d; //d�a
	private int m; //mes
	private int a; //a�o
>>>>>>> PMD-Refactor

	
	public Fecha() {

	}

	
	public Fecha(int dia, int mes, int anio) {
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	
	
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

<<<<<<< HEAD
	// Metodo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
=======
	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
>>>>>>> PMD-Refactor
	private boolean esBisiesto() {
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	// Metodo diaSiguiente
<<<<<<< HEAD
=======
	// metodo comentado
>>>>>>> PMD-Refactor
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

<<<<<<< HEAD
	// Metodo toString
=======
	// M�todo toString
>>>>>>> PMD-Refactor
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
