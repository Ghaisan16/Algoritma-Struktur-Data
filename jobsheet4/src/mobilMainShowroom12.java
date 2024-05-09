public class mobilMainShowroom12 {
    public static int maxAcceleration(mobil12[] cars, int left, int right) {
        if (left == right)
            return cars[left].topAcceleration;

        int mid = (left + right) / 2;

        int maxLeft = maxAcceleration(cars, left, mid);
        int maxRight = maxAcceleration(cars, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    public static int minAcceleration(mobil12[] cars, int left, int right) {
        if (left == right)
            return cars[left].topAcceleration;

        int mid = (left + right) / 2;

        int minLeft = minAcceleration(cars, left, mid);
        int minRight = minAcceleration(cars, mid + 1, right);

        return Math.min(minLeft, minRight);
    }

    public static double averageTopPower(mobil12[] cars) {
        int sum = 0;
        for (mobil12 car : cars) {
            sum += car.topPower;
        }
        return (double) sum / cars.length;
    }


   public static void main(String[] args) {
    mobil12[] cars = {
        new mobil12("BMW", "M2 Coupe", 2016, 6816, 728),
        new mobil12("Ford", "Fiesta ST", 2014, 3921, 575),
        new mobil12("Nissan", "370Z", 2009, 4360, 657),
        new mobil12("Subaru", "BRZ", 2014, 4058, 609),
        new mobil12("Subaru", "Impreza WRX STI", 2013, 6255, 703),
        new mobil12("Toyota", "AE86 Trueno", 1986, 3700, 553),
        new mobil12("Toyota", "86/GT86", 2014, 4180, 609),
        new mobil12("Volkswagen", "Golf GTI", 2014, 4180, 631)
    };

    System.out.println("Data Mobil Showroom:");
    System.out.println("================================");
    for(mobil12 car : cars){
        System.out.println(car);
    }
    System.out.println("================================");

    int maxAcc = maxAcceleration(cars, 0, cars.length - 1);
    int minAcc = minAcceleration(cars, 0, cars.length - 1);
    double avgTopPower = averageTopPower(cars);

    System.out.println("Top Acceleration Tertinggi: " + maxAcc);
    System.out.println("Top Acceleration Terendah: " + minAcc);
    System.out.println("Rata - rata Top Power: " + avgTopPower);
   }
}
