public class NaveTripulada extends VehiculoEspacial {
    private int capacidadTripulacion;

    public NaveTripulada(String nombre, double autonomiaOper, int capacidadTripulacion, String tipoCombustible, int empujeMax) {
        super(nombre, autonomiaOper, tipoCombustible, empujeMax);
        this.capacidadTripulacion = capacidadTripulacion;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public void setCapacidadTripulacion(int capacidadTripulacion) {
        this.capacidadTripulacion = capacidadTripulacion;
    }


    public void gestionVital(){
        System.out.println("Sistemas vitales en funcionamiento");
    }

    @Override
    public void protocoloMision() {
        super.protocoloMision();
        gestionVital();
    }
}
