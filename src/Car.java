public class Car {
    int age = 3;
    int power = 155;
    int turbo = 45;

    int getAge() {
        return age;
    }

    int calculateIndex() {
        return power * 10 + turbo;
    }

    int uogradePower(int newPower) {
        power  = power + newPower;
        return power;
    }

}
