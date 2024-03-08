public class Ventilador {
    public boolean status;
    public int velocidade;

    public Ventilador(boolean status, int velocidade) {
        this.status = status;
        this.velocidade = velocidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
