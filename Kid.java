public class Kid extends Human{
    private Machine machine;
    Kid(Machine machine){
        super("Малыш", Profession.UNDEFINED);
        this.machine = machine;
    }

    @Override
    public boolean happy() {
        if(machine.run) System.out.println(this.getName() + " был счастлив, что у него есть такая чудесная паровая машина");
        else System.out.println(this.getName() + " горевает по тому, что машина не работает !");
        return machine.run;
    }
}
