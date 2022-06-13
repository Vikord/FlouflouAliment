package util;

public class Utilitaire {

    public static double arrondirDeuxDecimales (double nombre) {
        return Math.round(nombre * 100.0) / 100.0;
    }
}
