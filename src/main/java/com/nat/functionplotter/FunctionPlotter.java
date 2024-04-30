package com.nat.functionplotter;
import com.opencsv.CSVWriter;     //added JAR file through maven terminal with dependency from https://central.sonatype.com/artifact/com.opencsv/opencsv
import java.io.FileWriter;

public class FunctionPlotter {

    /**
     * using  y=x^{3}-4x
     * formula is default, takes starting x and ending x as params
     */
    
    private double firstx;
    private double lastx;
    private int count;
    private double interval; //want this to be a user input too
    
    private double[] xvalues; 
    private double[] yvalues;
    
    private String fileName = " ";
    
    
    public FunctionPlotter(double x1, double x2, double inter)
    {
        firstx = x1;
        lastx = x2;
        interval = inter;
        
        double range = lastx - firstx; 
        count =  (int) ((range*(1/interval)+1)); 
        
        xvalues = new double[count]; 
        yvalues = new double[count];
    }
    
    public void plotX() 
    {
        double tempx = firstx; //defeault first value for array
        for(int i = 0; i < count; i++)
        {
            xvalues[i] = tempx; 
            tempx += interval;
        }
    }
        
    public void plotY() //increases using function
    {
        double xval; //pulls x from xvalues array
        for(int i = 0; i < count; i++)
        {
            xval = xvalues[i];
            yvalues[i] = Math.pow(xval, 3) - (4*xval);
        }
    }
    
    public void printArray(double[] input)
    {
        System.out.print("[");
        for(int i = 0; i < input.length-1; i++)
        {
            System.out.print(input[i]);
            System.out.print(",");
        }
        System.out.print(input[input.length-1]+"]");
    }
    
    public void result()
    {
        plotX();
        plotY();
        System.out.println("Final x values: ");
        printArray(xvalues);
        System.out.println("\nFinal y values: ");
        printArray(yvalues);
    }
}
