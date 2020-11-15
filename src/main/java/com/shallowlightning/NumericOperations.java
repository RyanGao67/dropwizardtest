package com.shallowlightning;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class NumericOperations {
    static void findStat(double[] inputArray){
        DescriptiveStatistics stat = new DescriptiveStatistics();
        for(double element:inputArray){
            stat.addValue(element);
        }
        System.out.println("Mean Value: "+stat.getMean());
    }

    public static void main(String[] args){
        double[] ipArray = {1.6, 2.8, 3.4};
        findStat(ipArray);
    }
}
