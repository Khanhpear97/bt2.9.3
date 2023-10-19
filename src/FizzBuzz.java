public class FizzBuzz {
    public static String checkFizzBuzz(int number) {
        String string = "";
        if (number > 100) {
            return "Data number not exactly";
        }
        boolean isFizzBuzz = number % 3 == 0 && number % 5 == 0;
        if (isFizzBuzz) {
            string = "FizzBuzz";
        } else {
            boolean isFizz = number % 3 == 0;
            if (isFizz) {
                string = "Fizz";
            } else {
                boolean isBuzz = number % 5 == 0;
                if (isBuzz) {
                    string = "Buzz";
                } else if (Integer.toString(number).contains("3")) {
                    string = "Fizz";
                } else if (Integer.toString(number).contains("5")) {
                    string = "Buzz";
                } else {
                    string += fizzBuzzTranslate(number);
                }
            }
        }
        return string;
    }
    public static String fizzBuzzTranslate(int number) {
        String string = "";
        int numberLength = Integer.toString(number).length();

        switch (numberLength) {
            case 1:
                string += readOne(Integer.toString(number));
                break;
            case 2:
                string += readTwo(Integer.toString(number));
                break;
        }
        return string;
    }
    public static String readOne(String number) {
        String string = "";
        switch (number) {
            case "0":
                string = "Khong";
                break;
            case "1":
                string = "Mot";
                break;
            case "2":
                string = "Hai";
                break;
            case "3":
                string = "Ba";
                break;
            case "4":
                string = "Bon";
                break;
            case "5":
                string = "Nam";
                break;
            case "6":
                string = "Sau";
                break;
            case "7":
                string = "Bay";
                break;
            case "8":
                string = "Tam";
                break;
            case "9":
                string = "Chin";
                break;
        }
        return string;
    }

    public static String readTwo(String number) {
        String string = "";
        int valueNumber = Integer.parseInt(number);
        int numberDozens = valueNumber / 10;
        int numberOneDigit = valueNumber % 10;
        switch (numberDozens) {
            case 1:
                string = "Muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 2:
                string = "Hai muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 3:
                string = "Ba muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 4:
                string = "Bon muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 5:
                string = "Nam muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 6:
                string = "Sau muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 7:
                string = "Bay muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 8:
                string = "Tam muoi " + readOne(Integer.toString(numberOneDigit));
                break;
            case 9:
                string = "Chin muoi " + readOne(Integer.toString(numberOneDigit));
                break;
        }
        return string;
    }
}
