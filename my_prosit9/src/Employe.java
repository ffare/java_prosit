public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartment;
    private int grade;

    public Employe() {

    }

    public Employe(int id, String nom, String prenom, String nomDepartment, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartment = nomDepartment;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getNomDepartment() {return nomDepartment; }
    public int getGrade() { return grade; }

    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String p) { this.prenom = p; }
    public void setNomDepartment(String nd) { this.nomDepartment = nd; }
    public void setGrade(int grade ) { this.grade = grade; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employe e)) {
            return false;
        }
        return getId()==e.getId() && getNom().equals(e.getNom());
    }

    @Override
    public int compareTo(Employe o) {
        return this.getId() - o.getId();
    }

}

