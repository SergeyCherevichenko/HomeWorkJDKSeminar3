public class Main {
    public static void main(String[] args) {
        System.out.println(Calculate.calc(15,1.456,'/'));
        System.out.println(Calculate.calc(130,1.987,'*'));
        System.out.println(Calculate.calc(17,30,'+'));
        System.out.println(Calculate.calc(6,0.5,'-'));
        System.out.println(Calculate.calc(100,0,'/'));

        Object[] intArray = {1, 2.0, 3.5f};
        Double[] doubleArray = {1.5, 2.5, 3.0};
        System.out.println(Calculate.compareArrays(intArray,doubleArray));

        Integer [] intArray1 = {1,9,10};
        Object [] integerArray  = {1,"Hello",10};
        System.out.println(Calculate.compareArrays(intArray1,integerArray));

        Double [] doubleArray1 = {1.0,3.4,5.7};
        Long [] longArray = {14L,46L,90L};
        Float [] floatArray = {1.67f,56f};
        System.out.println(Calculate.compareArrays(doubleArray1,floatArray));
        Object[] obArray1 = {"Hello",15,45.6};
        Object[] obArray2 = {"Привет",67,100.1};
        System.out.println(Calculate.compareArrays(obArray1,obArray2));


        Pair<Integer, String> intStringPair = new Pair<>(42, "Hello");
        System.out.println("Pair: " + intStringPair);
        System.out.println("First value: " + intStringPair.getFirst());
        System.out.println("Second value: " + intStringPair.getSecond());



    }
}