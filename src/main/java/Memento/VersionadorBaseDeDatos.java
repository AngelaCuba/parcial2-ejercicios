package Memento;

public class VersionadorBaseDeDatos {

    private BaseDeDatos state;

    public void setBackup(BaseDeDatos state) {

        this.state = state;

    }

    public Backup createBackup() {

        return new Backup(state);

    }

    public BaseDeDatos restoreBackup(Backup backup) {

        System.out.println("****Restaurando****");
        this.state = backup.getState();
        return this.state;


    }

}