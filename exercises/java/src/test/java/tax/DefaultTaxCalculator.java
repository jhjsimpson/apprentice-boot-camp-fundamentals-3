package tax;

import static tax.FuelType.DIESEL;
import static tax.FuelType.PETROL;

public class DefaultTaxCalculator extends TaxCalculator {

    public int calculateTax(Vehicle vehicle) {

        if(vehicle.getFuelType() == PETROL) {

            int emissions = vehicle.getCo2Emissions();
            if (emissions >= 1 && emissions <= 50) {
                return 10;
            }
            if (emissions >= 51 && emissions <= 75) {
                return 25;
            }
            if (emissions >= 76 && emissions <= 90) {
                return 105;
            }
            if (emissions >= 91 && emissions <= 100) {
                return 125;
            }
            if (emissions >= 101 && emissions <= 110) {
                return 145;
            }
            if (emissions >= 111 && emissions <= 130) {
                return 165;
            }
            if (emissions >= 131 && emissions <= 150) {
                return 205;
            }
            if (emissions >= 151 && emissions <= 170) {
                return 515;
            }
            if (emissions >= 171 && emissions <= 190) {
                return 830;
            }
            if (emissions >= 191 && emissions <= 225) {
                return 1240;
            }
            if (emissions >= 226 && emissions <= 255) {
                return 1760;
            }
            if (emissions > 255) {
                return 2070;
            }
        }

        if(vehicle.getFuelType() == DIESEL) {

            int emissions = vehicle.getCo2Emissions();
            if (emissions >= 1 && emissions <= 50) {
                return 25;
            }
            if (emissions >= 51 && emissions <= 75) {
                return 105;
            }
            if (emissions >= 76 && emissions <= 90) {
                return 125;
            }
            if (emissions >= 91 && emissions <= 100) {
                return 145;
            }
            if (emissions >= 101 && emissions <= 110) {
                return 165;
            }
            if (emissions >= 111 && emissions <= 130) {
                return 205;
            }
            if (emissions >= 131 && emissions <= 150) {
                return 515;
            }
            if (emissions >= 151 && emissions <= 170) {
                return 830;
            }
            if (emissions >= 171 && emissions <= 190) {
                return 1240;
            }
            if (emissions >= 191 && emissions <= 225) {
                return 1760;
            }
            if (emissions >= 226 && emissions <= 255) {
                return 2070;
            }
            if (emissions > 255) {
                return 2070;
            }
        }

    return 0;
    }
}
