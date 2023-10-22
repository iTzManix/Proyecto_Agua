public class Municipio {
    private MultiCZona multiZona;
    private PilaRepresa pilaRepresa;
    public Municipio(MultiCZona multiZona, PilaRepresa pilaRepresa) {
        this.multiZona = multiZona;
        this.pilaRepresa = pilaRepresa;
    }
    public MultiCZona getMultiZona() {
        return multiZona;
    }

    public void setMultiZona(MultiCZona multiZona) {
        this.multiZona = multiZona;
    }

    public PilaRepresa getPilaRepresa() {
        return pilaRepresa;
    }

    public void setPilaRepresa(PilaRepresa pilaRepresa) {
        this.pilaRepresa = pilaRepresa;
    }
}
