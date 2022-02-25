package bousso;

import java.util.Vector;

public class Test {
public static void main(String[] args) {
    IElement Fichier1 = new Fichier("Bonjour.txt",20);
    IElement Fichier2 = new Fichier("Bonjour1.txt",200);
    IElement Fichier3 = new Fichier("Bonjour2.txt",30);

    Vector<IElement> els = new Vector<IElement> ();
    

    Dossier Dossier1 = new Dossier(els,"Racine");

    Dossier1.add(Fichier1);
    Dossier1.add(Fichier2);
    Dossier1.add(Fichier3);

    IVisiteur vis = new TailleVisiteur();
    Dossier1.acceptVisiteur(vis);
    System.out.println("Taille du dossier "+Dossier1.getNom()+": "+vis.getTaille());
    IElement Fichier4 = new Fichier("Bonjour6.txt",300);
    IElement Fichier5 = new Fichier("Bonjour5.txt",30);
    Vector<IElement> els2 = new Vector<IElement> ();
    
    Dossier Dossier4 = new Dossier(els2,"Temp");
    Dossier4.add(Fichier4);
    Dossier4.add(Fichier5);
    Dossier1.add(Dossier4);
    Dossier1.acceptVisiteur(vis);
    System.out.println("Taille du dossier "+Dossier1.getNom()+": "+vis.getTaille());
}
    
}
