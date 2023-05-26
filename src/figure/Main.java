package figure;

public class Main {
    public static void main(String[] args){
        figureArray();
    }
    public static void figureArray() {
        Figure[] figures = {
                new Rectangle("Rectangle", 2.5, 4.5),
                new Trinagle("Triangle", 4, 4, 7),
                new Trinagle("TriangleEqualsSizes", 7, 7, 7),
                new Circle("Circle", 5.0),
                new Circle("Circle2", 6.5),
        };
        for (int i=0; i<1; i++)
        {
            //System.out.println(figures[i].getFigureName() + " " + figures[i].getPerimeter());
            System.out.print("The sum perimeter of the all of figures: ");
            System.out.println(figures[0].getPerimeter() + figures[1].getPerimeter()+figures[2].getPerimeter()
                    +figures[3].getPerimeter()+figures[4].getPerimeter());
            //System.out.println(figures[i]);

        }
    }
}
