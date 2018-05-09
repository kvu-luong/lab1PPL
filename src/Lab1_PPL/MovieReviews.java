/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_PPL;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class MovieReviews {

    //get all data
    public ArrayList data(int star) {
        ArrayList data = new ArrayList();
        try {

            File f = new File("D://HockiIINam4/PPL/lab/moviereview.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                if (readLine.startsWith(star + "")) {
                    data.add(readLine);
                    //System.out.println(readLine);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    private List<Reviews> reviews = new ArrayList<Reviews>();

    public void addReviews(Reviews review) {
        reviews.add(review);
    }

    public double reviewScore(String word) {//check score of word in list, if this isn't in list, so score will be 2
        double score = 0;
        double count = 0;
        String[] list = word.split(" ");//get each character
        double[] allscore = new double[100];//store score of each word
        int length = 1;
        for (int h = 0; h < list.length; h++) {
            length = list.length;//use to find final score value
            score = 0;
            count = 0;
            for (int i = 0; i < 5; i++) {
                ArrayList dataArr = data(i);//check each group
                
                for (int k = 0; k < dataArr.size(); k++) {
                    String[] s = dataArr.get(k).toString().split(" ");//slipt each line of 1 group

                    for (int j = 0; j < s.length; j++) {
                        if (s[j].equalsIgnoreCase(list[h])) {
                            //System.out.println(s[j] + "-----" + list[h]);
                            score = score + i;
                            count = count + 1;
                        }
                    }
                }
            }
//after 1 loop ==> calculate score of 1 word in all 5 group : 0, 1, 2, 3, 4
            if (count == 0) {
                score = 0;
            } else {
                score = score / count;
            }
            allscore[h] = score;//score of each word
        }
        //calculate final score
        double finalscore = 0;
        for (int g = 0; g < allscore.length; g++) {
            finalscore += allscore[g];
        }
        score = finalscore / length;
        return score;
    }
//    public double reviewScore(String review){//check this score of this new review
//        
//    }
//    public String mostPositive(){
//        //word appear at lest 2
//        // return word with highest score
//    }
//    public String mostNegative(){
//        //word appear at lest 2
//        //return word with lowest score
//    }
}
