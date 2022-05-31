package iterator.importadorasAutomoviles;

import java.util.Vector;

public class AutomovilVectorIterator implements Iterator{

    private Vector<Automovil> autos;
    private int indice;

    public AutomovilVectorIterator(Vector<Automovil>autos) {

        this.autos = autos;
        indice = 0;
    }


    @Override
    public Object next() {
        return autos.get(indice++);
    }

    @Override
    public boolean hasNext() {
        return autos.size() != 0 && indice < autos.size();
    }
}
