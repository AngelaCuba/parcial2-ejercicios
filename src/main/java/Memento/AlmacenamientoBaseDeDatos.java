package Memento;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AlmacenamientoBaseDeDatos {

    private Map<String, Backup> backups = new LinkedHashMap<>();

    public void createBackup(String backupAlias, Backup backup) {

        backups.put(backupAlias, backup);
    }

    public Backup getBackup(String backupAlias) {

        return backups.get(backupAlias);

    }

}