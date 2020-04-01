package gameState;

import java.awt.Graphics;

import marioMap.Assets;


public class World1_1State extends GameState {
	
	
	public World1_1State(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		
		
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Assets.player, 10, 10,null);
		g.drawImage(Assets.enemy, 30, 30, null);
		
	}

	@Override
	public void KeyPressed(int k) {
		
	}

	@Override
	public void KeyReleased(int k) {
		
	}

}
