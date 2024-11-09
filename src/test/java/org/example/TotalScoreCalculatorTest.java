package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TotalScoreCalculatorTest {
    @Test
   public void additionTest1() {
        Main test = new Main();
        assertEquals(4,test.addition(2,2));
    }

    @Test
   public void additionTest2() {
        Main test = new Main();
        assertEquals(6, test.addition(3, 3));
    }

    @Test

   public void additionTest3() {
        Main test = new Main();
        assertEquals(0, test.addition(-3, 3));
    }

    //@Nested
    //public class GradeCalculatorTest {
        @Test
        public void gradeCalculatorTest1() {
            Main test = new Main();
            assertEquals('A', test.gradeDeterminer(90));
        }

        /*@Test
        public void gradeCalculatorTest2() {
            Main test = new Main();
            assertEquals('A', test.gradeDeterminer(100));
        }*/

        @Test
        public void gradeCalculatorTest2(){
            var test = new Main();
            assertEquals('B',test.gradeDeterminer(80));
        }

        /*@Test
        public void gradeCalculatorTest4(){
            var test = new Main();
            assertEquals('B',test.gradeDeterminer(89));
        }*/

        @Test
        public void gradeCalculatorTest3(){
            var test = new Main();
            assertEquals('C',test.gradeDeterminer(70));

        }

        /*@Test
        public void gradeCalculatorTest6(){
            var test = new Main();
            assertEquals('C',test.gradeDeterminer(79));

        }*/

        @Test
        public void gradeCalculatorTest4(){
            var test = new Main();
            assertEquals('D',test.gradeDeterminer(60));
        }

        /*@Test
        public void gradeCalculatorTest8(){
            var test = new Main();
            assertEquals('D',test.gradeDeterminer(69));
        }*/

        @Test
        public void gradeCalculatorTest5(){
            var test = new Main();
            assertEquals('E',test.gradeDeterminer(50));
        }

        /*@Test
        public void gradeCalculatorTest10(){
            var test = new Main();
            assertEquals('E',test.gradeDeterminer(59));
        }*/

        @Test
        public void gradeCalculatorTest6(){
            var test = new Main();
            assertEquals('F',test.gradeDeterminer(49));
        }

        @Test
        public void gradeCalculatorTest7(){
            var test = new Main();
            assertEquals('F',test.gradeDeterminer(0));
        }

        @Test(expected = IllegalArgumentException.class)
        public void gradeCalculatorTest8(){
        var test = new Main();
        test.gradeDeterminer(-10);
        }

        @Test(expected = IllegalArgumentException.class)
        public void gradeCalculatorTest9() {
            var test = new Main();
            test.gradeDeterminer(101);
        }
    //}
}