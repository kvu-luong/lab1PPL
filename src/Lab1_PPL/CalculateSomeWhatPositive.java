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
public class CalculateSomeWhatPositive extends SomeWhatPositive {
    @Override
    public double score() {
        return 3;
    }

    @Override
    public String word() {
       return "This is almost good movie";
    }
    
       @Override
    public ArrayList data() {
       MovieReviews review = new MovieReviews();
       ArrayList data = new ArrayList();
       data.add(review.data(3));
       return data;
    }
}
