public class Calculator {
    public static int increase(int a, int b){
        int sum=0;
        for(a=a; a<=b; a++){
            sum+=a;
        }
        return sum;
    }
    public static int increase(test a, test b){
        int sum=0;
        for(; a.n<=b.n; a.n++){
            sum+=a.n;
        }
        return sum;
    }
}

class test{
    public int n;
}
