public class Pelicula {
    private String pelicula;
    private int cantidad;
    private boolean estado;
    public Pelicula(String pelicula, int cantidad) {
        this.pelicula = pelicula;
        this.cantidad = cantidad;
        this.estado=false;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nombre de la " + pelicula + '\t' + " cantidad de entradas: " + cantidad + "\n" ;
    }


}
