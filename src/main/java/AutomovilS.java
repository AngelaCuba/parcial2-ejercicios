package iterator.importadorasAutomoviles;

import java.util.Stack;

public class AutomovilS implements  IColeccion{

    private Stack<Automovil> autos;

    public AutomovilStack() {

        autos = new Stack<>();

    }

    public void add(Automovil automovil) {

        autos.push(automovil);

    }



    @Override
    public AutomovilStackIterator createIterator() {
        return new AutomovilStackIterator(autos);
    }
}
