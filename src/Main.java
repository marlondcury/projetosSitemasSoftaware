//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dispositivo lampada = new Lampada();
        Dispositivo ventilador = new Ventilador();


        Botao botao = new Botao(lampada);
        botao.ligar();

        botao.setDisposito(ventilador);
        botao.ligar();
    }
}