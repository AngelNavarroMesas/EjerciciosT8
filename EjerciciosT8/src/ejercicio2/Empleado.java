package ejercicio2;

public class Empleado {
	
	String nombre;

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Empleado:"+nombre;
	}
}


class Directivo extends Empleado{
	public String toString(){
		return nombre;	
	}
}

class Operario extends Empleado{
	public String toString(){
		return nombre;	
	}
}

class Oficial extends Operario{
	public String toString(){
		return nombre;	
	}
}

class Tecnico extends Operario{
	public String toString(){
		return nombre;	
	}
}