public class Main {
    public static void main(String[] args) {
int a = 2500;
byte b = 5;
short c = 3000;
long d = 5500L;
float e = 10.5f;
double f = 365.365;
System.out.println("Значение переменной int с типом Целоисчесленные равно " + a);
System.out.println("Значение переменной byte с типом Целоисчесленные равно " + b);
System.out.println("Значение переменной short с типом Целоисчесленные равно " + c);
System.out.println("Значение переменной long с типом Целоисчесленные равно " + d);
System.out.println("Значение переменной float с типом С плавающей точкой равно " + e);
System.out.println("Значение переменной double с типом С плавающей точкой равно " + f);

float aa = 27.12f;
long ab = 987678965549L;
byte ac = 2;
int ad = 786;
boolean ae = false;
short af = -159;
int ag = 27897;
byte ah = 1;
char ai = 33;
double aj = 3.45678;

int lyudmilaPavlovnaStudents = 23;
int annaSergeevnaStudents = 27;
int ekaterinaAndreevnaStudents = 30;
int allStudents = lyudmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
int allPaper = 480;
int individualPaper = allPaper / allStudents;
System.out.println("На каждого ученика рассчитано " + individualPaper + " листов бумаги");

int bottleCarPerformanceForTwoMinutes = 16;
int oneMinutePerformance = bottleCarPerformanceForTwoMinutes / 2;
int perfomance20Minutes = oneMinutePerformance * 20;
int perForDay = oneMinutePerformance * 60 * 24;
int perForThreeDays = perForDay * 3;
int perForMonth = perForThreeDays * 10;
System.out.println("За 20 минут работы машина произвела бутылок " + perfomance20Minutes + " штук ");
System.out.println("За день работы машина произвела бутылок " + perForDay + " штук ");
System.out.println("За 3 дня работы  машина произвела бутылок " + perForThreeDays + " штук ");
System.out.println("За месяц работы машина произвела бутылок " + perForMonth + " штук ");



    }
}