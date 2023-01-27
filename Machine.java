public class Machine extends Objects{
    protected boolean run = false;
    Machine(Objects_Enum name){
        super(name);
    }
    public void repair(Human human, Objects obj){
        System.out.println("паровую машину проверил " + human.getProfession() + " "+ human.getName());
        if(run == false) {
            if (human.getProfession() == Profession.SPECIANLIST && obj.getName() == Objects_Enum.VALVE) {
                System.out.println("искусно проверил ее предохранительный клапан");
                run = true;
            } else System.out.println("машина не работает !");
        }
        else System.out.println("машина же хорошо работает !");
    }
    public boolean test_run(){
        if(run) {
            System.out.println("Фут-фут-фут...- пыхтела машина все быстрее и быстрее");
            System.out.println("Фут-фут-фут!..- Под конец она стала задыхаться, точно мчалась галопом");
        }
        else    System.out.println("машина не работает !");
        return run;
    }

}
