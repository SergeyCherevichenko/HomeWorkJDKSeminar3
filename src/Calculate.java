/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные
 статические методы: sum(), multiply(), divide(), subtract().
 Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 Методы должны возвращать результат своей работы.
 */

public class Calculate {

    public static <T extends Number, U extends Number> double sum(T x, U y){
        return x.doubleValue() + y.doubleValue();

    }
    public static <T extends Number,U extends Number> double multiply( T x,U y){
         return x.doubleValue() * y.doubleValue();

    }
    public static <T extends Number,U extends Number> double subtract(Number x,Number y){
        return x.doubleValue() - y.doubleValue();
    }
    public static <T extends Number,U extends Number> double divide(Number x, Number y){
        if(y.doubleValue() == 0){
            System.out.println("на ноль делить нельзя!");
            return Double.NaN;
        }else {
            return x.doubleValue() / y.doubleValue();
        }
    }
    public static<T extends Number,U extends Number> double calc(T x,U y,char op) {
        if (op == '+') return sum(x, y);
        else if (op == '-') return subtract(x, y);
        else if (op == '*') return multiply(x, y);
        else if (op == '/') return divide(x, y);
        else {
            System.out.println("Такой операции не существует!");
            return Double.NaN;
        }
    }

//  Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
//  если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
//  но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.


    public static <T,U> boolean compareArrays(T[] arr1, U[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Массивы имеют разную длину
        }

        for (int i = 0; i < arr1.length; i++) {
          if (!arr1[i].getClass().equals(arr2[i].getClass())) {
                return false; // Элементы на позиции i имеют разные типы
            }
        }

        return true; // Массивы одинаковые
    }



}
