public class Main{
    
    public static int firstSum = 0;
    public static int secondSum = 0;
    public static int firstValue = 0;
    public static int secondValue = 0;
    public static int thirdValue = 0;
    public static int fourthValue = 0;

    public static void setValue(int a, int b, int c, int d){
        firstValue = a;
        secondValue = b;
        thirdValue = c;
        fourthValue = d;
    }
    
    public static void printIfTrue(Boolean val) {
        if (val){
            System.out.println("true");
        }
    }

    public static void printTrueOrFalse(Boolean val){
        if (val){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
    public static void main(String[] args){
        /* Надаnb значення 4 полям типу int. */
        setValue(1,-2,3,4);
        Operators operObject = new Operators();

        /* Додаємо їх попарно. */
        firstSum = operObject.sumValue(firstValue, secondValue);
        secondSum = operObject.sumValue(thirdValue, fourthValue);
        /* Виводить результат порівняння додавання (true, якщо перша сума більша) */
        printIfTrue(operObject.compareValue(firstSum, secondSum));

        /* Збільшує першу суму на 1. Другу суму зменшує на 2. */
        firstSum = operObject.incrementBy1(firstSum);
        secondSum = operObject.decrementBy2(secondSum);
        
        /* Виводить результат порівняння (true якщо перша сума більша). */
        printIfTrue(operObject.compareValue(firstSum, secondSum));

        /* Виводить true якщо хоча б одна сума кратна 2, інакше - false. */
        printTrueOrFalse(operObject.atLeastOneSumIsEven(firstSum, secondSum));

    }
}