public class Botao {

    private Dispositivo disposito;

    public Botao(Dispositivo disposito){
        this.disposito = disposito;
        atribuirDispositivo();
        setDisposito(disposito);
    }


    private void atribuirDispositivo(){
        if( disposito == null){
            throw new RuntimeException("Precisa passar uma classe do tipo Dispositivo instanciada.");
        }
    }

    public void setDisposito(Dispositivo disposito){
        this.disposito = disposito;
    }

    public void ligar(){
        disposito.ligar();
    }
}
