/**
 * class describe clinic
 *
 * @avtor Shmotolokha
 * @since 07.08.2017
 */
//public class Dog implements Pet{
/**
 * Basic realization of animal
 */
// private final Pet pet;

// public Dog(final Pet pet){
//   this.pet=pet;
//}
/**
 * (@inheritDoc)
 */
//@Override
//public String getName() {
//   return this.pet.getName();
//}

//}
public class Dog implements Pet {
    private final Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return this.animal.getName();
    }
}