public class Temperature  
{
    public static void main(String[] args) 
    {
        Int t;
        t=0;
        System.out.printline("entrez la température de l'eau");
        t= Clavier.lireInt();
        
        if (t<=0)
        {
            System.out.println("votre eau est à l'état de glace");
        }
        else
        {
            if (t>100)
            {
                System.out.println("votre eau est à l'état gazeux");
            }
            else
            {
                System.out.println("votre eau est à l'état liquide");
            }
        }
    }
}
