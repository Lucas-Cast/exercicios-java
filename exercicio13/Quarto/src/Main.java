import java.sql.SQLOutput;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(true);
        Lampada lamp = new Lampada(true);
        Abajour abajour = new Abajour(true);
        Televisao tv = new Televisao(true, new String[]{"Globo", "Record", "SBT"},"HDMI");
        Ventilador ventilador1 = new Ventilador(true, 1);
        Ventilador ventilador2 = new Ventilador(true, 3);
        Ventilador ventilador3 = new Ventilador(false, 2);
        ArrayList<Ventilador> listaVentiladores = new ArrayList<Ventilador>();

        listaVentiladores.add(ventilador1);
        listaVentiladores.add(ventilador2);
        listaVentiladores.add(ventilador3);

        Quarto quarto = new Quarto(listaVentiladores, ar, lamp, tv, abajour);
        System.out.println("Status da lâmpada: "+ quarto.lamp.isStatus());
        quarto.abajour.setStatus(false);
        System.out.println("Status abajour: "+ quarto.abajour.isStatus());
        for (int i = 0; i < quarto.ventiladores.size(); i++){
            System.out.println("Status ventilador "+i+": " + quarto.ventiladores.get(i).isStatus() + " Velocidade ventilador "+i+": " + quarto.ventiladores.get(i).getVelocidade() );

        }
    }
}