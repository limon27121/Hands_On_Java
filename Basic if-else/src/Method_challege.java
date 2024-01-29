public class Method_challege {

    public static void displayHighScorePosition(String player_name,int player_position) {
      System.out.println(""+player_name+" "+"managed to get into position"+" "+player_position+" "+"on the high score list");
        
    }

    public static int calculateHighScorePosition(int num){
        if(num>=1000){
            return 1;
        }
        else if (num>=500) {
            return 2;
            
        }
        else if (num>=100) {
            return 3;
        }
        else{
            return 4;
        }
    }
    public static void main(String[] args) {
        int Score=calculateHighScorePosition(1000);
        displayHighScorePosition("Asif",Score);
        Score=calculateHighScorePosition(900);
        displayHighScorePosition("deba", Score);
        Score=calculateHighScorePosition(25);
        displayHighScorePosition("limon", Score);
       
    }
}