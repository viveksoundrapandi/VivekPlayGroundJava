import org.junit.*;

import static org.junit.Assert.*;

public class TestComparator {
    @Test
    public void ShouldReturnTrueWhenBothTheInputsAreEqualInInch(){
        boolean expected = true;
        Metric metric = new Metric();
        metric.createInch(1.0);
        Metric secondMetric = new Metric();
        secondMetric.createInch(1.0);
        boolean result = InchComparator.compare(metric, secondMetric);
        assertEquals(expected,result);
    }

    @Test
    public void ShouldReturnFalseWhenBothTheInputsAreNotEqual(){
        boolean expected = false;
        Metric metric = new Metric();
        metric.createInch(1.0);
        Metric secondMetric = new Metric();
        secondMetric.createInch(2.0);
        boolean result = InchComparator.compare(metric, secondMetric);
        assertEquals(expected,result);
    }
    @Test
    public void ShouldReturnTrueWhenBothTheInputsAreEqualInFeet(){
        boolean expected = true;
        Metric metric = new Metric();
        metric.createFeet(1.0);
        Metric secondMetric = new Metric();
        secondMetric.createFeet(1.0);
        boolean result = InchComparator.compare(metric, secondMetric);
        assertEquals(expected,result);
    }

    @Test
    public void ShouldReturnFalseWhenBothTheInputsAreNotEqualInFeet(){
        boolean expected = false;
        Metric metric = new Metric();
        metric.createFeet(1.0);
        Metric secondMetric = new Metric();
        secondMetric.createFeet(2.0);
        boolean result = InchComparator.compare(metric, secondMetric);
        assertEquals(expected,result);
    }

    @Test
    public void ShouldReturnTrueWhenBothAreEqualInValuesButOneInInchAndOtherInFeet(){
        boolean expected = true;
        Metric metric = new Metric();
        metric.createInch(12.0);
        Metric secondMetric = new Metric();
        secondMetric.createFeet(1.0);
        boolean result = InchComparator.compare(metric, secondMetric);
        assertEquals(expected,result);
    }

    @Test
    public void ShouldReturnTrueWhenBothAreEqualInValuesButOneInFeetAndOtherInInch(){
        boolean expected = true;
        Metric metric = new Metric();
        metric.createFeet(1.0);
        Metric secondMetric = new Metric();
        secondMetric.createInch(12.0);
        boolean result = InchComparator.compare(metric, secondMetric);
        assertEquals(expected,result);
    }

    @Test
    public void ShouldReturnTrueWhenBothAreNotEqualInValuesButOneInInchAndOtherInFeet(){
        boolean expected = false;
        Metric metric = new Metric();
        metric.createInch(13.0);
        Metric secondMetric = new Metric();
        secondMetric.createFeet(1.0);
        boolean result = InchComparator.compare(metric, secondMetric);
        assertEquals(expected,result);
    }






}
