package Mediator;

public class Cliente {

    public static void main(String[] args) {

        Skype skype = new Skype();

        QA qa1 = new QA(skype);

        qa1.setCi("213123").setName("Marlos");
        qa1.setGrado("Ing. Sistemas");


        QA qa2 = new QA(skype);
        QA qa3 = new QA(skype);

        qa2.setCi("768665").setName("Argos");
        qa2.setGrado("Ing. Informatico");


        qa3.setCi("86570").setName("Pole");
        qa3.setGrado("Ing Computacion");

        DEV dev1 = new DEV(skype);
        DEV dev2 = new DEV(skype);
        DEV dev3 = new DEV(skype);


        dev1.setCi("56854").setName("Dalas");
        dev2.setCi("6575567").setName("Javi");
        dev3.setCi("598670").setName("Antonio");

        dev1.setLenguaje("Java");
        dev2.setLenguaje("Scala");
        dev3.setLenguaje("Kotlin");

        SM sm1 = new SM(skype);
        SM sm2 = new SM(skype);
        SM sm3 = new SM(skype);

        sm1.setCi("90834509").setName("Nauter");
        sm1.setCertificaciones(new String[]{"Certi Scrum", "Certi AWS", "Certi JavaScript"});
        sm2.setCi("242334509").setName("Lada");
        sm2.setCertificaciones(new String[]{"Certi PHP", "Certi Ing. Software"});
        sm3.setCi("95685656").setName("Lucia");
        sm3.setCertificaciones(new String[]{"Certi Agile", "Certi LESS"});

        skype.addPersonasChat(qa1).addPersonasChat(qa2).addPersonasChat(qa3).addPersonasChat(dev1).addPersonasChat(dev2)
                .addPersonasChat(dev3).addPersonasChat(sm1).addPersonasChat(sm2).addPersonasChat(sm3);



        qa1.send("Error en el Frontend...");
        dev2.send("Backend enviado a produccion...");
        sm3.send("Preparense para el Stand-Up...");






    }

}