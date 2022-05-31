package iterator.importadorasAutomoviles;

import java.util.Stack;

public class AutomovilStackIterator implements Iterator{

    private Stack<Automovil> autos;


    public AutomovilStackIterator(Stack<Automovil> autos) {

        this.autos = autos;


    }


    @Override
    public Object next() {
        return autos.pop();
    }

    @Override
    public boolean hasNext() {
        return !autos.isEmpty();
    }
}
