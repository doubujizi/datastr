/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-18 16:28
 */
public class TemperatureConversion {
    public static void main(String[] args) {
    int t=1;
        System.out.println(TemperatureConversion.temperatureConversion(t));
    }
    public static int temperatureConversion(int x){
        if(x==0){
            return 0;
        }else {
            return 2*temperatureConversion(x-1)+x *x;
        }

    }
}

