abstract class Human implements IHuman, IFunction{
    private String name;
    private Profession profession;
    Human(String name, Profession profession){
        this.name = name;
        this.profession = profession;
    }
    public Profession getProfession() { return profession;}

    @Override
    public boolean grieve(Objects obj) {
        if(happy())
            System.out.print(name + " перестал");
        else System.out.print(name);
        System.out.println(" горевает по " + obj.getName());
        return happy();
    }

    @Override
    public boolean happy() {return true;}
    @Override
    public String getName() { return name; }

    @Override
    public boolean equals(Object obj) { return this.hashCode() == obj.hashCode();}

    @Override
    public String toString() { return super.toString() + name;}

    @Override
    public int hashCode() { return super.hashCode() + name.hashCode();}

}
