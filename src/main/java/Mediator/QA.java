package Mediator;

public class QA extends Persona{

    private String grado;

    public QA(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getGrado() {
        return grado;
    }

    public QA setGrado(String grado) {
        this.grado = grado;
        return this;
    }

    @Override
    public void send(String msg) {

        canalComunicacion.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("QA> " + getName() + "-" + getCi() + "-" + getGrado() +  ". Mensaje recibido");

    }
}