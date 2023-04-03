import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер завдання:");
        int task = scanner.nextInt();
        switch (task) {    //Вибираємо завдання
            case 1: {
                double F; // створюємо змінну необхідну для завдання
                System.out.println("Введіть значення змінної а:");
                double a = scanner.nextDouble();
                System.out.println("Введіть значення змінної b:");
                double b = scanner.nextDouble();
                System.out.println("Введіть значення змінної c:");
                double c = scanner.nextDouble();
                System.out.println("Введіть значення х:");
                double x = scanner.nextDouble();
                if (x < 0 && b != 0) F = a - (x / (10 + b));
                else if (x > 0 && b == 0) F = (x - a) / (x - c);
                else F = 3 * x + (2 / c);
                System.out.println(F);
                break;
            }

            case 2: {
                System.out.print("Введіть номер операції (1-додавання, 2-віднімання, 3-множення, 4-ділення): ");
                int operator = scanner.nextInt();

                System.out.print("Введіть перше число: ");
                double A = scanner.nextDouble();

                System.out.print("Введіть друге число: ");
                double B = scanner.nextDouble();

                double result = 0;

                switch (operator) {    // вибираємо необхідну операцію
                    case 1:
                        result = A + B;
                        System.out.println("Результат: " + result);
                        break;
                    case 2:
                        result = A - B;
                        System.out.println("Результат: " + result);
                        break;
                    case 3:
                        result = A * B;
                        System.out.println("Результат: " + result);
                        break;
                    case 4:
                        if (B > 0) {     // При В<0 ділення не буде відбуватися
                            result = A / B;
                            System.out.println("Результат: " + result);
                        } else System.out.println("Число В не повинно дорівнювати 0!!!");
                        break;
                    default:
                        System.out.println("Неправильний номер операції!");
                        return;
                }
            }
            case 3: {
                System.out.println("Введіть розмір зарплати співробітника: ");
                double zarplata = scanner.nextDouble();// вводимо з\п працівника
                System.out.println("Введіть кількість працівників: ");
                int people = scanner.nextInt(); //вводимо к-сть працівників
                if (people < 0) {
                    System.out.println("Кількість працівників не може бути від'ємною!!!");
                    break;
                }
                double total = zarplata * people; // рахуємо суму виплачених грошей
                System.out.println("Загальна сума виплачених грошей: " + total);
                break;
            }
            case 4: {
                int[] sequence = new int[18];//створюємо масив який буде містити значення елементів нашої послідовності
                for (int i = 0; i < sequence.length; i++) {   //заповнюємо масив даними
                    System.out.print("Введіть " + (i + 1) + "-й елемент послідовності: ");
                    sequence[i] = scanner.nextInt();
                }
                int count = 0;// створюємо змінну, яка містить дані про те, скільки рівних елементів на початку послідовності
                int i = 0;
                while (sequence[i] == sequence[i + 1]) {    // поки і-й елемент масиву буде = і+1-му буде виконуватися цей код
                    count++;
                    i++;
                }
                System.out.println("Кількість рівних елементів на початку послідовності: " + count);
            }
            case 5: {
                System.out.println("Варіант завдання А");
                int[][] numbers = {     //створюємо багатовимірний масив, що містить потрібні нам дані
                        {4, 3, 2, 1, 0},
                        {3, 2, 1, 0},
                        {1, 2, 0},
                        {1, 0},
                        {0}
                };

                // проходимо по рядках масиву
                for (int[] row : numbers) {
                    // проходимо по кожному числу в рядку та виводимо його
                    for (int num : row) {
                        System.out.print(num + " ");
                    }
                    // після виведення чисел в рядку переходимо на новий рядок
                    System.out.println();
                }
                System.out.println();
                System.out.println("Варіант завдання Б");// принцип той самий, що і у варіанті А
                int[][] numbers2 = {
                        {2},
                        {3, 2},
                        {4, 3, 2},
                        {5, 4, 3, 2},
                        {6, 5, 4, 3, 2}
                };

                for (int[] row : numbers2) {
                    for (int num : row) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                break;
            }

            default:{
                System.out.println("Номер завдання введено невірно, будь-ласка, вводьте номер від 1 до 5");
                break;
            }
        }
        }

    }