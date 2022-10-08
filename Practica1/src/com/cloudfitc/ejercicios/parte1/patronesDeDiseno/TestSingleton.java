package com.cloudfitc.ejercicios.parte1.patronesDeDiseno;

public class TestSingleton {
    public static void main(String[] args) {

        /*
         * Singleton
         * */

        Config config = Config.obtenerConfiguracion();

        // si 2 hilos ejecutan el mismo metodo al mismo tiempo, existirian 2 objetos iguales...
        // Es poco probable, pero se puede evitar creando una variable static

        Config3 config3 = Config3.CONFIGURACION;
        System.out.println(config3.getResolucionX() + config3.getResolucionY());


    }
}

class Config {
    private int resolucionX;
    private int resolucionY;

    private static Config config;
    // private static Config config = new Config(1920,1080)
    // al colocarlo asi, se evitaria que 2 hilos al mismo momento ejecuten el metodo por lo que existirian 2 objetos

    private Config(int resolucionX, int resolucionY) {
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public static Config obtenerConfiguracion() {
        if (config == null) {
            config = new Config(1920, 1080);
        }
        return config;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public void setResolucionX(int resolucionX) {
        this.resolucionX = resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    public void setResolucionY(int resolucionY) {
        this.resolucionY = resolucionY;
    }
}

class Config2 {
    private int resolucionX;
    private int resolucionY;

    private static Config2 config2 = new Config2(1920, 1080);

    private Config2(int resolucionX, int resolucionY) {
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public static Config2 obtenerConfiguracion() {
        return config2;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public void setResolucionX(int resolucionX) {
        this.resolucionX = resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    public void setResolucionY(int resolucionY) {
        this.resolucionY = resolucionY;
    }
}

enum Config3 {
    CONFIGURACION(1920, 1080);

    private int resolucionX;
    private int resolucionY;

    private Config3(int resolucionX, int resolucionY) {
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }
}
