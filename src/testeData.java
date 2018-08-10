import java.text.SimpleDateFormat;
import java.util.Calendar;

public class testeData {
	
	public static void main(String[] args) {
		
		
		
		String dataFormatadaInicial = getDataInicial();
		String dataFormatadaFinal  = getDataFinal();
		
		
		
		
		
		System.out.println("data final:" + dataFormatadaInicial);
		System.out.println("data inicial:" + dataFormatadaFinal);
		
		
		
	}
	
	
public static String getDataInicial(){
		
	    Calendar dataInicial = Calendar.getInstance();
		Calendar dataFinal = Calendar.getInstance();
		
		SimpleDateFormat simpleDateFormatFinal = new SimpleDateFormat("yyyy/MM/dd");
		String dataFormatadaInicial = simpleDateFormatFinal.format(dataInicial.getTime());
		
		return dataFormatadaInicial;
		}
	
	
	
   public static String getDataFinal(){
	   
	   Calendar dataInicial = Calendar.getInstance();
		
	   dataInicial.add(Calendar.DAY_OF_MONTH, -7);  
		SimpleDateFormat simpleDateFormatInicial = new SimpleDateFormat("yyyy/MM/dd");
		String dataFormatadaFinal = simpleDateFormatInicial.format(dataInicial.getTime());
		
		return dataFormatadaFinal;
		}

}
