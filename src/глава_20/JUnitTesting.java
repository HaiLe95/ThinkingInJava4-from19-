package глава_20;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Хай Ле on 30.09.2017.
 */

public class JUnitTesting {

    class Car {

        private String model;
        String mark;
        int serialNumber;

        public Car (String model, String mark, int serialNumber) {
            this.model = model;
            this.mark = mark;
            this.serialNumber = serialNumber;
        }

        public String info() {
            return model+mark+serialNumber;
        }

        public boolean equals(Car car) {
            if (this.info().equals(car.info())) {
                return true;
            } else {
            return false;
            }
        }

        public String toString() {
            return model + " " + mark + " " + serialNumber;
        }

    }

    @Test
    public void test() {
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void testBoolean() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testEquals() {

        Car carFirst = new Car("opel", "one", 2441);
        Car carSecond = new Car("opel", "one", 2441);

        Assert.assertEquals(true, carFirst.equals(carSecond));
    }

}
