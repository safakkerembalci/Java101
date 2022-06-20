package Conditionals;

import java.util.Scanner;

public class Horoscope2 {
    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("enter month of birth: ");
        month = input.nextInt();

        System.out.print("enter day of birth: ");
        day = input.nextInt();

        switch (month){

            case(1):
                if((day<=31) &&(day>=1)){
                    if(day<20){
                        horoscope = "capricorn";
                    }else {
                        horoscope = "aquarius";
                    }
                }else {
                    isError = true;
                }
                break;

            case(2):
                if((day<=29) &&(day>=1)){
                    if(day<19){
                        horoscope = "aquarius";
                    }else {
                        horoscope = "pisces";
                    }
                }else {
                    isError = true;
                }
                break;

            case(3):
                if((day<=31) &&(day>=1)){
                    if(day<21){
                        horoscope = "pisces";
                    }else {
                        horoscope = "aries";
                    }
                }else {
                    isError = true;
                }
                break;

            case(4):
                if((day<=30) &&(day>=1)){
                    if(day<20){
                        horoscope = "aries";
                    }else {
                        horoscope = "taurus";
                    }
                }else {
                    isError = true;
                }
                break;

            case(5):
                if((day<=31) &&(day>=1)){
                    if(day<21){
                        horoscope = "taurus";
                    }else {
                        horoscope = "gemini";
                    }
                }else {
                    isError = true;
                }
                break;

            case(6):
                if((day<=30) &&(day>=1)){
                    if(day<22){
                        horoscope = "gemini";
                    }else {
                        horoscope = "cancer";
                    }
                }else {
                    isError = true;
                }
                break;

            case(7):
                if((day<=31) &&(day>=1)){
                    if(day<23){
                        horoscope = "cancer";
                    }else {
                        horoscope = "leo";
                    }
                }else {
                    isError = true;
                }
                break;

            case(8):
                if((day<=31) &&(day>=1)){
                    if(day<23){
                        horoscope = "leo";
                    }else {
                        horoscope = "virgo";
                    }
                }else {
                    isError = true;
                }
                break;

            case(9):
                if((day<=30) &&(day>=1)){
                    if(day<23){
                        horoscope = "virgo";
                    }else {
                        horoscope = "libra";
                    }
                }else {
                    isError = true;
                }
                break;

            case(10):
                if((day<=31) &&(day>=1)){
                    if(day<23){
                        horoscope = "libra";
                    }else {
                        horoscope = "scorpio";
                    }
                }else {
                    isError = true;
                }
                break;

            case(11):
                if((day<=30) &&(day>=1)){
                    if(day<22){
                        horoscope = "scorpio";
                    }else {
                        horoscope = "sagittarius";
                    }
                }else {
                    isError = true;
                }
                break;

            case(12):
                if((day<=31) &&(day>=1)){
                    if(day<22){
                        horoscope = "sagittarius";
                    }else {
                        horoscope = "capricorn";
                    }
                }else {
                    isError = true;
                }
                break;

        }
        if(isError){
            System.out.println("entered incorrectly, please try again");
        }else {
            System.out.println("your zodiac sign: " + horoscope);
        }

    }
}
