public class DataShow extends Equipamento {
    private boolean compativelHDMI; //atributo desta classe os outros serão herdados

    public DataShow(int codigo, String reservado, boolean compativelHDMI) {
        super(codigo, reservado);
        this.compativelHDMI = compativelHDMI;
    }

    public boolean getCompativelHDMI() {
        return compativelHDMI;
    }

    public void setCompativelHDMI(boolean compativelHDMI) {
        this.compativelHDMI = compativelHDMI;
    }

    @Override
    public String toString() {
        return super.toString() + "Compatível com HDMI: " + this.compativelHDMI;
    }
}
