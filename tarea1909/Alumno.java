
package programacion;

public class Alumno {
   private String Name;
   private String lastName;
   private String rut;
   private int Nmatricula;
   
   public void setNombre(String Nombre){
       Name = Nombre;
    }
   public void setApellido(String Apellido){
       lastName = Apellido;
    }
   public void setRut(String Rut){
       rut = Rut;
    }
   public void setMatricula(int Matricula){
       Nmatricula = Matricula;
    }
   public String getNombre(){
       return Name;
    }
   public String getApellido(){
       return lastName;
    }
   public String getRut(){
       return rut;
    }
   public int getMatricula(){
       return Nmatricula;
    }
   public boolean validarRut() {
	boolean validacion = false;
	String rutA = rut;
	if (!rutA.matches("([1-9]{1,3}[.][1-9]{3}[.][1-9]{3}[-][0-9]?k?K?)")){
		return false;
	}
	try {
		rutA = rutA.toUpperCase();
		rutA = rutA.replace(".", "");
		rutA = rutA.replace("-", "");
		int rutAux = Integer.parseInt(rutA.substring(0, rutA.length() - 1));

                char dv = rutA.charAt(rutA.length() - 1);

		int m = 0, s = 1;
		for (; rutAux != 0; rutAux /= 10) {
			s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
		}
		if (dv == (char) (s != 0 ? s + 47 : 75)) {
			validacion = true;
		}

	} catch (java.lang.NumberFormatException e) {
	} catch (Exception e) {
	}
	return validacion;
    }
   public String toString(){
		return  "Nombre: " + Name + 
			"\nApellido: " + lastName + 
			"\nRut: " + rut + 
			"\nNº de Matricula: " + Nmatricula;
	}
}
