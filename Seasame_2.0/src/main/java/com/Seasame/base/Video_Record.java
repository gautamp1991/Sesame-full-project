package com.Seasame.base;

public class Video_Record {
	
	public static void pass_script_video_record() throws Exception {
		
		 MyScreenRecorder.stopRecording(); 
		    String RecVideo = MyScreenRecorder.ReadtheListOfFileAndDeleteinPass("./Recording/");
	      MyScreenRecorder.deleteRecFile(RecVideo);

	}
	
	
	public static void fail_script_video_record() throws Exception {
		
		 MyScreenRecorder.stopRecording(); 
		    String RecVideo = MyScreenRecorder.ReadtheListOfFileAndDeleteinPass("./Recording/");
		 MyScreenRecorder.MoveRecFile(RecVideo); 

	}
	
} 