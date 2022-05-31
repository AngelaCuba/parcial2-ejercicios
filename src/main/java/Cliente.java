package iterator.importadorasAutomoviles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cliente {

    public static void main(String[] args) {

        iterator.importadorasAutomoviles.AutomovilL automovilArray = new iterator.importadorasAutomoviles.AutomovilL();

        automovilL.add(new Automovil(600, "Sentra", 4, "Nissan"));
        automovilArray.add(new Automovil(400, "CX-3", 4, "Mazda"));
        automovilArray.add(new Automovil(500, "Tucson", 4, "Hyundai"));
        automovilArray.add(new Automovil(800, "Model S", 4, "Tesla"));
        automovilArray.add(new Automovil(1000, "Roma", 4, "Ferrari"));

        AutomovilLista automovilLista = new AutomovilLista();

        automovilLista.add(new Automovil(200, "GTR", 4, "Nissan"));
        automovilLista.add(new Automovil(300, "CX-5", 4, "Mazda"));
        automovilLista.add(new Automovil(500, "I10", 4, "Hyundai"));
        automovilLista.add(new Automovil(800, "Model 3", 4, "Tesla"));
        automovilLista.add(new Automovil(1000, "Ghezzi", 4, "Ferrari"));

        AutomovilVector automovilVector = new AutomovilVector();

        automovilVector.add(new Automovil(800, "Skyline", 4, "Nissan"));
        automovilVector.add(new Automovil(300, "MX-5", 4, "Mazda"));
        automovilVector.add(new Automovil(500, "Elantra", 4, "Hyundai"));
        automovilVector.add(new Automovil(800, "Model X", 4, "Tesla"));
        automovilVector.add(new Automovil(1000, "PuroSangue", 4, "Ferrari"));

        AutomovilStack automovilStack = new AutomovilStack();

        automovilStack.add(new Automovil(800, "370z", 4, "Nissan"));
        automovilStack.add(new Automovil(300, "Demio", 4, "Mazda"));
        automovilStack.add(new Automovil(500, "Santa-Fe", 4, "Hyundai"));
        automovilStack.add(new Automovil(800, "Model Y", 4, "Tesla"));
        automovilStack.add(new Automovil(1000, "458", 4, "Ferrari"));

        Map<Automovil, Integer> autos = new LinkedHashMap<>();
        int indice = 1;

        Iterator iterator;

        iterator = automovilArray.createIterator();

        while(iterator.hasNext()) {


            autos.put((Automovil) iterator.next(), indice);
            indice++;

        }


        iterator = automovilLista.createIterator();

        while(iterator.hasNext()) {

            autos.put((Automovil) iterator.next(), indice);
            indice++;

        }

        iterator = automovilVector.createIterator();

        while(iterator.hasNext()) {

            autos.put((Automovil) iterator.next(), indice);
            indice++;

        }

        iterator = automovilStack.createIterator();

        while(iterator.hasNext()) {

            autos.put((Automovil) iterator.next(), indice);
            indice++;

        }

        for(Map.Entry<Automovil,Integer> entry: autos.entrySet()) {

            System.out.println(entry.getValue() +". " + entry.getKey().getTipo() + " - " + entry.getKey().getModelo());

        }




    }



}
