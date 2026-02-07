// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attribute s
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double oX, double oY) {
    this.width = width;
    this.height = height;
    originX = oX;
    originY = oY;
  }

  // second constructor: 
  public Rectangle(double width, double height) {
      this(width, height, 0, 0);
  }

    // second constructor: 
  public Rectangle() {
      this(1,1, 0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  

  public void scale(double scaleX, double scaleY){
    this.width = width * scaleX;
    this.height = height* scaleY;
  }
    public void scale(double scale){
    this.width = width * scale;
    this.height = height* scale;
  }

  public boolean isOverlappedWith(Rectangle r){
    if (r.originY < this.originY){
      if (r.originY + r.height > this.originY - this.height){
        return true;
      }
    }
    else{
      if (this.originY + this.height > r.originY - r.height){
        return true;
      }
    }

    if (r.originX < this.originX){
      if (r.originX + r.width > this.originX - this.width){
        return true;
      }
    }
    else{
      if (this.originX + this.width > r.originX - r.width){
        return true;
      }
    }
    return false;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlappedWith(r2);
  }
  

  public double calcRatio(){
    return this.width / this.height;
  }

  public boolean isSquare(){
    if (calcRatio() < 1.001 && calcRatio() > 0.999){
    return true;
    }
    else{
      return false;
    }
  }
}
