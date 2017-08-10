/**
 * class describe clinic
 *
 * @avtor Shmotolokha
 * @since 07.08.2017
 */
public class CatDog implements Pet{
    private final Pet cat;
    private final Pet dog;

    public  CatDog(Pet cat,Pet dog){
        this.cat=cat;
        this.dog=dog;
    }
    /**
     * (@inheritDoc)
     * @return
     */
    @Override
    public String getName(){
        return String.format("%s%s",this.cat.getName(),this.dog.getName());
    }
}