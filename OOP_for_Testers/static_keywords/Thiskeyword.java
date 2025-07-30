package OOP_for_Testers.static_keywords;

public class Thiskeyword {
    int x,y;

    Thiskeyword(int x, int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        System.out.println("number 1 is:"+x);
        System.out.println("number 2 is:"+y);
    }

    public static void main(String[] args) {
        Thiskeyword key1=new Thiskeyword(4,5);
        key1.display();
    }
}
