package com.taufiq.levels.tile;

import com.taufiq.Game.Screen;
import com.taufiq.Game.Sprite;

public class StoneTile extends Tile{

	public StoneTile(Sprite sprite) {
		super(sprite);
	}
public void render(int x,int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}
	public boolean solid(){
		return true;
	}
}
