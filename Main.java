package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Point point = new Point(1,2);
//        System.out.println(pow());
//        divBy2And3();
//        System.out.println(stringStuff());
//        System.out.println(salaryStuff());
//        System.out.println(sumNum());
//        System.out.println(sameNumbers());
//          Point[] a = new Point[2];
//          Point[] b = new Point[2];
//          a[0] = new Point(1,2);
//          a[1] = new Point(3,4);
//          b[0] = new Point(5,6);
//          b[1] = new Point(7,8);
//          Point[] c = new Point[a.length+b.length];
//          c = join(a,b);
//        System.out.println("Q7:");
//        printPointArray(c);



    }
    //1
    public static void divBy2And3(){

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                continue;
            }
            if (i % 2 == 0 || i % 3 == 0){
                System.out.println(i);
            }
        }
    }


    //2
    public static int pow(){
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("enter the first number");
        a = s.nextInt();
        System.out.println("enter the second number");
        b = s.nextInt();
        s.close();
        System.out.println("ur number is:");
        return (int) Math.pow(a, b);

    }


    //3
    public static String stringStuff(){
        int cnt = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("type in stuff");
        String a = s.nextLine();
        s.close();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' '){
                cnt++;
            }
        }
        return ("you have " + cnt + " words");
    }


    //4
    public static int salaryStuff(){

        int afterTax = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("type in ur salary");
        int salary = s.nextInt();
        if (salary <= 6290){
            afterTax = salary - (salary / 10);
        }
        if (salary >= 6291 && salary <=9030){
            afterTax = salary - (salary / 100) * 14;
        }
        if (salary >= 9031 && salary <= 14490){
            afterTax = salary - (salary / 100) * 20;
        }
        if (salary >= 14491 && salary <= 20140){
            afterTax = salary - (salary / 100) * 31;
        }
        if (salary >= 20141 && salary <= 41910){
            afterTax = salary - (salary / 100) * 35;
        }
        if (salary >= 41911 && salary <= 53970){
            afterTax = salary - (salary / 100) * 47;
        }
        if (salary >= 53971){
            afterTax = salary - (salary / 100) * 50;
        }

        System.out.println("ur salary after tax is:");
        return afterTax;
    }


    //5
    public static int sumNum(){
        int arr[] = new int[0],sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += a;
        }
        return sum;
    }


    //6
    public static int sameNumbers(){

        int arr[] = new int[0],cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]){
                    cnt++;
                }
            }
        }
        return cnt;
    }


    //7
    public static Point[] join(Point a[], Point b[]){
        Point[]c = new Point[a.length+b.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i+a.length] = b[i];
        }
        return c;

    }
    //7*
    public static void printPointArray(Point[]c){
        for (int i = 0; i < c.length; i++) {
            System.out.print("(" + c[i].x + "," + c[i].y + ") ");
        }
        System.out.println();
    }

    //8
    public void maxSlant(Point[] a){

        double tempSlant = Integer.MIN_VALUE;
        int tempRow = 0;
        int tempCol = 0;
        double[][] pointMatrix = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i >= j || a[i].x == a[j].x){
                    pointMatrix[i][j] = Integer.MIN_VALUE;
                }
                else {
                    double slant = (a[i].y - a[j].y)/(a[i].x - a[j].x);
                    pointMatrix[i][j] = slant;
                    if (slant > tempSlant){
                        tempSlant = slant;
                        tempRow = i;
                        tempCol = j;
                    }
                }
            }
        }
        System.out.println("(" + a[tempRow].x + "," + a[tempRow].y +") , (" + a[tempCol].x + "," + a[tempCol].y);
        System.out.println("The slant is: " + pointMatrix[tempRow][tempCol]);
    }

    //TODO 9

    public ArrayList<Date> sortDates(Date[] dates){
        ArrayList<Date> dateArrayList = new ArrayList<Date>();
        dateArrayList.addAll(Arrays.asList(dates));
        //dateArrayList.sort();



        return null;
    }

    //TODO 10

     public ArrayList<Date> getEarliestAvrgDateList(ArrayList<ArrayList<Date>> listOflistsOfDates){



        return null;
     }

}

