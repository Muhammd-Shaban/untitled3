// BCS181081 - Shaban

package com.company;
import java.util.Scanner;

public class Main {

    static abstract class Glass {
        protected float opacity;
        protected float thickness;

        public abstract void show();
        public abstract void setAttributes();
    }

    static class WindowGlass extends Glass{
        protected float width;
        protected float height;

        public void setAttributes() {
            System.out.println("INSIDE WINDOW GLASS CLASS...");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Opacity of Glass : ");
            opacity = sc.nextFloat();
            System.out.println("Enter the Thickness of Glass : ");
            thickness = sc.nextFloat();
            System.out.println("Enter the Width of Window Glass : ");
            width = sc.nextFloat();
            System.out.println("Enter the Height of Window Glass : ");
            height = sc.nextFloat();
        }

        @Override
        public void show() {
            System.out.println("\n\n\n\n*** WINDOW GLASS INFORMATION ***\n");
            System.out.println("1. Opacity of Glass is : "+opacity);
            System.out.println("2. Thickness of Glass is : "+thickness);
            System.out.println("3. Width of Window Glass is : "+width);
            System.out.println("4. Height of Window Glass is : "+height);
        }
    }

    static class CarWindowGlass extends WindowGlass {

        public void setAttributes() {
            System.out.println("\n\n\nINSIDE CAR WINDOW GLASS CLASS...");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Opacity of Glass : ");
            opacity = sc.nextFloat();
            System.out.println("Enter the Thickness of Glass : ");
            thickness = sc.nextFloat();
            System.out.println("Enter the Width of Car Window Glass : ");
            width = sc.nextFloat();
            System.out.println("Enter the Height of Car Window Glass : ");
            height = sc.nextFloat();
        }

        public void show() {
            System.out.println("\n\n\n\n*** CAR WINDOW GLASS INFORMATION ***\n");
            System.out.println("1. Opacity of Glass is : "+opacity);
            System.out.println("2. Thickness of Glass is : "+thickness);
            System.out.println("3. Width of Car Window Glass is : "+width);
            System.out.println("4. Height of Car Window Glass is : "+height);
        }
    }

    public static void main(String[] args) {
        WindowGlass wg = new WindowGlass();
        wg.setAttributes();
        wg.show();
        CarWindowGlass cwg = new CarWindowGlass();
        cwg.setAttributes();
        cwg.show();
    }
}
