

public class AutomovilIterator implements iterator.importadorasAutomoviles.Iterator {

    private iterator.importadorasAutomoviles.Automovil[] autos;
    private int indice;

    public AutomovilAI(iterator.importadorasAutomoviles.Automovil[] autos) {

        this.autos = autos;
        indice = 0;

    }


    @Override
    public Object next() {

        return autos[indice++];

    }

    @Override
    public boolean hasNext() {
        return autos.length !=0 && indice < autos.length;
    }
}