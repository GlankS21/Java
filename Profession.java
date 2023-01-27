public enum Profession {
    SPECIANLIST("специалист по паровым машинам"),
    UNDEFINED("");
    private String name;
    Profession(String name){
        this.name = name;
    }

    @Override
    public String toString() {return name;}
}
