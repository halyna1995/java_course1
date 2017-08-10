/**
 *class describe clinic
 *@avtor Shmotolokha
 *@since 07.08.2017
 */
public class ClinicRunner
{
    /**
     * List of Clients and Pets
     */
    public static void main(String[] arg){
        //Clinic
        Clinic clinic=new Clinic(10);

        clinic.addClient(0,new Client("Brown",new Cat("Digy")));

        clinic.addClient(1,new Client("Nick",new Dog(new Animal("Sparky"))));

        clinic.addClient(2,new Client("Ann",new CatDog(new Cat("Tom"),new Dog(new Animal("Piccy")))));

        System.out.printf("clinic");
    }
}