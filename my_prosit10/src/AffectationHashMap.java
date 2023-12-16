import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> hmap;

    public AffectationHashMap() {
        hmap = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hmap.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : hmap.entrySet()) {
            System.out.println("Employe: "+entry.getKey().getNom()+
                                "\nDepartement: "+entry.getValue().getId());
        }
    }

    public boolean supprimerEmployeEtDepartement(Employe e, Departement d) {
        return hmap.remove(e, d);
    }

    public void afficherEmployes() {
        Set<Employe> keys = hmap.keySet();
        Iterator<Employe> it = keys.iterator();
        while (it.hasNext()) {
            System.out.println("Employe: "+it.next().getId());
        }
    }

    public void afficherDepartements() {
        Collection<Departement> values = hmap.values();
        for (Departement d : values) {
            System.out.println("Departement: "+d);
        }
    }

    boolean rechercherEmploye(Employe e) {
        return hmap.containsKey(e);
    }

    boolean rechercherDepartement(Departement d) {
        return hmap.containsValue(d);
    }

    TreeMap<Employe, Departement> trierMap() {
        Comparator<Employe> comparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getId()-o2.getId();
            }
        };

        TreeMap<Employe, Departement> tmap = new TreeMap<>(comparator);
        tmap.putAll(hmap);
        return tmap;
    }
}
