public abstract class VehiculoEspacial {
    protected String nombre;
    protected double autonomiaOper;
    protected SistemaPropulsion SistemaPropulsion;
    protected ModuloCientifico ModuloCientifico;
    protected Mision Mision;

    public VehiculoEspacial(String nombre, double autonomiaOper, String tipoCombustible, int empujeMax) {
        this.nombre = nombre;
        this.autonomiaOper = autonomiaOper;
        this.SistemaPropulsion = new SistemaPropulsion(tipoCombustible, empujeMax);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAutonomiaOper() {
        return autonomiaOper;
    }

    public void setAutonomiaOper(double autonomiaOper) {
        this.autonomiaOper = autonomiaOper;
    }

    public SistemaPropulsion getSistemaPropulsion() {
        return SistemaPropulsion;
    }

    public void setSistemaPropulsion(SistemaPropulsion sistemaPropulsion) {
        SistemaPropulsion = sistemaPropulsion;
    }

    public ModuloCientifico getModuloCientifico() {
        return ModuloCientifico;
    }

    public void setModuloCientifico(ModuloCientifico moduloCientifico) {
        ModuloCientifico = moduloCientifico;
    }

    public Mision getMision() {
        return Mision;
    }

    public void setMision(Mision mision) {
        Mision = mision;
    }

    public void protocoloMision(){
        System.out.println("Mensaje para la tierra");
    }
}
