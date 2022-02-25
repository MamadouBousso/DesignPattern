package bousso;

import java.util.Vector;

public class Test {
    IElement Fichier1 = new Fichier("Bonjour.txt",20);
    IElement Fichier2 = new Fichier("Bonjour1.txt",200);
    IElement Fichier3 = new Fichier("Bonjour2.txt",30);
    Vector<IElement> els = new Vector<IElement> ();
    els.add(Fichier1);
    els.add(Fichier2);
    els.add(Fichier3);

    IElement Dossier1 = new Dossier(els,);
}
