public class SondaExploradora extends VehiculoEspacial {
    private double frecuenciaTrans;

    public SondaExploradora(String nombre, double autonomiaOper, double frecuenciaTrans,  String tipoCombustible, int empujeMax) {
        super(nombre, autonomiaOper, tipoCombustible, empujeMax);
        this.frecuenciaTrans = frecuenciaTrans;
    }

    public double getFrecuenciaTrans() {
        return frecuenciaTrans;
    }

    public void setFrecuenciaTrans(double frecuenciaTrans) {
        this.frecuenciaTrans = frecuenciaTrans;
    }

    public void escaneo(){
        System.out.println("Se ha realizado el escaneo del area");
    }

    @Override
    public void protocoloMision() {
        super.protocoloMision();
        escaneo();
    }
}
