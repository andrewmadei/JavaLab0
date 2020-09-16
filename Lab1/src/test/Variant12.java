package test;

import Lab0.Main;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant12 {

    @Test(dataProvider = "integerCheck")
    public void integerTest(int p1, int p2) {
        assertEquals(Main.integer(p1), p2);
    }

    @DataProvider
    public Object[][] integerCheck() {
        return new Object[][]{{201, 102}, {931, 139}};
    }

    ///////////////////////////////////////////////////////

    @Test(dataProvider = "booleanCheck")
    public void booleanTest(int p1, int p2, int p3, boolean b1) {
        assertEquals(Main.booleanMethod(p1,p2,p3), b1);//!!!!
    }

    @DataProvider
    public Object[][] booleanCheck() {
        return new Object[][]{{1,2,3,true}, {1,2,-3, false}};
    }

    ///////////////////////////////////////////////////////

    @Test(dataProvider = "ifCheck")
    public void ifTest(int p1, int p2, int p3, int p4) {
        assertEquals(Main.ifMethod(p1,p2,p3), p4);
    }

    @DataProvider
    public Object[][] ifCheck() {
        return new Object[][]{{1,2,3,1}, {9,8,7, 7}};
    }

    /////////////////////////////////////////////////////

    @Test(dataProvider = "forCheck")
    public void forTest(int p1, int p2) {
        assertEquals(Main.forMethod(p1), p2);
    }

    @DataProvider
    public Object[][] forCheck() {
        return new Object[][]{{5,120}, {10, 3628800}};
    }

    /////////////////////////////////////////////////////
    int a1[] = {4,10};
    int a2[] = {5,15};
    @Test(dataProvider = "whileCheck")
    public void whileTest(int p1, int [] ar1) {
        assertEquals(Main.whileMethod(p1), ar1);
    }

    @DataProvider
    public Object[][] whileCheck() {
        return new Object[][]{{10,a1}, {16, a2}};
    }

    /////////////////////////////////////////////////////
    float f1[] = {1.0f,2f,6.28f,3.14f};
    float f2[] = {0.5643326f,1.1286652f,3.544009f,1f};
    @Test(dataProvider = "caseCheck")
    public void caseTest(int p1, float p2, float [] ar1) {
        assertEquals(Main.caseMethod(p1,p2), ar1);
    }

    @DataProvider
    public Object[][] caseCheck() {
        return new Object[][]{{1,1f,f1}, {4,1f, f2}};
    }

    /////////////////////////////////////////////////////
    int a3[] = {1,2};
    int a4[] = {0,-5};
    @Test(dataProvider = "minmaxCheck")
    public void minmaxTest(int[] mas, int p1, int p2) {
        assertEquals(Main.minmaxMethod(p1,mas), p2);
    }

    @DataProvider
    public Object[][] minmaxCheck() {
        return new Object[][]{{a3,2,2}, {a4,2,0}};
    }

    //////////////////////////////////////////////////////

    int a5[] = {1,2,3,4,5,6};
    int a51[] = {2,4,6};
    int a6[] = {1,2,3,4,5,6,7,8,9};
    int a61[] = {2,4,6,8};
    @Test(dataProvider = "arrayCheck")
    public void arrayTest(int[] mas, int [] arr) {
        assertEquals(Main.arrayMethod(mas), arr);
    }

    @DataProvider
    public Object[][] arrayCheck() {
        return new Object[][]{{a5,a51}, {a6,a61}};
    }

    //////////////////////////////////////////////////////

    int c1[][] = {{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
    int c2[][] = {{1,2,3},{5,4,3},{5,6,7},{9,8,7}};
    int c3[][] = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
    int c4[][] = {{1,2,3},{4,3,2},{3,4,5},{6,5,4}};
    @Test(dataProvider = "matrixCheck")
    public void matrixTest(int nn, int mm, int[][] mas, int[][] check) {
        int ch[][] = Main.matrixMethod(nn,mm,mas);
        for (int i = 0;i<nn;i++){
            assertEquals(ch[i],check[i]);
        }
    }

    @DataProvider
    public Object[][] matrixCheck() {
        return new Object[][]{{4,3,c1,c2}, {4,3,c3,c4}};
    }

}
