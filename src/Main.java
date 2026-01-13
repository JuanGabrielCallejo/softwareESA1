void main() {

    VehiculoEspacial  apollo11= new NaveTripulada("apollo11", 500.000, 4, "Quimico", 1000);
    System.out.println(apollo11.getSistemaPropulsion().getTipoCombustible());
    apollo11.protocoloMision();
    ModuloCientifico moduleitor = new ModuloCientifico("recolector");
    apollo11.setModuloCientifico(moduleitor);
    System.out.println(apollo11.getModuloCientifico().getInstrumento());
}