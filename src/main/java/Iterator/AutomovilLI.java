package Iterator;

import java.util.List;

public class AutomovilLI implements Iterator {

    private List<Automovil> autos;
    private int indice;

    public AutomovilLI(List<Automovil> autos) {

        this.autos = autos;
        indice = 0;

    }


    @Override
    public Object next() {
        return autos.get(indice++);
    }

    @Override
    public boolean hasNext() {
        return autos.size() !=0 && indice < autos.size();
    }
}