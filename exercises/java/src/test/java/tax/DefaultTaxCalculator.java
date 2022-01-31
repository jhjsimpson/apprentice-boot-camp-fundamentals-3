package tax;

import static tax.FuelType.DIESEL;
import static tax.FuelType.PETROL;

public class DefaultTaxCalculator extends TaxCalculator {

    public int calculateTax(Vehicle vehicle) {
        int emissions = vehicle.getCo2Emissions();

        if (vehicle.getFuelType() == FuelType.ALTERNATIVE_FUEL) {
            if (emissions <= 50) {
                return 0;
            } else if (emissions <= 75) {
                return 15;
            } else if (emissions <= 90) {
                return 95;
            } else if (emissions <= 100) {
                return 115;
            } else if (emissions <= 110) {
                return 135;
            } else if (emissions <= 130) {
                return 155;
            } else if (emissions <= 150) {
                return 195;
            } else if (emissions <= 170) {
                return 505;
            } else if (emissions <= 190) {
                return 820;
            } else if (emissions <= 225) {
                return 1230;
            } else if (emissions <= 255) {
                return 1750;
            }
            return 2060;
        }

        if (vehicle.getFuelType() == PETROL) {

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

        if (vehicle.getFuelType() == DIESEL) {

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
