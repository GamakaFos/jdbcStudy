import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TDDCircleAreaTest {

    //two tests with radius
    @Test
    void radiusMeasureWithValueOf15Test(){
        TDDCircleArea tddCircleArea = new TDDCircleArea();
        tddCircleArea.setRadius(15);
        double actual = tddCircleArea.measureRadius();
        double expected =  706.8583470577034;
        assertEquals(expected, actual, "Trying to test .measureRadius() with value of 15");
    }

    @Test
    void radiusMeasureWithValueOf23Test(){
        TDDCircleArea tddCircleArea = new TDDCircleArea();
        tddCircleArea.setRadius(23);
        double actual = tddCircleArea.measureRadius();
        double expected =  1661.9025137490005;
        assertEquals(expected, actual, "Trying to test .measureRadius() with value of 23");
    }

    //two tests with diameter
    @Test
    void diameterMeasureWithValueOf7Test(){
        TDDCircleArea tddCircleArea = new TDDCircleArea();
        tddCircleArea.setDiameter(7);
        double actual = tddCircleArea.measureDiameter();
        double expected = 38.48451000647496;
        assertEquals(expected, actual, "Trying to test .measureDiameter() with value of 7");
    }

    @Test
    void diameterMeasureWithValueOf21Test(){
        TDDCircleArea tddCircleArea = new TDDCircleArea();
        tddCircleArea.setDiameter(21);
        double actual = tddCircleArea.measureDiameter();
        double expected = 346.3605900582747;
        assertEquals(expected, actual, "Trying to test .measureDiameter() with value of 21");
    }

    //two tests with perimeter
    @Test
    void perimeterMeasureWithValueOf40Test(){
        TDDCircleArea tddCircleArea = new TDDCircleArea();
        tddCircleArea.setPerimeter(40);
        double actual = tddCircleArea.measurePerimeter();
        double expected = 127.32395447351627;
        assertEquals(expected, actual, "Trying to test .measurePerimeter() with value of 40");
    }

    @Test
    void perimeterMeasureWithValueOf70Test(){
        TDDCircleArea tddCircleArea = new TDDCircleArea();
        tddCircleArea.setPerimeter(70);
        double actual = tddCircleArea.measurePerimeter();
        double expected = 389.9296105751436;
        assertEquals(expected, actual, "Trying to test .measurePerimeter() with value of 40");
    }

}