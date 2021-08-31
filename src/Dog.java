public class Dog extends Animal
{
    private String breed;

    public Dog(String species, char gender, int yob, String breed)
    {   super(species, gender, yob);
        this.breed = breed;
    }

    public String getBreed()
    {   return breed;
    }

    public void setBreed(String breed)
    {   this.breed = breed;
    }

    public void eat()
    {   System.out.println("Chomp chomp");
    }

    public void talk()
    {   System.out.println("Bow wow");
    }

    @Override
    public String toString()
    {   return super.toString() + "\tbreed: " + breed;
    }
}