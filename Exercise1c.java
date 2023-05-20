/*  Five Bikers Compete in a race such that they drive at a constant speed which may or may not be the
same as the other. To qualify the race, the speed of a racer must be more than the average speed of
all 5 racers. Take as input the speed of each racer and print back the speed of qualifying racers. 

*/
public class Exercise1c {
    public static void main(String [] args){
        int [] speed = {10,20,30,40,50};
        int sum = 0;
        for(int i=0;i<speed.length;i++){
            sum += speed[i];
        }
        int avg = sum/speed.length;
        System.out.println("Average speed is " + avg);
        for(int i=0;i<speed.length;i++){
            if(speed[i] > avg){
                System.out.println("Racer " + (i+1) + " qualified");
            }
        }
    }
}
