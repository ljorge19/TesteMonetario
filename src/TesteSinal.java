import java.math.BigDecimal;

public class TesteSinal {

	public static void main(String[] args) {
		BigDecimal numero = new BigDecimal(-1) ;
		
		String numeroStr = numero.toString();

		long numeroLgn = Long.parseLong(numeroStr);
		
		String testeRep = "";
		
		
		testeRep = testeRep.replace(".", "");
		
		
		System.out.println("Resultado string = " + numeroStr);
		System.out.println("Resultado long   = " + numeroLgn);
		System.out.println("Resultado long   = " + testeRep);

	}

}
