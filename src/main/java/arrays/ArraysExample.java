package arrays;

public class ArraysExample {

    public void arraysExampleFirst() {
        int[] marks = new int[10];
        System.out.println("Нулевой элемент:" + " " + marks[0]);
    }

    public void arraysExampleSecond() {
        int[] marks = new int[10];
        marks[0] = 5;
        marks[1] = 3;
        marks[2] = 5;
        marks[3] = 3;
        marks[4] = 4;
        marks[5] = 4;
        marks[6] = 3;
        marks[7] = 2;
        marks[8] = 5;
        marks[9] = 4;

//        Важнейшее свойство, которым обладают массивы, является свойство length,
//        возвращающее длину массива, то есть количество его элементов:
        System.out.println("Длину массива:" + " " + marks.length);

        //Нередко бывает неизвестным последний индекс,
        // и чтобы получить последний элемент массива, мы можем использовать это свойство:
        int last = marks[marks.length - 1];
        System.out.println("Последний элемент массива:" + " " + last);

        System.out.println("8-ой элемент массива:" + " " + marks[7]);
    }

    public void arraysExampleThird() {
        // эти два способа равноценны
        int[] nums = new int[]{1, 2, 3, 5};

        int[] nums2 = {1, 2, 3, 5};
    }

    public void arraysExampleFourth() {
        int[] nums = new int[4];
        // устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        // получаем значение третьего элемента массива
        System.out.println("3-ий элемент массива:" + " " + nums[2]);    // 4
    }

    //Многомерные массивы
    public void arraysExampleFifth() {

        int[] nums1 = new int[]{0, 1, 2, 3, 4, 5};

        int[][] nums2 = {{0, 1, 2}, {3, 4, 5}};
        //Количество квадратных скобок указывает на размерность массива.
        // А числа в скобках - на количество строк и столбцов.
        // И также, используя индексы, мы можем использовать элементы массива в программе:
        // установим элемент первого столбца второй строки
        nums2[1][0] = 44;
        System.out.println(nums2[1][0]);

        //Объявление трехмерного массива могло бы выглядеть так:
        int[][][] nums3 = new int[2][3][4];
    }

    public void arraysExampleSixth() {
        //Зубчатый массив
        int[][] nums = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[5];

//        for (тип_данных название_переменной : контейнер){
//            // действия
//        }
        //В качестве контейнера в данном случае выступает массив данных типа int.
        // Затем объявляется переменная с типом int
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println("Массив данных типа int" + " " + i);
        }

//        То же самое можно было бы сделать и с помощью обычной версии for:
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Массив данных типа int  c length:" + " " + array1[i]);
        }

        //В то же время эта версия цикла for более гибкая по сравнению for (int i : array).
        // В частности, в этой версии мы можем изменять элементы:
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2[i] * 2;
            System.out.println("Массив данных типа int  c * 2:" + " " + array2[i]);
        }
    }

    public static void main(String[] args) {
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.arraysExampleFirst();
        arraysExample.arraysExampleSecond();
        arraysExample.arraysExampleThird();
        arraysExample.arraysExampleFourth();
        arraysExample.arraysExampleFifth();
        arraysExample.arraysExampleSixth();
    }
}
