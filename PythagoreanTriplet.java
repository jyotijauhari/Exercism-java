/*
Given an input integer N, find all Pythagorean triplets for which a + b + c = N.

For example, with N = 1000, there is exactly one Pythagorean triplet for which a + b + c = 1000: {200, 375, 425}.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PythagoreanTriplet {
    public int a;
    public int b;
    public int c;
    public int value;
    public int sum;

    public PythagoreanTriplet() {
    }
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }
    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int factor) {
        this.value = factor;
        return this;
    }
    public PythagoreanTriplet thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }
    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> triplets = new ArrayList<>();
        for(int a=3;a<=this.sum;a++){
            for(int b=4;b<=this.sum;b++){
                int c=this.sum-a-b;
                if(isValidTriplet(a,b,c) && a<b && b<c){
                    triplets.add(new PythagoreanTriplet(a,b,c));
                }
            }
        }
        if(triplets.size() == 0) {
            return Collections.emptyList();
        }
        return triplets;
    }

    private boolean isValidTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
    @Override
    public boolean equals(Object object) {
        PythagoreanTriplet other = (PythagoreanTriplet) object;
        return a == other.a && b == other.b && c == other.c;
    }

}
