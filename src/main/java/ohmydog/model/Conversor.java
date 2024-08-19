package ohmydog.model;

public class Conversor {

    public static String converterParaSQL(String dataJava) {
        // recebe do java em formato dd/mm/aaaa
        String[] partesData = dataJava.split("/");

        // transforma para formato do Mysql aaaa-mm-dd (inverte)
        String dataNova = partesData[2] + "-" + partesData[1] + "-" + partesData[0];
        return dataNova;
    }

    public static String converterParaJava(String dataSQL) {
        // recebe do mysql em formato aaaa-mm-dd
        String[] partesData = dataSQL.split("-");

        //transforma para dd/mm/aaaa
        String dataNova = partesData[2] + "/" + partesData[1] + "/" + partesData[0];
        return dataNova;
    }

}
