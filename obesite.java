public class obesite 
{
  public static void main(String[] args)
  {  
    float pi; 
    float BMI;
    int taille= 180;
    int poids=80;
    String sexe;
        
    if (sexe = "M")
    {
      pi= (taille-100)-(taille-150)/4;
    }
    else 
    {
      pi= (taille-100)-(taille-150)/2;
    }
    System.out.println(pi);
    BMI=poids/taille*2;
    if (BMI<27) 
    {
      System.out.println("personne normale");
    }
    else
    {
      if(BMI>=27 & BMI<32)
      {
        System.out.println("personne obese");
      }
      else
      {
        System.out.println("personne malade");

      }
    }
  }
}
   
