package dzaky;

public class Calculator {

    public int add(int... args) {
        int result = 0;
        for (int arg : args) {
            result += arg;
        }
        return result;
    }

    public int division(int a,int b){
        if(b == 0){
            throw new IllegalArgumentException("Division by zero");
        } else{
            return a/b;
        }
    }
}
