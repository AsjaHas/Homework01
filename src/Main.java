public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Homework 01 \n");

        // 5.Deklarisati varijable za: Ime i prezime, prvo slovo imena, godina rodjenja, broj 100 000 000 000, broj 42.001

        /*
        String firstName = "John";
        String lastName = "Doe";
        char firstLetterOfName = firstName.charAt(0);
        System.out.println("First letter of first name is :" + firstLetterOfName);
        int birthYear = 1993;
        long trillion = 100_000_000_000L;
        double decimalNumber = 42.001;
         */


        // 6.Isprintate vase ime koristeci samo brojeve  koji se pretvore u char-ove.

        int asciiValueUpperA = 65;
        int asciiValueLowerS = 115;
        int asciiValueLowerJ = 106;
        int asciiValueLowerA = 97;
        String ConvertedAsciiValueUpperA = new Character((char) asciiValueUpperA).toString();
        String ConvertedAsciiValueLowerS = new Character((char) asciiValueLowerS).toString();
        String ConvertedAsciiValueLowerJ = new Character((char) asciiValueLowerJ).toString();
        String ConvertedAsciiValueLowerA = new Character((char) asciiValueLowerA).toString();
        System.out.println(ConvertedAsciiValueUpperA + ConvertedAsciiValueLowerS + ConvertedAsciiValueLowerJ + ConvertedAsciiValueLowerA + "\n");


        // 7. napravite vaijablu koju kad ispisete ispise tekst:
        //Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: true

        String answerToQuestionOfLife = "Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42:";
        boolean answerIs42 = true;
        System.out.println(answerToQuestionOfLife + answerIs42 + "\n");


        /*
        8. Zelim da mi napisete program koji ce poceti sa tekstom: This is a number xxx and it is about to double;
        I zatim 8 puta da se udupla njegova vrijednost i svaki put da se isti tekst ispise sa uduplanim brojem.
        Prvi put kad se ispise broj mora biti izvorno upisani broj.
        xxx je neki broj koji mogu ja sam da dodam a da se ne narusi logika.
         */
        int numberToDouble = 1;
        int timesDoubled = 1;
        int multiplier = 2;
        String timesDoubledChar = "X";
        System.out.println("This is a number " + numberToDouble + " and it is about to double  \n");

        numberToDouble = numberToDouble * multiplier;
        System.out.println("This is a number " + numberToDouble + " and it is about to double");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");

        numberToDouble = numberToDouble * multiplier;
        timesDoubled += 1;
        System.out.println("This is a number " + numberToDouble + " and it is about to double");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");

        numberToDouble = numberToDouble * multiplier;
        timesDoubled += 1;
        System.out.println("This is a number " + numberToDouble + " and it is about to double");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");

        numberToDouble = numberToDouble * multiplier;
        timesDoubled += 1;
        System.out.println("This is a number " + numberToDouble + " and it is about to double");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");

        numberToDouble = numberToDouble * multiplier;
        timesDoubled += 1;
        System.out.println("This is a number " + numberToDouble + " and it is about to double");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");

        numberToDouble = numberToDouble * multiplier;
        timesDoubled += 1;
        System.out.println("This is a number " + numberToDouble + " and it is about to double");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");

        numberToDouble = numberToDouble * multiplier;
        timesDoubled += 1;
        System.out.println("This is a number " + numberToDouble + " and it is about to double");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");

        numberToDouble = numberToDouble * multiplier;
        timesDoubled += 1;
        System.out.println("This is a number " + numberToDouble + ", doubling done");
        System.out.println("The original number has been doubled " + timesDoubledChar.repeat(timesDoubled) + " times" + " (Total of: " + timesDoubled + " times). \n");


    }


}