package domain;

public abstract class Vehiculo {
    protected String patente;
    protected Marca marca;
    protected String modelo;
    protected int anio;
    protected double capacidadCarga;
    protected double kilometros;
    protected Sucursal sucursal;
    private VehiculoTipo tipo;

    public Vehiculo(VehiculoTipo tipo, String patente, Marca marca, String modelo, int anio, double capacidadCarga, Sucursal sucursal, double kilometros) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.capacidadCarga = capacidadCarga;
        this.kilometros = kilometros;
        this.sucursal = sucursal;
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }
    
    public VehiculoTipo getTipo(){
        return tipo;
    }
    
    public double getCapacidadCarga(){
        return capacidadCarga;
    }
    
    public double getKilometros(){
        return kilometros;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public String getCodigoSucursal(){
        return sucursal.getCodigo();
    }
    
    public double calcularConsumo(double kilometros) {
        return 0;
    }

    public boolean esDe(VehiculoTipo tipo){
        return this.tipo == tipo;
    }
    @Override
    public String toString() {
        return marca.getNombre() + " - " + modelo + marca.getPais();
    }
}
