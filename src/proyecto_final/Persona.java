package proyecto_final;

public abstract class Persona {

    protected String nombre;
    protected char sexo;
    protected int estadoCivil;
    protected String telefono;
    protected Fecha fecha;

    public Persona() {
    }

    public Persona(String nombre, char sexo, int estadoCivil, String telefono, Fecha fecha) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
        this.fecha = fecha;
        this.fecha.validacion();
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static String estadoCivil(Persona p) {
        switch (p.getEstadoCivil()) {
            case 1:
                return "Soltero";
            case 2:
                return "Casado";
            case 3:
                return "Viudo";
            case 4:
                return "Divorciado";
            case 5:
                return "Union libre";
            default:
                return "No especificado";

        }
    }
    public static int estadoCivilInt(String s){
        if (s.contains("Soltero")) {
            return 1;
        } else {
            if (s.contains("Casado")) {
                return 2;
            } else {
                if (s.contains("Viudo")) {
                    return 3;
                } else {
                    if (s.contains("Divorciado")) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        }
    }

    public int edad() {
        return 2021 - fecha.año;
    }

    public int situacionR() {
        if (edad() > 60) {
            return 1;
        } else {
            if (edad() > 50 && edad() < 60) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    public abstract String accion();

}
