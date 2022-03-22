/*Design a class named weather report that holds a daily weather report with data members day_of_month,
hightemp, lowtemp, amount_rain and amount_snow. Use different types of constructors to initialize the
objects. Write a program to generate monthly report that displays average of each attribute.*/
import java.util.*;
public class Weather {
    int day_of_mon;
    float high_temp, low_temp, amt_of_rain, amt_of_snow;

 public 
      Weather(){
          day_of_mon=0;
          high_temp=0;
          low_temp=0;
          amt_of_rain=0;
          amt_of_snow=0;
      }
      
      Weather(int dm,float ht, float lt, float ar,float as){
          day_of_mon=dm;
          high_temp=ht;
          low_temp=lt;
          amt_of_rain=ar;
          amt_of_snow=as;
      }
    void getdata(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter day number:");
        day_of_mon=s.nextInt();
        System.out.println("Enter the amount of rain:");
        amt_of_rain=s.nextFloat();
        System.out.println("Enter the amount of snow:");
        amt_of_snow=s.nextFloat();
        System.out.println("Enter the highest temperature:");
        high_temp=s.nextFloat();
        System.out.println("Enter lowest temperature:");
        low_temp=s.nextFloat();        
    }
    
    public static void main(String[] args) {
        int n;
        float HT=0;float LT=0;float AR=0;float AS=0;
        Scanner s=new Scanner(System.in);
        System.out.println("How many days?");
        n=s.nextInt();
        Weather[] w=new Weather[n];
        for(int i=0;i<n;i++){
            System.out.println("Weather report of day"+ (i+1));
            w[i]=new Weather();
            w[i].getdata();
        }
        for(int i=0;i<n;i++){
            HT+=w[i].high_temp;
            LT+=w[i].low_temp;
            AR+=w[i].amt_of_rain;
            AS+=w[i].amt_of_snow;
        }
        HT=HT/n;
        LT=LT/n;
        AR=AR/n;
        AS=AS/n;
        System.out.println("Average weather report:");
        System.out.println("Avg highest temperature ="+HT+"degree celsius");
        System.out.println("Avg lowest temperature ="+LT+"degree celsius");
        System.out.println("Avg amount of rain ="+AR+" mm");
        System.out.println("Avg amount of snow ="+AS+" mm");
        
    }
}
