
public class Proj1 {
    
    private double width=1;
    private double height=1;
    private static String color="white";
    
    public Proj1(){
    
    }
    
    public Proj1(int width , int height){
        this.width=width;
        this.height=height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeught(double heught) {
        this.height = heught;
    }

    public double getWidth() {
        return width;
    }

    public double getHeught() {
        return height;
    }
    
    public double getArea(){
    return width*height;
    
}

    public static String getColor(String s) {
        return color;
    }
    
    public static String getcolor() {
        
        return color;
        
    }
    
    public double getPerimeter(){
        
        return 2*width+2*height;
        
    }
    
    
    
    
    
}
