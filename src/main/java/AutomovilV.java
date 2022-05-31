package iterator.importadorasAutomoviles;

import java.util.Vector;

public class AutomovilVector implements  IColeccion{

    private Vector<Automovil> autos;

    public AutomovilVector() {

        autos = new Vector<>();

    }

    public void add(Automovil automovil) {

        autos.add(automovil);

    }


    @Override
    public AutomovilVectorIterator createIterator() {
        return new AutomovilVectorIterator(autos);
    }
}
