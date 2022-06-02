package Mediator;

import java.util.LinkedHashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion{

    Map<Persona, Integer> personasChat = new LinkedHashMap<>();
    int counter = 0;

    public Skype addPersonasChat(Persona persona) {

        personasChat.put(persona, counter);
        counter++;
        return this;

    }


    @Override
    public void send(String msg, Persona persona) {

        for(Persona colega: personasChat.keySet()) {

            if(!persona.getCi().equals(colega.getCi())) {

                if(persona.getClass().getName().contains("QA") && colega.getClass().getName().contains("QA")) {

                    colega.received(msg);

                } else if(persona.getClass().getName().contains("DEV") && colega.getClass().getName().contains("DEV")) {

                    colega.received(msg);

                } else if(persona.getClass().getName().contains("SM")) {

                    colega.received(msg);

                }

            }

        }

        System.out.println("/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

    }
}