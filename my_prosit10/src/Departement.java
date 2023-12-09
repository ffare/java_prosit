import java.util.Comparator;

public class Departement implements Comparable<Departement> {
    private int id;
    String nomDepartement;
    private int nbrEmployes;

    public Departement() {

    }

    public Departement(int id, String nomDepartement, int nbrEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmployes = nbrEmployes;
    }

    public int getId() { return id; }
    public String getNomDepartement() { return nomDepartement; }
    public int getNbrEmployes() { return nbrEmployes; }

    public void setId(int id) { this.id = id; }
    public void setNomDepartement(String nomDepartement) { this.nomDepartement = nomDepartement; }
    public void setNbrEmployes(int nbrEmployes) { this.nbrEmployes = nbrEmployes; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Departement dprt)) return false;
        return id==dprt.getId();
    }

    @Override
    public String toString() {
        return "Identifiant: "+id+
                "\nNom de departement: "+nomDepartement+
                "\nNombre employes: "+nbrEmployes;

    }

    @Override
    public int compareTo(Departement o) {
        return getId() - o.getId();
    }
}
