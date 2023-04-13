package ejercicio1;

public class Hora {
	
	int hora, min;
	
	public Hora(int hora, int min){
		this.hora=hora;
		if(hora<=23&&hora>=0) {
			this.hora=hora;
		}
		
		if(min<=59&&min>=0) {
			this.min=min;
		}
	}
	
	public void inc() {
		min++;
	}
	
	public boolean setMin(int valor) {
		boolean cambio=false;
		if(valor<60&&valor>=0) {
			min=valor;
			cambio= true;
		}
		
		return cambio;
	}
	
	public boolean setHora(int valor) {
		boolean cambio=false;
		if(valor<23&&valor>=0) {
			hora=valor;
			cambio= true;
		}
		
		return cambio;
	}
	
	public String toString() {
		String rep = null;
		if(hora<=9) {
			rep+="0";
		}
		rep += hora+":";
		if(min<=9) {
			rep+="0";
		}
		rep+=min;
		return rep;
	}
	
	
}

class HoraExacta extends Hora{
	
	int seg;
	
	public HoraExacta(int hora, int min, int seg) {
		super(hora, min);
		this.seg=seg;
	}
	
	public void setSeg(int valor) {
		if(valor<60&&valor>=0) {
			seg=valor;
		}
		
	}
	
	public void inc() {
		seg++;
		
		if(seg==60) {
			seg=0;
			min++;
		}
		if(min==60) {
			min=0;
			hora++;
		}
	}
	
}
