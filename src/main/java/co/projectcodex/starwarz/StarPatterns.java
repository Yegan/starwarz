package co.projectcodex.starwarz;

import java.util.ArrayList;

public class StarPatterns {

    /**
     *
     * line(4) prints * * * *
     *
     * line(7) prints * * * * * * *
     *
     *
     * @param size
     */

    public static void line(int size) {
        String stars = "* ";
        StringBuilder str = new StringBuilder(stars);
        for (int i = 1; i<size ; i++){
         str.append(stars);
       }
        System.out.print(str.toString());
    }
    
    /**
     * Print a square of stars of a specified size
     *
     * squareStars(4) should print
     *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     *
     * or
     *
     * squareStars(7) should print
     *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     *
     * @param size
     */
    public static void squareStars(int size) {
        String stars = "* ";
        StringBuilder str = new StringBuilder(stars);
        for (int i = 1; i<size ; i++){
            str.append(stars);
        }
        for (int y = 0; y<size ; y++){
            System.out.println(str);
        }
    }


    /**
     *
     * triangleBottomBase(4)
     *
     * prints
     *
     * *
     * * *
     * * * *
     * * * * *
     *
     * triangleBottomBase(7)
     *
     * prints
     *
     *  *
     *  * *
     *  * * *
     *  * * * *
     *  * * * * *
     *  * * * * * *
     *  * * * * * * *
     *
     *
     *
     * @param size
     */
    public static void triangleBottomBase(int size) {
        String stars = "* ";
        StringBuilder str = new StringBuilder(stars);

        for (int i =0; i<size ; size--){
            for (int y = 0; y< size ; y++){
                System.out.println(str);
                str.append(stars);
            }
            break;
        }


    }

    /**
     * triangleTopBase(3)
     *
     * prints
     *
     * * * *
     * * *
     * *
     *
     * triangleTopBase(7)
     *
     * prints
     *
     *  * * * * * * *
     *  * * * * * *
     *  * * * * *
     *  * * * *
     *  * * *
     *  * *
     *  *
     *
     *
     * @param size
     */

    public static void triangleTopBase(int size) {
        String stars = "* ";

        for (int i =size; i>=1 ; i--){
            for (int y = 1; y <= i ; y++){
                System.out.print(stars);
            }
            System.out.println("");
        }
    }

    /**
     * emptySquare(4);
     *
     * prints
     *
     *  * * * *
     *  *     *
     *  *     *
     *  * * * *
     *
     *  emptySquare(7);
     *
     *  * * * * * * *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  *           *
     *  * * * * * * *
     *
     * @param size
     */
    public static void emptySquare(int size) {
        String stars = "* ";
        StringBuilder str = new StringBuilder(stars);
        for (int i = 1; i<size ; i++){
            str.append(stars);
        }
        for (int y = 0; y<size ; y++){
            System.out.println(str);
                System.out.println(str);
            }
        }
    }


    public static void main(String[] args) {

//        squareStars(10);
//        squareStars(5);

//        triangleTopBase(10);
//        triangleBottomBase(7);

        //emptySquare(4);

//        emptySquare(15);


    }




}
