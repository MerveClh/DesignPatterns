package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType) {  // shape factory uretecegimiz sekillerle alakali taleplere cevap vericek
        if (shapeType == null) {   // interface e ait objeler (Square,Rectangle,Circle)
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();  // return den sonra Circle dondurmesini sagladim // olusan objei gonderiyoruz
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
