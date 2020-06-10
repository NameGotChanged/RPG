package model.music;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

/**
 * Preloads a music file
 * @author NameG
 *
 */

public class MusicLoader {

	public static File sound;
	
	public static float value;
	
	Clip clip;
	
	/**
	 * Ctor
	 * @param value : Volume of the music
	 */
	public MusicLoader() {
		value = -5f;
	}
	
	/**
	 * Loads a .wav music file, I tried mp3 but that didn't work
	 */
	public void load() {
		sound = new File("background_music.wav");
	}
	
	/**
	 * Tries to play the file if it doesn't work it throws and exception
	 * @param sound
	 */
	public void play(File sound) {
		try {
			clip = AudioSystem.getClip(); //Makes a Clip out of the File
			clip.open(AudioSystem.getAudioInputStream(sound)); //Opens Audio Stream
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(value); //Volume
			
			clip.loop(Clip.LOOP_CONTINUOUSLY); //Loops the Audio Clip
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
