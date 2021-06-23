public class Employe implements IEmploye{
    private int id;
    private String nomComplet;
    private String dateEmbauche;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

   public Employe(){};
    public Employe(int id,String nomComplet,String dateEmbauche){
        this.id=id;
        this.nomComplet=nomComplet;
        this.dateEmbauche=dateEmbauche;
    }

    public String anciennete() {
        return null;
    }

    @Override
    public String affiche() {
        return "\n id : " + getId()
                + "\n Nom Complet : " + getNomComplet()
                + "\n date d'embauche : " + getDateEmbauche();

    }

    @Override
    public String compare() {
        return null;
    }
}
