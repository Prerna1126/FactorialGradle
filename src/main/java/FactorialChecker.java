public class FactorialChecker {
    private final int number;

    public FactorialChecker(int number) {
        this.number = number;
    }

    public int check() {
        int i=1;
        int result=1;
        while(i <= number){
            result = result*i;
            i += 1;
        }
        return result;
    }
}
