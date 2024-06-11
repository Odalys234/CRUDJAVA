package Entidades;

public class Fotografia {
    private int id;
    private String titulo;
    private String descripcion;
    private String ubicacion;

    public Fotografia(int id, String titulo, String descripcion, String ubicacion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public Fotografia() {
    }

    public Fotografia(String titulo, String descripcion, String ubicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
