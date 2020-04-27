package com.dicycat.kroy.minigame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import java.util.Random;

/**
 * A class for the pipes of the minigame. Essentially puzzle pieces.
 *
 * @author Bethany Gilmore - NP STUDIOS
 *
 */
public class Pipe {
    private Texture image;
    private ImageButton button;
    private int type;
    private int rotation;
    private int correctRotation;


    public Pipe(int type, int correctRotation){
        this.correctRotation = correctRotation;
        this.type = type;
        Random rand = new Random();

        if (type == 0){
            this.setRotation(rand.nextInt(2));
            if (this.getRotation() == 0) {
                this.image = new Texture("pipeI-0.png");
            }else{
                this.image =new Texture("pipeI-1.png");
            }
        }else if (type == 1){
            this.setRotation(rand.nextInt(4));
            if (this.getRotation() == 0) {
                this.image = new Texture("pipeL-0.png");
            }else if (this.getRotation() == 1){
                this.image = new Texture("pipeL-1.png");
            }else if(this.getRotation() == 2){
                this.image = new Texture("pipeL-2.png");
            }else{
                this.image = new Texture("pipeL-3.png");
            }
        }else if (type == 2){
            this.setRotation(rand.nextInt(4));
            if (this.getRotation() == 0) {
                this.image = new Texture("pipeT-0.png");
            }else if (this.getRotation() == 1){
                this.image = new Texture("pipeT-1.png");
            }else if (this.getRotation() == 2){
                this.image = new Texture("pipeT-2.png");
            }else {
                this.image = new Texture("pipeT-3.png");
            }
        }else if (type == 3) {
            this.image = new Texture("pipeX.png");
            this.setRotation(0);
        }
        button = new ImageButton(new TextureRegionDrawable(new TextureRegion(this.image)));
    }

    public ImageButton getButton(){
        return this.button;
    }

    /**
     * Replaces the image of the pipe with one rotated by 90 degrees
     * And changes the variable representing the current rotation accordingly
     */
    public void rotate(){
        if (this.type == 0){
            this.setRotation((this.getRotation() + 1) % 2);
            String file = "pipeI-"+this.getRotation()+".png";
            this.image = new Texture(file);
            this.button = new ImageButton(new TextureRegionDrawable(new TextureRegion(this.image)));
        }else if (this.type == 1){
            this.setRotation((this.getRotation() + 1) % 4);
            String file = "pipeL-"+this.getRotation()+".png";
            this.image = new Texture(file);
            this.button = new ImageButton(new TextureRegionDrawable(new TextureRegion(this.image)));
        }else if (this.type == 2){
            this.setRotation((this.getRotation() + 1) % 4);
            String file = "pipeT-"+this.getRotation()+".png";
            this.image = new Texture(file);
            this.button = new ImageButton(new TextureRegionDrawable(new TextureRegion(this.image)));
        }
    }

    /**
     *  @return rotation
     */
	public int getRotation() {
		return rotation;
	}
	
	/**
     *  set rotation
     */
	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
	
	
}
