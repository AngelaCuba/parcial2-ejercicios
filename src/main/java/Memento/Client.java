package Memento;

public class Client {

    public static void main(String[] args) {

        AlmacenamientoBaseDeDatos almacenamientoBaseDeDatos = new AlmacenamientoBaseDeDatos();
        VersionadorBaseDeDatos versionadorBaseDeDatos = new VersionadorBaseDeDatos();

        BaseDeDatos baseDeDatos;

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Cuba", "13394732", 20),
                new Persona("Johan", "1414487", 23),
                new Persona("Lola", "12345678", 50)});

        versionadorBaseDeDatos.setBackup(baseDeDatos);
        almacenamientoBaseDeDatos.createBackup("Mayo", versionadorBaseDeDatos.createBackup());

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Cuba", "13394732", 20),
                new Persona("Johan", "1414487", 23),
                new Persona("Lola", "12345678", 50),
                new Persona("Javi", "13394786", 21),
                new Persona("Eduardo", "2345678", 17),
                new Persona("Karla", "9073625", 24),
                new Persona("Madai", "87452546", 44),
                new Persona("Alba", "28276752", 34)});

        versionadorBaseDeDatos.setBackup(baseDeDatos);
        almacenamientoBaseDeDatos.createBackup("Junio", versionadorBaseDeDatos.createBackup());

        baseDeDatos = new BaseDeDatos(new Persona[]{new Persona("Cuba", "13394732", 20),
                new Persona("Johan", "1414487", 23),
                new Persona("Lola", "12345678", 50) ,
                new Persona("Javi", "13394786", 21),
                new Persona("Eduardo", "2345678", 17),
                new Persona("Karla", "9073625", 24),
                new Persona("Madai", "87452546", 44),
                new Persona("Alba", "28276752", 34),
                new Persona("John", "45289832", 31),
                new Persona("Jaime", "5678237", 23),
                new Persona("teodora", "1282872", 20),
                new Persona("Saul", "45984278", 32)});



        baseDeDatos.showInfo();

        baseDeDatos = versionadorBaseDeDatos.restoreBackup(almacenamientoBaseDeDatos.getBackup("Junio"));

        baseDeDatos.showInfo();





    }

}

