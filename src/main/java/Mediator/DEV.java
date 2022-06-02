package Mediator;

public class DEV extends Persona{

    private String lenguaje;

    public DEV(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public DEV setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }

    @Override
    public void send(String msg) {

        canalComunicacion.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("DEV> " + getName() + "-" + getCi() + "-" + getLenguaje() +  ". Mensaje recibido");


    }
}