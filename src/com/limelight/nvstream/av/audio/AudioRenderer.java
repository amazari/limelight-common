package com.limelight.nvstream.av.audio;

public interface AudioRenderer {
	public void streamInitialized(int channelCount, int sampleRate);
	
	public void playDecodedAudio(byte[] audioData, int offset, int length);
	
	public void streamClosing();
}
