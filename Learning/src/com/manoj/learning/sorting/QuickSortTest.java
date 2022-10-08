package com.manoj.learning.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class QuickSortTest {

    @Test
    @DisplayName("Case:1")
    void case1() {
        int[] inp= {5,4,3,2,1};
        int[] exp= {1,2,3,4,5};
//        assertEquals(exp,QuickSort.quickSort(inp,0,4));
        assertArrayEquals(exp,QuickSort.quickSort(inp,0,4));
    }

    @Test
    @DisplayName("Case:2")
    void case2() {
        int[] inp= {1111,25,54,33,22};
        int[] exp= {22,25,33,54,1111};
//        assertEquals(exp,QuickSort.quickSort(inp,0,4));
        assertArrayEquals(exp,QuickSort.quickSort(inp,0,4));
    }
    @Test
    @DisplayName("Case:3")
    void case3() {
        int[] inp= {9,8,7,6,5,4,3,2,1};
        int[] exp= {1,	2,	3,	4,	5,	6,	7,	8,	9	};
//        assertEquals(exp,QuickSort.quickSort(inp,0,4));
        assertArrayEquals(exp,QuickSort.quickSort(inp,0,4));
    }
}