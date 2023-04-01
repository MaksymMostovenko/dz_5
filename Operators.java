public class Operators{
    public int sumValue(int a, int b){
        return a+b;
    }

    public Boolean compareValue(int a, int b){
        return (a>b) ? true : false;
    }

    public int incrementBy1(int val){
        return val+1;
    }

    public int decrementBy2(int val){
        return val-2;
    }

    public Boolean atLeastOneSumIsEven(int a, int b){
        Boolean flag1 = (a%2==0) ? true : false;
        Boolean flag2 = (b%2==0) ? true : false;
        return (flag1 || flag2) ? true : false;
    }
}