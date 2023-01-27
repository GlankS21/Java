public class Objects implements IFunction{
    private Objects_Enum name;
    Objects(Objects_Enum name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) { return this.hashCode() == obj.hashCode();}

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() { return super.hashCode() + name.hashCode(); }

    public Objects_Enum getName() {return name;}
}
