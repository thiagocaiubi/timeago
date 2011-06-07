import java.util.Calendar;

public class TimeAgo {

	private long diferenca;

	public TimeAgo(Calendar date) {
		Calendar agora = Calendar.getInstance();
		this.diferenca = (agora.getTimeInMillis() - date.getTimeInMillis()) / 1000;
	}

	public String toString() {
		int MINUTO = 60;
		int HORA = MINUTO * 60;
		int DIA = HORA * 24;
		int SEMANA = DIA * 7;
		if (diferenca < MINUTO) {
			return "agora";
		} else if(diferenca < HORA) {
			return periodo(MINUTO, "minuto");
		} else if(diferenca < DIA){
			return periodo(HORA, "hora");
		} else if(diferenca < SEMANA){
			return periodo(DIA, "dia");
		} else {
			return "";
		}
	}
	
	private String periodo(int limite, String label) {
		String sufix ="";
		long diff = diferenca/limite;
		if (diff > 1) {
			sufix ="s";
		}
		return diff + " "+ label + sufix+ " atr‡s";
	}
}