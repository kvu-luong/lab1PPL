/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_PPL;

/**
 *
 * @author PC
 */
public class MoviewReviewDemo {
    public static void main(String[] args){
        MovieReviews movie = new MovieReviews();
        //movie.data(0);
        //A weak script that ends with a quick and boring fimale
       double score =  movie.reviewScore("A weak script that ends with a quick and boring fimale");
       System.out.println(score);
    }
}
