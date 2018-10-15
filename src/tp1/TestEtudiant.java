/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lydia
 */
public class TestEtudiant {
     public static void main(String[] args){
         
         Etudiant e1 = new Etudiant();
         
        //Saisissez au clavier la valeur d’un entier en vérifiant que qu’il est positif (boucle de blindage)
         int nb;
         Scanner sc = new Scanner(System.in);
         System.out.println("Taille du tableau : ");
         nb = sc.nextInt();
         while(nb<0){
             System.out.println("Veuillez saisir un nombre positif : ");
             nb = sc.nextInt();
         }
         
        //Instanciez le tableau avec pour taille l’entier saisi et saisissez au clavier les valeurs de ce t
         
         float[] tab;
         tab = new float[nb];
         
         for(int i=0;i<nb;i++){
             System.out.println("Saisir une note : ");
             float note = sc.nextFloat();
             tab[i] = note;
         }
         e1.setNote(tab);
         System.out.println("Valeur du tableau : "+Arrays.toString(e1.getNote()));

         
        // Instanciez le second objet en appelant le second constructeur avec pour paramètre le tableau
        Etudiant e2 = new Etudiant(tab,tab.length);
        
        // Saisissez au clavier les données suivantes : un identifiant, un nom et un prénom :
        
        //Identifiant
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("Saisir un id : ");
        String identifiant = sc2.nextLine();
        e1.setId(identifiant);
        
        //Nom
        System.out.println("Votre nom : ");
        String unNom = sc2.nextLine();
        e1.nom=unNom;
        
        //Prénom
        System.out.println("Votre prénom : ");
        String unPrenom = sc2.nextLine();
        e1.prenom=unPrenom;
        System.out.println(e1.toString());
        // Modifiez les valeurs des attributs du premier objet à partir des données saisies (en paramètres) en appelant la méthode modifier
        e1.modifier("94", tab, tab.length, "illouli", "lydia");

        // Remplir un tableau avec des valeurs aléatoires peut aussi être réaliser avec la méthode Remplir tableau
        //e1.RemplirTableau(3);
        float[] tabAl;
        tabAl = new float[nb];
        for (int i=0 ; i<nb; i++){
            Random rand = new Random();
            tabAl[i] = rand.nextInt(20);
        }
        
        e1.setNote(tabAl);
        System.out.println("Valeur du tableau aléatoire avant le tri : "+Arrays.toString(e1.getNote()));   
        Arrays.sort(tabAl);
        e1.setNote(tabAl);
        System.out.println("Valeur du tableau aléatoire après le tri : "+Arrays.toString(e1.getNote()));        
        
        // Afficher les statiques suivantes à partir du tableau notes : minimum, maximum, moyenne, pourcentages des notes < 8, entre 8 et 12 et > 12.
        //Minimun, Maximum
        float max = Float.MAX_VALUE;
        float min = Float.MIN_VALUE;

        for(int i = 0; i < tabAl.length; i++){
         if(tabAl[i] < max)
           max = tabAl[i];
         if(tabAl[i] > min)
           min = tabAl[i];
       }
        
      System.out.println("Valeur minimale = "+max);
      System.out.println("Valeur maximale = "+min);
       

        //Moyenne 
      float somme = 0;
      for(int i = 0; i < tabAl.length; i++){
         somme += tabAl[i];
      }
      float moyenne = somme / tabAl.length;
 
      System.out.print("Moyenne = "+moyenne);
     }
    
}
