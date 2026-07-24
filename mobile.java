class Mobile {
String companyName;
double screenSize; 
Mobile(String cmpName, double size) {
companyName = cmpName;
screenSize = size;
}
void display() {
System.out.println("Company Name : " + companyName);
System.out.println("Screen Size  : " + screenSize + " inches");
}
public static void main(String[] args) {
        
Mobile myPhone = new Mobile("Samsung", 6.7);
myPhone.display();
}
}