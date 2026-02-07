public class CircleApp{
	public static void main( String[] args ){
        Circle c1 = new Circle(5, 5, 5);
        Circle c2 = new Circle(3, 100, 100);
        Circle c3 = new Circle();

        System.out.println(c1);
        System.out.println(c2);  
        System.out.println(c3);

        c1.move(2, 2);
        System.out.println(c1);

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.circumference());
        c1.setOriginX(-3);
        System.out.println(c1);
        c1.scale(5);
        System.out.println(c1);
        System.out.println(c1.isOverlappedWith(c2));
        System.out.println(c1.isEnclosedBy(c3));
        System.out.println(c2.isEnclosedBy(c3));    
    }
}