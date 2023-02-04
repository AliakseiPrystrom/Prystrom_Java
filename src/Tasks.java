public class Tasks {
    public Tasks() {
    }

    public void start() {
        this.taskOne();
        this.taskTwo();
        this.taskThree();
    }

    public void taskOne() {
        System.out.println("Задание 1");
        if (Utils.scanInt() > 7) {
            System.out.println("Привет");
        }
    }

    public void taskTwo() {
        System.out.println("Задание 2");
        if ("Вячеслав".equals(Utils.scanString())) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void taskThree() {
        System.out.println("Задание 3");
        int[] array = Utils.scanIntArray();
        for (int i : array) {
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
