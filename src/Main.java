public class Main {
    public static void main(String[] args) {
        System.out.println("Задача номер 1");
        for (int i = 1 ; i <=10; i++){
            System.out.println("Итерация цикла "+ i);
        }
        System.out.println("Задача 2");
        for (int a = 10 ; a>=1 ; a--){
            System.out.println("Итерация цикла "+a);
        }
        System.out.println("Задача 3 ");
        for (int i = 0; i <= 17; i+=2){
            System.out.println("итерация цикла " +i);
        }
        System.out.println("Задача 4 ");
        for (int i =10 ; i >=-10;i-- ){
            System.out.println("Итерация цикла "+i);
        }
        System.out.println("Задача 5 ");
        for (int i = 1904; i <2096 ; i= i +4 ){
            System.out.println("Высокосный год является "+i);
        }
        System.out.println("Задача номер 6");
        for (int i = 7; i<=98; i= i +7){
            System.out.println(+i);
        }
        System.out.println("Задача 7 ");
        for (int i = 1; i <= 512; i= i*2)
            System.out.println(+i);
        System.out.println("Задача8 ");
        int inbankaccaunt  =29000;
        int total = 0;
        for (int i = 0; i<=12; i++) {
            total = total +total/100;
            total = total+inbankaccaunt;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+ " рублей");
        }
    }
}