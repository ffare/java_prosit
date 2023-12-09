import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    Set<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    public void ajouterDepartement(Departement dprt) {
        departements.add(dprt);
    }

    public boolean rechercherDepartement(String nom) {
        for (Departement dprt : departements) {
            if (dprt.getNomDepartement().equals(nom)) return false;
        }
        return false;
    }
    public boolean rechercherDepartement(Departement dprt) {
        return departements.contains(dprt);
    }
    public void supprimerDepartement(Departement dprt) {
        departements.remove(dprt);
    }
    public void displayDepartement() {
        System.out.println(departements);
    }
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> treedprt = new TreeSet<>(departements);
        return treedprt;

    }
}
