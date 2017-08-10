/**
 * class describe clinic
 *
 * @avtor Shmotolokha
 * @since 07.08.2017
 */
/* {
/**
 * Name
 */
   /* private final String name;
    /**
     * Constructor
     * @param animal`s name
     */
   /* public Animal(final String name){
        this.name=name;
    }
}*/
public class Animal implements Pet {
    private final String name;

    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
