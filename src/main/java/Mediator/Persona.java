package Mediator;

public abstract class Persona {

    protected ICanalComunicacion canalComunicacion;

    private String name;
    private String ci;

    public Persona(ICanalComunicacion canalComunicacion) {

        this.canalComunicacion = canalComunicacion;

    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public abstract void send(String msg);

    public abstract void received(String msg);

}