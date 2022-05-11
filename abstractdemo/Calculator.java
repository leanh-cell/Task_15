package abstractdemo;


public class Calculator {
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        if (args.length==2){
            shape=args[0].toLowerCase();
            switch (shape){
                case "circle":objShape=new Cricle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
                case "Rectangle":objShape=new Rectangle();
                 objShape.calculate(Float.parseFloat(args[1]));
                    break;
            }
        }else {
            System.out.println("Usage: javaCalculator<shape-name><value>");
        }
    }
}
