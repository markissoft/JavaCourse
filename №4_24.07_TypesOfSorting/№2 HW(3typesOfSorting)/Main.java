package com.company;

import java.util.Arrays;

public class Main {

    public static class Sort{

        void swap(int[] ptr, int index1, int index2) {
            int temp= ptr[index1];
            ptr[index1] = ptr[index2];
            ptr[index2] = temp;
        }

        int minIndex(int[] ptr, int x1, int x2) {
            int minIndex = ptr[x1], retIndex = x1;

            for (int currentIndex = x1; currentIndex <= x2; currentIndex++) {
                if (minIndex > ptr[currentIndex]) {
                    minIndex = ptr[currentIndex];
                    retIndex = currentIndex;
                }
            }
            return retIndex;
        }

        int[] sortBubble(int[] ptr, int x1, int x2) {
            for (int startIndex = x1; startIndex <= x2; startIndex++) {

                int smallestIndex = startIndex;

                for (int currentIndex = startIndex; currentIndex <= x2; currentIndex++) {
                    if (ptr[currentIndex] < ptr[smallestIndex])
                        smallestIndex = currentIndex;
                }
                swap(ptr, smallestIndex, startIndex);
            }
            return ptr;
        }

        int[] sortInsertion(int[] ptr, int x1, int x2) {
            int cycle1Index, cycle2Index;

            for (cycle1Index = x1; cycle1Index <= x2; cycle1Index++) {
                int x = ptr[cycle1Index];

                for (cycle2Index = cycle1Index - 1; cycle2Index >= /*0*/x1 && ptr[cycle2Index] > x; cycle2Index--)
                    ptr[cycle2Index + 1] = ptr[cycle2Index];

                ptr[cycle2Index + 1] = x;
            }
            return ptr;
        }

        int[] sortSelection(int[] ptr, int x1, int x2) {
            for (int currentIndex = x1; currentIndex <= x2; currentIndex++) {

                int minIndx = minIndex(ptr, currentIndex, x2);
                int currentValue = ptr[currentIndex];

                ptr[currentIndex] = ptr[minIndx];
                ptr[minIndx] = currentValue;
            }
            return ptr;
        }
    }

    public static void main(String[] args) {
        int[] ptr = {9,8,7,6,5,4,3,2,1,0};

        Sort sort = new Sort();
        System.out.println(Arrays.toString(sort.sortBubble(ptr, 0, 9)));
        System.out.println(Arrays.toString(sort.sortInsertion(ptr, 0, 9)));
        System.out.println(Arrays.toString(sort.sortSelection(ptr, 0, 9)));
    }
}
