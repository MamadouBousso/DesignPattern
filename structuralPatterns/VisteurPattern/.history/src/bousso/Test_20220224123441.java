package bousso;

import java.util.Vector;

public class Test {
public static void main(String[] args) {
    IElement Fichier1 = new Fichier("Bonjour.txt",20);
    IElement Fichier2 = new Fichier("Bonjour1.txt",200);
    IElement Fichier3 = new Fichier("Bonjour2.txt",30);

    Vector<IElement> els = new Vector<IElement> ();
    

    Dossier Dossier1 = new Dossier(els,"DossierBonjour");

    Dossier1.add(Fichier1);
    Dossier1.add(Fichier2);
    Dossier1.add(Fichier3);

    IVisiteur vis = new TailleVisiteur();
    Dossier1.acceptVisiteur(vis);
    System.out.println("Taille du dossier: "+vis.getTaille());
}
    
}
