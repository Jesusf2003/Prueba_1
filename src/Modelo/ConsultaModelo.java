package Modelo;

public class ConsultaModelo {
    
    private int id_consulta;
    private int id_medico;
    private int id_paciente;
    private String fecha_consulta;
    private String descripcion;

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getFecha_consulta() {
        return fecha_consulta;
    }

    public void setFecha_consulta(String fecha_consulta) {
        this.fecha_consulta = fecha_consulta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ConsultaModelo() {
    }

    public ConsultaModelo(int id_consulta, int id_medico, int id_paciente, String fecha_consulta, String descripcion) {
        this.id_consulta = id_consulta;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.fecha_consulta = fecha_consulta;
        this.descripcion = descripcion;
    }
}
