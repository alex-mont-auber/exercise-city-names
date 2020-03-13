package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // START FASE 1

        String VarCity1, VarCity2, VarCity3, VarCity4, VarCity5, VarCity6;

        Scanner CityQuestion = new Scanner(System.in);
        System.out.print("List of city names. First city: ");

        VarCity1 = CityQuestion.nextLine();
        System.out.print("Next city: ");
        VarCity2 = CityQuestion.nextLine();
        System.out.print("Next city: ");
        VarCity3 = CityQuestion.nextLine();
        System.out.print("Next city: ");
        VarCity4 = CityQuestion.nextLine();
        System.out.print("Next city: ");
        VarCity5 = CityQuestion.nextLine();
        System.out.print("Last city: ");
        VarCity6 = CityQuestion.nextLine();
        System.out.println();

        System.out.println("Cities List: " + VarCity1 + ", " + VarCity2 + ", " + VarCity3 + ", " + VarCity4 + ", " + VarCity5 + ", " + VarCity6);

        // END FASE 1

        // START FASE 2

        ArrayList<String> ArrayCities = new ArrayList<>();
        ArrayCities.add(VarCity1);
        ArrayCities.add(VarCity2);
        ArrayCities.add(VarCity3);
        ArrayCities.add(VarCity4);
        ArrayCities.add(VarCity5);
        ArrayCities.add(VarCity6);

        System.out.println();
        System.out.println("Array of cities: " + ArrayCities);

        Collections.sort(ArrayCities);

        System.out.println();
        System.out.println("Array of cities, and ordered alphabetically: " + ArrayCities);

        // END FASE 2

        // START FASE 3

        ArrayList<String> ModifiedArrayCities = new ArrayList<>();

        for(String e: ArrayCities){
            char OldChar = 'a';
            char NewChar = '4';
            ModifiedArrayCities.add(e.replace('a','4'));

        }
        System.out.println();
        System.out.println("Modified cities, and orded alphabetically: " + ModifiedArrayCities);
        System.out.println();

        // END FASE 3

        // START FASE 4

        // Create string array's

        String[] ArrayXCityOne = new String[ArrayCities.size()];
        String[] ArrayXCityTwo = new String[ArrayCities.size()];
        String[] ArrayXCityThree = new String[ArrayCities.size()];
        String[] ArrayXCityFour = new String[ArrayCities.size()];
        String[] ArrayXCityFive = new String[ArrayCities.size()];
        String[] ArrayXCitySix = new String[ArrayCities.size()];

        // Read and asign one city => one array

        for(int e = 0; e < ArrayCities.size(); e++){
            ArrayXCityOne[0] = ArrayCities.get(0);
            ArrayXCityTwo[1] = ArrayCities.get(1);
            ArrayXCityThree[2] = ArrayCities.get(2);
            ArrayXCityFour[3] = ArrayCities.get(3);
            ArrayXCityFive[4] = ArrayCities.get(4);
            ArrayXCitySix[5] = ArrayCities.get(5);
        }

        // Conversion for Array to Char array.

        char[] ArrayCityOne = ArrayXCityOne[0].toCharArray();
        char[] ArrayCityTwo = ArrayXCityTwo[1].toCharArray();
        char[] ArrayCityThree = ArrayXCityThree[2].toCharArray();
        char[] ArrayCityFour = ArrayXCityFour[3].toCharArray();
        char[] ArrayCityFive = ArrayXCityFive[4].toCharArray();
        char[] ArrayCitySix = ArrayXCitySix[5].toCharArray();

        // Print all cities and "reverse mode".

        System.out.print("First city: [ ");

        for(int e = 0; e < ArrayCityOne.length; e++) {
            System.out.print(ArrayCityOne[e]);
            if (e < ArrayCityOne.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print(" ], ");
        System.out.print("and reversed name: [ ");

        for(int i = ArrayCityOne.length - 1; i >= 0; i--){
            System.out.print(ArrayCityOne[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");
        System.out.println();

        System.out.print("Next city: [ ");

        for(int e = 0; e < ArrayCityTwo.length; e++) {
            System.out.print(ArrayCityTwo[e]);
            if (e < ArrayCityTwo.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print(" ], ");
        System.out.print("and reversed name: [ ");

        for(int i = ArrayCityTwo.length - 1; i >= 0; i--){
            System.out.print(ArrayCityTwo[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");
        System.out.println();

        System.out.print("Next city: [ ");

        for(int e = 0; e < ArrayCityThree.length; e++) {
            System.out.print(ArrayCityThree[e]);
            if (e < ArrayCityThree.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print(" ], ");
        System.out.print("and reversed name: [ ");

        for(int i = ArrayCityThree.length - 1; i >= 0; i--){
            System.out.print(ArrayCityThree[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");
        System.out.println();

        System.out.print("Next city: [ ");

        for(int e = 0; e < ArrayCityFour.length; e++) {
            System.out.print(ArrayCityFour[e]);
            if (e < ArrayCityFour.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print(" ], ");
        System.out.print("and reversed name: [ ");

        for(int i = ArrayCityFour.length - 1; i >= 0; i--){
            System.out.print(ArrayCityFour[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");
        System.out.println();

        System.out.print("Next city: [ ");

        for(int e = 0; e < ArrayCityFive.length; e++) {
            System.out.print(ArrayCityFive[e]);
            if (e < ArrayCityFive.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print(" ], ");
        System.out.print("and reversed name: [ ");

        for(int i = ArrayCityFive.length - 1; i >= 0; i--){
            System.out.print(ArrayCityFive[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");
        System.out.println();

        System.out.print("Last city: [ ");

        for(int e = 0; e < ArrayCitySix.length; e++) {
            System.out.print(ArrayCitySix[e]);
            if (e < ArrayCitySix.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print(" ], ");
        System.out.print("and reversed name: [ ");

        for(int i = ArrayCitySix.length - 1; i >= 0; i--){
            System.out.print(ArrayCitySix[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");
        System.out.println();

        // END FASE 4

    }
}
