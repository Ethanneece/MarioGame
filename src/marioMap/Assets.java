package marioMap;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int WIDTH = 16, HEIGHT = 16;
	
	public static BufferedImage player, enemy;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/marioSheet.png"));
		
		player = sheet.crop(80, 34, WIDTH, HEIGHT);
		enemy = sheet.crop(80, 99, WIDTH, HEIGHT);
	}

}
