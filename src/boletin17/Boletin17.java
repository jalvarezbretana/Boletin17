/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato obxG = new Gato();
        Papagaio obxP = new Papagaio();
        Tigre obxT = new Tigre();
        Avestruza obxA = new Avestruza();
        Morcego obxM = new Morcego();
        System.out.println("Gato: ");
        obxG.camiñar();
        obxG.nadar();
        System.out.println("Papagaio: ");
        obxP.camiñar();
        obxP.volar();
        System.out.println("Tigre: ");
        obxT.camiñar();
        obxT.nadar();
        System.out.println("Avestruza: ");
        obxA.camiñar();
        obxA.volar();
        System.out.println("Morcego: ");
        obxM.camiñar();
        obxM.volar();
    }

}
