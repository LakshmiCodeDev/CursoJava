package controller;

/**
 *
 * @author ALUMNO
 */
public class Test1 {
    public static void main(String[] args) {
        int x,y,r;
        x=25;
        y=0;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        
        try{
            r=x/y;
        System.out.println(x+ "/" + y+ "resulta" + r);
        }
        catch(ArithmeticException e){
            System.out.println("se produjo un error");
            System.out.println("mesnsaje de error:" + e.getMessage());
        }
        catch(Exception e){
            System.out.println("error desconocido" + e.getMessage());
        }
        System.out.println("sistema terminado correctamente");
    }
}
