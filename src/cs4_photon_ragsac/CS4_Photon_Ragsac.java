/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_photon_ragsac;

/**
 *
 * @author PHOTON
 */
public class CS4_Photon_Ragsac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Troy"; //Name of the person
        int age1 = 16; //age of the person in years
        String sport1 = "Frisbee"; //the sport the person usually does
        
        String name2 = "James";
        int age2 = 20;
        String sport2 = "Swimming";
        
        String name3 = "Leur";
        int age3 = 25;
        String sport3 = "Basketball";
        
        int ageDifference = age3 - age1;
        
        System.out.println("Cousin 1 \nName: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Sport: " + sport1);
        
        System.out.println("\nCousin 2 \nName: " + name2);
        System.out.println("Age: " + age2);
        System.out.println("Sport: " + sport2);
        
        System.out.println("\nCousin 3 \nName: " + name3);
        System.out.println("Age: " + age3);
        System.out.println("Sport: " + sport3);
        
        if (age1 >= age2) {
            if (age1 >= age3) {
                System.out.println("\nThe oldest of the three: " + name1);
            }
            else {
                System.out.println("\nThe oldest of the three: " + name3);
            }
        }
        else {
            if (age2 >= age3) {
                System.out.println("\nThe oldest of the three: " + name2);
            }
            else {
                System.out.println("\nThe oldest of the three: " + name3);
            }
        }
        
        if (sport1 == sport2) {
            if (sport2 == sport3) {
                System.out.println("The three have the same sport: true");
            }
            else {
                System.out.println("The three have the same sport: false");
            }
        }
        else {
            System.out.println("The three have the same sport: false");
        }
        
        System.out.println("How much older is Leur than Troy: " + ageDifference);
    }
    
}
