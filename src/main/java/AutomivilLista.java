package iterator.importadorasAutomoviles;

import java.util.ArrayList;
import java.util.List;

public class AutomovilLista implements IC {

    private List<Automovil> autos;

    public AutomovilLista() {

        autos = new ArrayList<>();

    }

    public void add(Automovil automovil) {

        autos.add(automovil);

    }


    @Override
    public AutomovilLI createIterator() {
        return new AutomovilLI(autos);
    }
}
