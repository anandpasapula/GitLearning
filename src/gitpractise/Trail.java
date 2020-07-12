package gitpractise;

public class Trail {
    public void method() {


        System.out.println("print2");
    }
    public static void main(String[] args){

        System.out.println("print1");

        Trail obj=new Trail();
        obj.method();
    }
}
