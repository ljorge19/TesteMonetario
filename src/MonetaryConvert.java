import java.math.BigDecimal;
import java.text.NumberFormat;

public class MonetaryConvert {

	public static void main(String[] args) {

	
	
	
	
	// Valor que deveria representar 45000
		 long valor = 45022;
		 NumberFormat formatoReal = NumberFormat.getCurrencyInstance();
		 // Permite no minimo 2 casas decimais de precis�o
		 //formatoReal.setMinimumFractionDigits(2);
		String convertidoString = formatoReal.format((float) valor/100); 
		
		//retirando o cifr�o
		String convertidoSemCifrao = convertidoString.toString().replace("R$","");
		convertidoString.trim();
		convertidoSemCifrao.trim();
		
		
	 	System.out.println("Valor em Real = " + convertidoString);
	 	System.out.println("Valor em Real sem cifr�o= " + convertidoSemCifrao);
	 	/*
	 	
	 	String retirandoVirgula[] = convertidoSemCifrao.split(",");
	 	String convertidoSemVirgula = retirandoVirgula[0];
	 	
	 	System.out.println("convertido split" + convertidoSemVirgula);
	 	*/
	 	//convertidoSemCifrao.replaceAll( "," , "." );
	 	double valorConvertido = Double.parseDouble(convertidoString);
	 	float valorConvertidoFloat = Float.parseFloat(convertidoString);
	 	
	 	System.out.println("Valor em Real double = " + valorConvertido);
	 	System.out.println("Valor em Real float = " + valorConvertidoFloat);
	 	
	 	/*
	 	BigDecimal valorConvertidoBig = new BigDecimal (convertidoSemVirgula.trim());
	 	System.out.println("Valor em Real bigDecimal = " + valorConvertidoBig);
	 	*/
	 	
	 	
	
}
	
}
