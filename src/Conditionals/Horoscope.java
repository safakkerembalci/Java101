package Conditionals;

import java.util.Scanner;

public class Horoscope {

    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("enter month of birth: ");
        month = input.nextInt();

        System.out.print("enter day of birth: ");
        day = input.nextInt();

        if (month == 1) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 20) {
                    horoscope = "capricorn";
                } else {
                    horoscope = "aquarius";
                }
            } else {
                isError = true;
            }

        }else if (month == 2) {
            if ((day <= 29) && (day >= 1)) {
                if (day < 19) {
                    horoscope = "aquarius";
                } else {
                    horoscope = "pisces";
                }
            } else {
                isError = true;
            }

        } else if (month == 3) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 21) {
                    horoscope = "pisces";
                } else {
                    horoscope = "aries";
                }
            } else {
                isError = true;
            }

        } else if (month == 4) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 20) {
                    horoscope = "aries";
                } else {
                    horoscope = "taurus";
                }
            } else {
                isError = true;
            }

        } else if (month == 5) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 21) {
                    horoscope = "taurus";
                } else {
                    horoscope = "gemini";
                }
            } else {
                isError = true;
            }

        } else if (month == 6) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "gemini";
                } else {
                    horoscope = "cancer";
                }
            } else {
                isError = true;
            }

        } else if (month == 7) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "cancer";
                } else {
                    horoscope = "leo";
                }
            } else {
                isError = true;
            }

        } else if (month == 8) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "leo";
                } else {
                    horoscope = "virgo";
                }
            } else {
                isError = true;
            }

        } else if (month == 9) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "virgo";
                } else {
                    horoscope = "libra";
                }
            } else {
                isError = true;
            }

        } else if (month == 10) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 23) {
                    horoscope = "libra";
                } else {
                    horoscope = "scorpio";
                }
            } else {
                isError = true;
            }

        } else if (month == 11) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "scorpio";
                } else {
                    horoscope = "sagittarius";
                }
            } else {
                isError = true;
            }

        } else if (month == 12) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                    horoscope = "sagittarius";
                } else {
                    horoscope = "capricorn";
                }
            } else {
                isError = true;
            }

        }
        if(isError){
            System.out.println("entered incorrectly, please try again");
        }else {
            System.out.println("your zodiac sign: " + horoscope);
        }

    }
}
