public class Mision {
    protected String destino;
    protected int id;
    protected VehiculoEspacial VehiculoEspacial;


    public Mision(String destino, int id) {
        this.destino = destino;
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehiculoEspacial getVehiculoEspacial() {
        return VehiculoEspacial;
    }

    public void setVehiculoEspacial(VehiculoEspacial vehiculoEspacial) {
        VehiculoEspacial = vehiculoEspacial;
    }
}
