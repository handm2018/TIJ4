package chapter11;

import java.util.ArrayList;

public class E01_Gerbil {
    public static void main(String[] args) {
        ArrayList<Gerbil> arrayList = new ArrayList<>();
        for (int i=0;i<10;i++){
            arrayList.add(new Gerbil(i));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).hop();
        }
    }
}

class Gerbil{
    private int gerbilNumber;

    Gerbil(int number){
        this.gerbilNumber = number;
    }

    @Override
    public String toString() {
        return "gerbilNumber"+gerbilNumber;
    }

    public void hop(){
        System.out.println(this.gerbilNumber+"hoping");
    }
}