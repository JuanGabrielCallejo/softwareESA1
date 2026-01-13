public class SistemaPropulsion {
    private String tipoCombustible;
    private int empujeMax;

    public SistemaPropulsion(String tipoCombustible, int empujeMax) {
        this.tipoCombustible = tipoCombustible;
        this.empujeMax = empujeMax;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getEmpujeMax() {
        return empujeMax;
    }

    public void setEmpujeMax(int empujeMax) {
        this.empujeMax = empujeMax;
    }

}
