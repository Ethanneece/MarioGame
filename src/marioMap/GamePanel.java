package marioMap;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import gameState.GameStateManager;

public class GamePanel extends JPanel implements Runnable, KeyListener {
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 900;
	public static final int HEIGHT = 550;
	
	private Thread thread;
	private boolean isRunning = false;
	
	private int fps = 60;
	private long targetTime = 1000/fps;
	
	private GameStateManager gsm;
	
	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		addKeyListener(this);
		setFocusable(true);
		
		start();
	}
	
	public void init() {
		gsm = new GameStateManager();
		Assets.init();
	}
	
	public void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		long start,elapse,wait;
		
		init();
		
		while(isRunning) {
			start = System.nanoTime();
			
			tick();
			repaint();
			
			elapse = System.nanoTime() - start;
			wait = targetTime - elapse / 1000000;
			
			if(wait <= 0) {
				wait = 5;
			}
			
			try {
				Thread.sleep(wait);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void tick() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.clearRect(0, 0, WIDTH, HEIGHT);
		
		gsm.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		gsm.KeyPressed(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
			gsm.KeyReleased(e.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	
}
