public class Etudiant
{
    public static void main(String[] args) 
    {
        System.out.println("creation de la classe Etudiant");
        Etudiant zobel = new Etudiant();
        Etudiant tal = new Etudiant();
    }
    public Etudiant()
    {
        System.out.println(" je suis un etudiant : " + this);
    }
}