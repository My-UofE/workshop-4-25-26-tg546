public class Circle{
    private double radius;
    private double originX;
    private double originY;

    Circle(double radius, double originX, double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    Circle(double radius){
        this.radius = radius;
        this.originX = 0;
        this.originY = 0;
    }

    Circle(){
        this.radius = 1;
        this.originX = 0;
        this.originY = 0;
    }


    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if (radius >= 0){
            this.radius = radius;
        }
    }

    public double getOriginX(){
        return originX;
    }

    public void setOriginX(double originX){
        this.originX = originX;
    }

    public double getOriginY(){
        return originY;
    }

    public void setOriginY(double originY){
        this.originY = originY;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double circumference(){
        return 2 * 3.14 * radius;
    }

    public void move(double originX, double originY){
        setOriginX(originX);
        setOriginY(originY);
    }

    public String toString(){
        return "radius " + radius + " origin X " + originX + " origin Y "+ originY; 
    }

    public void scale(double sf){
        this.radius = this.radius * sf;
    }

    public boolean isOverlappedWith(Circle c1){
        double distance = (c1.getOriginX() - this.originX)*(c1.getOriginX() - this.originX)+(c1.getOriginY() - this.originY)*(c1.getOriginY() - this.originY);
        if (distance < (this.radius+c1.getRadius())*(this.radius+c1.getRadius())){
            return true;
        }

        return false;
    }


    public boolean isEnclosedBy(Circle c1){
        //get extrementes
        double[] c1HorizontalExtremeties = {c1.getOriginX() + c1.getRadius(), c1.getOriginX() - c1.getRadius()};
        double[] c1VerticalExtremeties = {c1.getOriginY() + c1.getRadius(), c1.getOriginY() - c1.getRadius()};

        //checl within all
        if (this.originX + this.radius > c1HorizontalExtremeties[0] && this.originX - this.radius < c1HorizontalExtremeties[1]){
            if (this.originY + this.radius > c1VerticalExtremeties[0] && this.originY - this.radius < c1VerticalExtremeties[1]){
                return true;
            }
        }

        return false;
    }
}