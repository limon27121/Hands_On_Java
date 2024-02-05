public class BarkingDog {
    public static boolean shouldWakeUp (boolean bark,int time){
        if(time<0||time>23){
            return false;
        }
        else if (bark==true&&time<8||time>22){
            return true;
        }

        else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result=shouldWakeUp(true,33);
        if (result){
            System.out.println("Dog is barking");
        }
        else{
            System.out.println("dog is not barking");
        }
    }
}
