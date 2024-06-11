package com.mycompany.evaluarnotaconswitch;

public class EvaluarNotaConSwitch {
    public static void main(String[] args) {
        int nota = 75;

        switch (nota / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
