/**
 * Created by Tesseract on 6/07/2017.
 */

//the materials have these attributes MATERIAL,HP,TYPE,TIME,LOCATION
//the attributes should be held in the base class and the composite no variables in the interface

// so what methods do i need for these materials

public interface materialInterface {

    //getters
    public void getMaterial();  //using these will limits modularity but any new system would need new storage
    public void getHP();
    public void getType();
    public void getLocation();

    //setters
    public void setMaterial();
    public void setHP();
    public void setType();
    public void setLocation();

    //what else will they both need to do ?? children yes
    //they should both hold a list of children( the base materials that make them)

    public void addChild(); //??what is the input
}
