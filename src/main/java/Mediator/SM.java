package Mediator;

public class SM extends Persona{

    private String[] certificaciones;

    public SM(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String[] getCertificaciones() {
        return certificaciones;
    }

    public SM setCertificaciones(String[] certificaciones) {
        this.certificaciones = certificaciones;
        return this;
    }

    @Override
    public void send(String msg) {

        canalComunicacion.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.print("SM> " + getName() + "-" + getCi() + "-" + "Certificaciones: ");

        for(int i = 0; i< certificaciones.length; i++) {

            if(i == certificaciones.length-1) {

                System.out.println(certificaciones[i]);

            } else {

                System.out.print(certificaciones[i] + ", ");

            }

        }



    }
}