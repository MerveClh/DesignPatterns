package StructuralDP.ProxyDP;

import java.util.ArrayList;
import java.util.List;

public class RealClass implements ImageGenerator{
private String fullPath;

public RealClass(String fullPath){   // basic obje
    this.fullPath = fullPath;
}

    @Override
    public void showImage() {  // reals class in show images i isteniyor sadece
        System.out.println("Resim gosteriliyor" + fullPath);
    }

    public void getName(){
        System.out.println("...");
    }
    public void getLName(){
        System.out.println("...");
    }
}
