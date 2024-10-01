package com.example;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        Corredor corredor = new Corredor("Juan");
        Nadador nadador = new Nadador("Ana");
        Saltador saltador = new Saltador("Pedro");

        torneo.organizarCompetencia(corredor);
        torneo.organizarCompetencia(nadador);
        torneo.organizarCompetencia(saltador);     
    }
}