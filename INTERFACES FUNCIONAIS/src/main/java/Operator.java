@FunctionalInterface
public interface Operator {

    int execute (int x , int y);

    default  void say(){
        System.out.println("I'm the operator");
    }

}
