package com.mycompany.da_practica;

public class TablaDos {

    private String codigo;
    private String fecha;
    private String hora;
    private String estado;

    public TablaDos(String codigo, String fecha, String hora, String estado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public String getCodigo() { return codigo; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getEstado() { return estado; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setHora(String hora) { this.hora = hora; }
    public void setEstado(String estado) { this.estado = estado; }
    
}