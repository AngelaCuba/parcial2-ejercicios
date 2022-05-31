

 import static jdk.nashorn.internal.objects.NativeSymbol.iterator;

 public class AutomovilL {
    private iterator.importadorasAutomoviles.Automovil[] autos;
    private int indice;

    public AutomovilArray() {

        autos = new Automovil[5];

    }

    public void add(Automovil automovil) {

        autos[indice] = automovil;
        indice++;

    }


    @Override
    public AutomovilArrayIterator createIterator() {

        return new AutomovilArrayIterator(autos);


    }
}
}
