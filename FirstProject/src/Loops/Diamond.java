package Loops;

public class Diamond {
    public static void main(String[] args) {

        int nr = 4, j, k, i, counterOfStars = 1, counterOfSpaces = 3;
        int spaceNew = 1;
        int starsNew = 5;

        for (i = 1; i <= nr; i++) {
            for (j = 1; j <= counterOfSpaces; j++) {//spaces
                System.out.println(" ");

            }

            for (k = 1; k <= counterOfStars; k++) {//spaces
                System.out.println("*");

            }

            counterOfSpaces--;
            counterOfStars += 2;
            System.out.println();
        }
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= spaceNew; j++) {//spaces
                System.out.println(" ");
            }
            spaceNew++;
            for (k = 1; k <= starsNew; k++) {//stars
                System.out.println("*");
            }
            starsNew -= 2;
            System.out.println();

        }



    }






}



