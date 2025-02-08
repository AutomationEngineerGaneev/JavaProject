package generics.box_example;

import generics.robot.Robot;

public class Paper {






    public static void main(String[] args) {

        Paper paper = new Paper();

        BoxExample<Paper> boxForPaper = new BoxExample<>();

        boxForPaper.foo();
        boxForPaper.putItem(paper);
        boxForPaper.getItem();

    }
}
