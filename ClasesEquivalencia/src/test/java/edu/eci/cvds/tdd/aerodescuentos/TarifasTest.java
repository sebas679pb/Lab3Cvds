package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;

import org.junit.Test;

public class TarifasTest {

    /**
     * Descuento billete con antelacion mayor a 20 dias.
     */
    @Test
    public void validateCaseOne() {
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100000,21,25);
        Assert.assertEquals(result, 85000,0);
    }

    /**
     * Descuento pasajero con edad inferior a 18 años.
     */
    @Test
    public void validateCaseTwo() {
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100000,15,17);
        Assert.assertEquals(result, 95000,0);
    }

    /**
     * Descuento pasajero con edad superior a 65 años.
     */
    @Test
    public void validateCaseThree() {
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100000,19,70);
        Assert.assertEquals(result, 92000,0);
    }

    /**
     * Descuento billete con antelacion mayor a 20 dias y pasajero con edad inferior a 18 años.
     */
    @Test
    public void validateCaseFour() {
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100000,30,17);
        Assert.assertEquals(result, 80000,0);
    }

    /**
     * Descuento billete con antelacion mayor a 20 dias y pasajero con edad superior a 65 años.
     */
    @Test
    public void validateCaseFive() {
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(100000,27,75);
        Assert.assertEquals(result, 77000,0);
    }
    
}
