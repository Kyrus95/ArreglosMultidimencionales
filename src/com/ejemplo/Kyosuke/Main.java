package com.ejemplo.Kyosuke;

public class Main {

    public static void main(String[] args) {
	// Arreglos bidimencionales
        String[][] departamentos = new String[5][2];
        departamentos[0][0] = "Antioquia";
        departamentos[0][1] = "Medellin";
        departamentos[1][0] = "Cundinamarca";
        departamentos[1][1] = "Bogota";
        departamentos[2][0] = "Huila";
        departamentos[2][1] = "Neiva";
        departamentos[3][0] = "Risaralda";
        departamentos[3][1] = "Pereira";
        departamentos[4][0] = "Quindio";
        departamentos[4][1] = "Armenia";

        for (int i = 0; i < departamentos.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("La capital del departamento de ")
                    .append(departamentos[i][0])
                    .append(" es ")
                    .append(departamentos[i][1])
                    .append(".");
            System.out.println(sb);
        }
        /* Otra formas para recorrer el string sin el StringBuilder
        for (int i = 0; i < 5; i++) {
            System.out.println("La capital del departamento "+departamentos[i][0]+" es "+departamentos[i][1]);
        }*/

    }
}
