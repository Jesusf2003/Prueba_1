package Modelo;

public class MedicoModelo {
    
    private int id;
    private String nombre_med;
    private String apellido_med;
    private String direccion_med;
    private String fecha_nac_med;
    private String dni_med;
    private String celular_med;
    private String especialidad;
    private String sexo_med;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getApellido_med() {
        return apellido_med;
    }

    public void setApellido_med(String apellido_med) {
        this.apellido_med = apellido_med;
    }

    public String getDireccion_med() {
        return direccion_med;
    }

    public void setDireccion_med(String direccion_med) {
        this.direccion_med = direccion_med;
    }

    public String getFecha_nac_med() {
        return fecha_nac_med;
    }

    public void setFecha_nac_med(String fecha_nac_med) {
        this.fecha_nac_med = fecha_nac_med;
    }

    public String getDni_med() {
        return dni_med;
    }

    public void setDni_med(String dni_med) {
        this.dni_med = dni_med;
    }

    public String getCelular_med() {
        return celular_med;
    }

    public void setCelular_med(String celular_med) {
        this.celular_med = celular_med;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSexo_med() {
        return sexo_med;
    }

    public void setSexo_med(String sexo_med) {
        this.sexo_med = sexo_med;
    }

    public MedicoModelo() {
        
    }

    public MedicoModelo(int id, String nombre_med, String apellido_med, String direccion_med, String fecha_nac_med, String dni_med, String celular_med, String especialidad, String sexo_med) {
        this.id = id;
        this.nombre_med = nombre_med;
        this.apellido_med = apellido_med;
        this.direccion_med = direccion_med;
        this.fecha_nac_med = fecha_nac_med;
        this.dni_med = dni_med;
        this.celular_med = celular_med;
        this.especialidad = especialidad;
        this.sexo_med = sexo_med;
    }
    
    
}
