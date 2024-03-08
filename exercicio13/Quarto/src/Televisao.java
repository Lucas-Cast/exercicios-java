public class Televisao {
    public boolean status;
    public String[] canais;
    public String source;
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getCanais() {
        return canais;
    }

    public void setCanais(String[] canais) {
        this.canais = canais;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Televisao(boolean status, String[] canais, String source) {
        this.canais = canais;
        this.source = source;
        this.status = status;
    }


}
