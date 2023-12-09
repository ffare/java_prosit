import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> employes;

    public SocieteArrayList() { employes = new ArrayList<>(); }

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }
    public void displayEmploye() {
        System.out.println(employes);
    }
    public void trierEmployeParId() {
        Collections.sort(employes);
    }
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> comparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNomDepartment().compareTo(o2.getNomDepartment());
            }
        };
        Comparator<Employe> comparator1 = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };

        Collections.sort(employes, comparator.thenComparing(comparator1));
    }
}
