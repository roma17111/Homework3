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

int totalPotsPaint = 120;
int whitePaintForClass = 2;
int brownPaintForClass = 4;
int allPotsPaintsForClass = whitePaintForClass + brownPaintForClass;
int totalClassesInSchool = totalPotsPaint / allPotsPaintsForClass;
int brown = brownPaintForClass * totalClassesInSchool;
int white = whitePaintForClass * totalClassesInSchool;
System.out.println("В школе, где " + totalClassesInSchool + " классов, нужно " +
       white + " банок белой краски и " + brown + " банок коричневой краски");

int bananasWeight = 5 * 80;
int milkWeight = 105 * 2;
int iceWeight = 100 * 2;
int eggsWeight = 4 *  70;
int totalWeightSportEatInGramms = bananasWeight + milkWeight + iceWeight + eggsWeight;
int grPerKg = 1000;
float weightKg = totalWeightSportEatInGramms /(float)grPerKg;
System.out.println("Общий вес спортивного завтрака составляет " + weightKg + " килограмм");


int weightKgSport = 7;
int weightGrSport = weightKgSport * 1000;
int grForDayOne = 250;
int grForDayTwo = 500;
int grAverage = (grForDayOne + grForDayTwo) / 2;
int needDays250 = weightGrSport / grForDayOne;
int needDays500 = weightGrSport / grForDayTwo;
int needDaysAverage = weightGrSport / grAverage;
System.out.println("Если спортсмен будет каждый день худеть на " + grForDayOne + " грамм, на всё похудение уйдёт " +
        needDays250 + " дней");
System.out.println("Если спортсмен будет каждый день худеть на " + grForDayTwo + " грамм, на всё похудение уйдёт " +
                needDays500 + " дней");
        System.out.println("Если спортсмен в среднем будет каждый день худеть на " + grAverage + " грамм, на всё похудение уйдёт " +
                needDaysAverage + " дней");

float masha = 67660;
float denis = 83690;
float kristina = 76230;
float mashaYear = masha * 12;
float denisYear = denis * 12;
float kristinaYear = kristina * 12;
float mashaUp = masha + (masha / 100 * 10);
float denisUp = denis + (denis / 100 * 10);
float kristinaUp = kristina + (kristina / 100 * 10);
float mYearUp = mashaUp * 12;
float kYearUp = kristinaUp * 12;
float dYearUp = denisUp * 12;
float mashYear = masha * 12;
float denYear = denis * 12;
float kriYear = kristina * 12;
float mDifY = mYearUp - mashYear;
float dDifY = dYearUp - denYear;
float kDifY = kYearUp - kriYear;
System.out.println("Маша теперь получает " + mashaUp + " рублей. Годовой доход вырос на " +
        mDifY + " рубля.");
System.out.println("Денис теперь получает " + denisUp + " рублей. Годовой доход Дениса вырос на " +
        dDifY + " рублей.");
System.out.println("Кристина теперь получает " + kristinaUp + " рубля. Её годовой доход вырос на " +
        kDifY + " рублей.");
    }
}