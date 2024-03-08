import java.util.ArrayList;

public class Quarto {
    public ArrayList<Ventilador> ventiladores ;
    public ArCondicionado ar;
    public Lampada lamp;

    public Televisao tv;

    public Abajour abajour;

    public Quarto(ArrayList<Ventilador> ventiladores, ArCondicionado ar, Lampada lamp, Televisao tv, Abajour abajour) {
        this.ventiladores = ventiladores;
        this.ar = ar;
        this.lamp = lamp;
        this.tv = tv;
        this.abajour = abajour;
    }

    public ArrayList<Ventilador> getVentilador() {
        return ventiladores;
    }

    public void setVentilador(ArrayList<Ventilador> ventilador) {
        this.ventiladores = ventilador;
    }

    public ArCondicionado getAr() {
        return ar;
    }

    public void setAr(ArCondicionado ar) {
        this.ar = ar;
    }

    public Lampada getLamp() {
        return lamp;
    }

    public void setLamp(Lampada lamp) {
        this.lamp = lamp;
    }

    public Televisao getTv() {
        return tv;
    }

    public void setTv(Televisao tv) {
        this.tv = tv;
    }

    public Abajour getAbajour() {
        return abajour;
    }

    public void setAbajour(Abajour abajour) {
        this.abajour = abajour;
    }
}
