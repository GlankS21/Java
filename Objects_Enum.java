public enum Objects_Enum {
    MACHINE("паровая машина"),
    STAINS("поводу пятен на полке"),
    VALVE("предохранительный клапан");
    private String name;
    Objects_Enum(String name){
        this.name = name;
    }

    @Override
    public String toString() {return name;}
}
