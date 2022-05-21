class MyException extends Exception {
    private int detail;
    MyException(int a){
        this.detail = a;
    }
    public String toString() {
        return "MyException["+detail+"]";
    }
}
public class NewClass {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute("+a+")");
        if (a>10)
            throw new MyException(a);
        System.out.println("Нормальное заверщение!");
    } public static void main (String args[]){
        try {
            compute(2);
            compute(20);
        } catch (MyException e){
            System.out.println("Перехват исключения: "+ e);
        }

    }
}
