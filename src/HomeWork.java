public class HomeWork {

//Напишите метод, который изменяет значение переменной типа Integer.
// Объявите метод changeValue, который принимает параметр типа Integer под названием value.
// Внутри метода с помощью оператора присваивания запишите в параметр значение 22.



    //В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
    public static void main(String[] args) {
        Integer value = 33;
        // В следующей строке вызовите метод changeValue и передайте в него эту переменную.
        HomeWork homeWork = new HomeWork();
        homeWork.changeValue();

    }

    public static void changeValue(){
        Integer value = 22;
        System.out.println(value);
    }



  }