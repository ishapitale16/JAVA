class Area {
    int radius;
    int length;
    int breadth;
    int side;
    Area(int l, int b) {
length = l;
breadth = b;
 }
Area() {
 radius = 4;
 }
Area(int s) {
 side = s;
}
Area(Area a){side=a.side;}
void displayRectangle() {
int result = length * breadth;
 System.out.println("Area of Rectangle : " + result);
 }
void displayCircle() {
double result = 3.14 * radius * radius;
System.out.println("Area of Circle    : " + result);
}
void displaySquare() {
 int result = side * side;
System.out.println("Area of Square    : " + result);
}
 public static void main(String[] args) {
 Area rect = new Area(6, 3);
rect.displayRectangle();
 Area circle = new Area();
circle.displayCircle();
 Area square = new Area(5);
Area square2 = new Area(square);
square2.displaySquare();
    }
}