class Cube {
int length;
 int breadth;
int height;
Cube(int h, int b) {
length = 5; 
 breadth = b;
height = h;
 }
void display() {
 int Volume = length * breadth * height;
 System.out.println("volume:" + Volume);
 }
public static void main(String[] args) {
 Cube obj = new Cube(3, 4);
 obj.display();
 }
}