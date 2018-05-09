/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_PPL;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class CalculatePositive extends Positive{
    @Override
    public double score() {
        return 4;
    }

    @Override
    public String word() {
       return "This is good movie";
    }
       @Override
    public ArrayList data() {
       MovieReviews review = new MovieReviews();
       ArrayList data = new ArrayList();
       data.add(review.data(4));
       return data;
    }
}
