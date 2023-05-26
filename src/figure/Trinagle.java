package figure;

 public class Trinagle extends Figure {

    public Trinagle(String figureName, int a, int b, int c) {
        this.figureName = figureName;
        this.perimeter = a + b + c;
        this.area= (a + b + c)/2;
    }

    @Override
    double getArea() {
        return this.area ;
    }

    @Override
    double getPerimeter() {
        return this.perimeter;
    }

}
