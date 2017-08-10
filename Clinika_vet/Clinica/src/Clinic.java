//import java.util.Scanner;

/**
 *class describe clinic
 *@avtor Shmotolokha
 *@since 21.07.2017
 */
public class Clinic
{
    /**
     * List of Clients
     */
    private final Client[] clients;

    public Clinic(final int size)
    {
        this.clients =new Client[size];
    }
    /**
     *add Client
     *@param position Position
     *@param client Client
     */
    public void addClient(final int position, final Client client)
    {
        this.clients[position] = client;
    }
    public Client[] findClientsByPetName(final String name)
    {
        int i;
        for (i=0; i<clients.length; i++)
        {}
    /*System.out.println("Name Client");
    String Name=reader.next();*/

        return new Client[]{};
    }
 /*public static void main(String[] arg){
  //Clinic
  Clinic clinic=new Clinic(3);

  clinic.addClient(0,new Client("Brown",new Cat("Digy")));

  clinic.addClient(1,new Client("Nick",new Dog(new Animal("Sparky"))));

  clinic.addClient(2,new Client("Ann",new CatDog(new Cat("Tom"),new Dog(new Animal("Piccy")))));
 }*/
}