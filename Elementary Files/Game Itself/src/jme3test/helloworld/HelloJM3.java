
package jme3test.helloworld;
 /* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */import com.jme3.app.SimpleApplication;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.math.ColorRGBA;
 import com.jme3.scene.Node;


/**
 *
 * @author Neil
 */
public class HelloJM3 extends SimpleApplication {
     public static void main(String[] args){
        HelloJM3 app = new HelloJM3();
        app.start(); // start the game
}
 @Override
    public void simpleInitApp() {
 /** create a blue box at coordinates (1,-1,1) */
 /**       Box box1 = new Box( Vector3f.ZERO, 1,1,1);
        Geometry blue = new Geometry("Box", box1);
        Material mat1 = new Material( 
    assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
mat1.setTexture("ColorMap", 
    assetManager.loadTexture("Untitled.jpg"));
      //  mat1.setColor("Color", ColorRGBA.Blue);
        blue.setMaterial(mat1);
        
blue.setLocalTranslation(2.0f,-2.5f,0.0f);**/
     
     /** A simple textured cube. */
    Box boxshape1 = new Box(new Vector3f(-3f,1.1f,0f), 1f,1f,1f);
    Geometry cube = new Geometry("My Textured Box", boxshape1);
    Material mat_stl = new Material(assetManager, 
        "Common/MatDefs/Misc/Unshaded.j3md");
    Texture tex_ml = assetManager.loadTexture("Interface/Logo/Monkey.jpg");
    mat_stl.setTexture("ColorMap", tex_ml);
    cube.setMaterial(mat_stl);
    rootNode.attachChild(cube);

       
    }
 
        }
 
