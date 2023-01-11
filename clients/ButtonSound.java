package clients;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class ButtonSound implements ActionListener {
	private String sound;
	public ButtonSound(String sd) {
		sound = sd;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		try {
			File file = new File(sound);
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
