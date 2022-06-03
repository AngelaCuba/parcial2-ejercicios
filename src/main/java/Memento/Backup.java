package Memento;

public class Backup {

    private BaseDeDatos state;

    public Backup(BaseDeDatos baseDeDatos) {

        this.state = baseDeDatos;

    }

    public BaseDeDatos getState() {

        return this.state;

    }

}