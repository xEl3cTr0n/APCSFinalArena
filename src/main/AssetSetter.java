package main;

import object.OBJ_heal;
import object.OBJ_shield;
import object.OBJ_speedBoost;

public class AssetSetter {
	GamePanel gp;
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		gp.obj[0] = new OBJ_heal(gp); //randomize obj's
		/*for (int i = 0; i < 40; i++) { //for when switch to arraylist from array of objects
			
		}*/ 
		gp.obj[0].worldX = (int) ((Math.random()*49 + 1) * gp.tileSize);
		gp.obj[0].worldY = (int) ((Math.random()*49 + 1)) * gp.tileSize;
		
		gp.obj[1] = new OBJ_heal(gp);
		gp.obj[1].worldX = (int) ((Math.random()*49 + 1) * gp.tileSize);
		gp.obj[1].worldY = (int) ((Math.random()*49 + 1)) * gp.tileSize;
		while (gp.obj[1].worldX == gp.obj[0].worldX && gp.obj[1].worldY == gp.obj[0].worldY) {
			gp.obj[1].worldX = (int) ((Math.random()*49 + 1) * gp.tileSize);
			gp.obj[1].worldY = (int) ((Math.random()*49 + 1)) * gp.tileSize;
		}
		
		gp.obj[2] = new OBJ_shield(gp);
		//for (int i = 0; i < 20) {
		gp.obj[2].worldX = (int) ((Math.random()*49 + 1) * gp.tileSize);
		gp.obj[2].worldY = (int) ((Math.random()*49 + 1) * gp.tileSize);
		while (gp.obj[2].worldX == gp.obj[1].worldX && gp.obj[2].worldY == gp.obj[1].worldY || 
				gp.obj[2].worldX == gp.obj[0].worldX && gp.obj[2].worldY == gp.obj[0].worldY) {
			gp.obj[2].worldX = (int) ((Math.random()*49 + 1) * gp.tileSize);
			gp.obj[2].worldY = (int) ((Math.random()*49 + 1)) * gp.tileSize;
		}
		
		gp.obj[3] = new OBJ_shield(gp);
		gp.obj[3].worldX = (int) ((Math.random()*49 + 1) * gp.tileSize);
		gp.obj[3].worldY = (int) ((Math.random()*49 + 1) * gp.tileSize);
		while (gp.obj[3].worldX == gp.obj[1].worldX && gp.obj[3].worldY == gp.obj[1].worldY || 
				gp.obj[3].worldX == gp.obj[0].worldX && gp.obj[3].worldY == gp.obj[0].worldY || 
				gp.obj[3].worldX == gp.obj[2].worldX && gp.obj[3].worldY == gp.obj[2].worldY) {
			gp.obj[2].worldX = (int) ((Math.random()*49 + 1) * gp.tileSize);
			gp.obj[2].worldY = (int) ((Math.random()*49 + 1)) * gp.tileSize;
		}
		
		gp.obj[4] = new OBJ_speedBoost(gp);
		gp.obj[4].worldX = 37 * gp.tileSize;
		gp.obj[4].worldX = 42 * gp.tileSize;
		
		
	}
}