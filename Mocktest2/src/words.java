/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class words {
    
    public static String concatenate(String str[])
    {
        String result =String.join("",str).replace("null","");
        return result;
    }
    public static int count_words(String str[])
    {
        String result =String.join(" ",str).replace(" null ","");
        
        int count = 0;
        
        for (int i = 0; i < result.length()-1 ; i++)
        {
            if (result.charAt(i) == ' ')
            {
                count++;
            }
        }
        count = count + 1; 
        
        return count;
    }   
    
    public static String contains(String str[], String word)
    {
        Boolean result =String.join(" ",str).replace("null","").contains(word);
        return((result==true)?"yes":"no");
    }
    public static void disp(String arr[],String word)
    {
        String disp[][] = new String[2][3];
        disp[0][0]="concatenate";
        disp[0][1]="wordslenght";
        disp[0][2]="contains "+word+" ?";
        disp[1][0]=concatenate(arr);
        disp[1][1]=Integer.toString(count_words(arr));
        disp[1][2]=contains(arr,word);
        for(int i=0;i<2;i++)
        {   
            System.out.println();
            for(int j=0;j<3;j++)
                System.out.print(disp[i][j]+"\t");
        }  
    }
}
