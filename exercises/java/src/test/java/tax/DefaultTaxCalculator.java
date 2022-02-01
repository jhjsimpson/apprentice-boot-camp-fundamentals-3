package tax;

import java.time.LocalDate;
import java.util.Calendar;

public class DefaultTaxCalculator extends TaxCalculator {

    private FeatureToggle featureToggle;

    public DefaultTaxCalculator(){this.featureToggle = new FeatureToggle();}

    public DefaultTaxCalculator(FeatureToggle featureToggle) {

        this.featureToggle = featureToggle;
    }

    public int calculateTax(Vehicle vehicle) {
        int emissions = vehicle.getCo2Emissions();

        if (featureToggle.storyFourFeatureToggle()) {
            if (vehicle.getDateOfFirstRegistration().getYear() < 2019) {
                if (vehicle.getFuelType() == FuelType.PETROL || vehicle.getFuelType() == FuelType.DIESEL) {
                    return 140;
                }
                if (vehicle.getFuelType() == FuelType.ELECTRIC) {
                    return 0;
                }
                if (vehicle.getFuelType() == FuelType.ALTERNATIVE_FUEL) {
                    return 130;
                }
            }
        }

        if (featureToggle.storyFiveFeatureToggle()) {
            if (vehicle.getListPrice() > 40_000) {
                if (vehicle.getFuelType() == FuelType.PETROL) {
                    return 450;
                }
                if (vehicle.getFuelType() == FuelType.ALTERNATIVE_FUEL) {
                    return 440;
                }
                if (vehicle.getFuelType() == FuelType.ELECTRIC) {
                    return 310;
                }
            }
        }

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

        if (vehicle.getFuelType() == FuelType.PETROL) {

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

        if (vehicle.getFuelType() == FuelType.DIESEL) {

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
