/******************************************************
‘***  Project 1 - Error handling
‘***  Gabriel Brown
‘******************************************************
‘*** To Demonstrate Error handling / Classes / Math
‘***
‘******************************************************
‘*** 09/05/2017
‘******************************************************
‘*****************************************************/
package brownproject1;

/**
 *
 * @author Gabe
 */
public class NumberSet {
    private int pos;
    private int set[] = new int[10];
    
/******************************************************
‘***  AddNumber(int number)
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to add numbers to the set array
‘*** Method Inputs: 
‘***      number: number value to add
‘*** Return value:
‘***      void
‘******************************************************
‘*** 9/05/2017
‘******************************************************/
    public void AddNumber(int number)
    {
        set[pos++] = number;
    }

 /******************************************************
‘***  GetMean()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to get mean value of current set
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      mean of current set.
‘******************************************************
‘*** 9/05/2017
‘******************************************************/
    public double GetMean()
    {
        int sum = 0;
        for(int i = 0; i<pos; i++)
        {
            sum += set[i];
        }
       return 1.0*sum / pos;
    }
    
/******************************************************
‘***  GetSD()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to get Standard deviation of current set
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      Standard deviation of current set.
‘******************************************************
‘*** 9/05/2017
‘******************************************************/
    public double GetSD()
    {
        double mean = GetMean();
        double sd = 0;
        
        for (int i = 0; i < pos; i++)
        {
            sd += Math.pow(set[i] - mean,2) / pos;
        }
        sd = Math.sqrt(sd);
        return sd;
    }

/******************************************************
‘***  ToString()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to get printable string of this object
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      formated string for a jLabel.
‘******************************************************
‘*** 9/05/2017
‘******************************************************/    
    public String ToString()
    {
        String answer = "<html>";
        for (int i = 0; i < pos; i++)
        {
            answer += set[i] + "<br>";
        }
        
        answer += new String(new char[12 - pos]).replace("\0", "<br>");
        
        answer += "Mean = " + GetMean() + "<br>";
        answer += "StdD = " + GetSD() + "<br>";
        return answer;
    }
}
