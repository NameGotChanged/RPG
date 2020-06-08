package controller.music;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class MusicLoader {
	
	public static File sound;
	
	public static float value;
	
	Clip clip;
	
	public MusicLoader() {
		value = -5f;
	}
	
	public void load() {
		sound = new File("background_music.wav");
	}
	
	public void play(File sound) {
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(value);
			
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
