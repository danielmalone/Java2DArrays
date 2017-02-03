package com.finepointmobile;

public class Solution {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }

//        int arr[][] = {
//                {1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}
//        };

        int arr[][] = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}

        };
        Integer[][] numbers = convertToInteger(arr);
        Integer highest = -100;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Integer thisTotal = findHourGlass(numbers, i, j);
                if (thisTotal > highest) {
                    highest = thisTotal;
                }
            }
        }
        System.out.println(highest);
    }

    private static Integer findHourGlass(Integer[][] numbers, Integer i, Integer j) {
        Integer thisTotal = numbers[i][j] +
                numbers[i][j + 1] +
                numbers[i][j + 2] +
                numbers[i + 1][j + 1] +
                numbers[i + 2][j] +
                numbers[i + 2][j + 1] +
                numbers[i + 2][j + 2];
        System.out.println(thisTotal);
        return thisTotal;
    }

    private static Integer[][] convertToInteger(int[][] arr) {
        Integer[][] newIntegers = new Integer[6][6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newIntegers[i][j] = Integer.valueOf(arr[i][j]);
            }
        }
        return newIntegers;
    }
}
