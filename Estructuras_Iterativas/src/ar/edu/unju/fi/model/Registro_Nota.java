package ar.edu.unju.fi.model;

public class Registro_Nota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float notaFinal;
	
	public Registro_Nota() {}

	public Registro_Nota(String codigo, Alumno alumno, Materia materia, Float notaFinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notaFinal = notaFinal;
	}
	
	@Override
	public String toString() {
		return "Registro_Nota [codigo=" + codigo + ", alumno=" + alumno + ", materia=" + materia + ", notaFinal="
				+ notaFinal + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
}
