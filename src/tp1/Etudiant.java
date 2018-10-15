/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Lydia
 */
public class Etudiant {

    /**
     * @return the id
     */
   
    
    private String id;
    private float note[];
    private int taille;
    String nom;
    String prenom;
    
    // Permet de lire des attributs privé dans le main
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public float[] getNote() {
        return note;
    }

    public void setNote(float[] note) {
        this.note = note;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
    
    //Constructeur par defaut
    public Etudiant()
     {
         id="";
         note= new float[0];
         taille=0;
         nom="";
         prenom="";       
     }
    
    //Constructeur Surcharge
    
    public Etudiant(float[] Untab,int tailleTab){
        //this.note;
        tailleTab=taille;
        note=Untab;
        for (int i=0 ;i<tailleTab;i++){
            System.out.print(note[i]);
        }}
    
    //Méthode modifier
    
    void modifier (String id2,float[] Untab2, int taille2, String nom2, String prenom2){
        this.setId(id2);
        this.setNote(Untab2);
        this.setTaille(taille2);
        this.prenom=prenom2;
        this.nom=nom2;
        
    }
    
    //Méthode remplir un tableau
    void RemplirTableau(int nbNote){
        int[] tabAl;
        tabAl = new int[nbNote];
        for (int i=0 ; i<nbNote; i++){
            Random rand = new Random();
            tabAl[i] = rand.nextInt(20);                
    }
      System.out.println("Avant le tri : "+Arrays.toString(tabAl));
      Arrays.sort(tabAl);
      System.out.println("Après le tri : "+Arrays.toString(tabAl));

    }  
    @Override
    public String toString() {
   return "Identifiant :"+this.id+" Nom : "+this.nom+" Prenom : "+this.prenom;
    } 
   
    
        
            
        
        
    }
    

