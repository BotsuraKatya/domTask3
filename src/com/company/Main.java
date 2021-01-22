package com.company;

public class Main {

    public static void main(String[] args) {
//        int month = 11;
//        int season=0;
//
//        if (month > 2 && month < 6) {
//            System.out.println("Весна");
//            season=1;
//        }
//
//        else if(month > 8 && month < 12){
//            System.out.println("Осень");
//            season=2;
//        }
//
//        else if(month > 5 && month < 9){
//            System.out.println("Лето");
//            season=3;
//        }
//        else if((month > 9 && month < 13)||(month ==1)){
//            System.out.println("Зима");
//            season=4;
//
//        }
//
//        else {
//            System.out.println("Вы ввели неверный месяц");
//            season=0;
//
//        }
//
//        switch (season) {
//            case 1:
//                System.out.println("Весна");
//                break;
//            case 2:
//                System.out.println("Осень");
//                break;
//            case 3:
//                System.out.println("Лето");
//                break;
//            case 4:
//                System.out.println("Зима");
//                break;
//
//            default:
//                System.out.println("Вы ввели неверный месяц");
//        }
    int[] array = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i= array.length-1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[][]  squareArray = new int[2][3];
        squareArray[0][0] = 6;
        squareArray[0][1] = 4;
        squareArray[0][2] = 3;
        squareArray[1][0] = 3;
        squareArray[1][1] = 2;
        squareArray[1][2] = 1;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "["+i+"]["+j+"]"+" ");
            }
            System.out.println();
        }
    }

}


