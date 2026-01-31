package com.lambdaexpressions.smartlighting;

public class SmartLighting {

	//Static method to activate light with different actions
	public static void activateLight(LightAction action) {
		action.execute();
		System.out.println("-------------------------------------------------");
	}
	public static void main(String[] args) {
		
		//Creating object of different actions
		LightAction motionTrigger = () -> System.out.println("Lights turned ON at full brightness due to motion");
		LightAction eveningTrigger = () -> System.out.println("Lights set to warm dim mode for evening");
		LightAction voiceTrigger = () -> System.out.println("Lights switched to party mode via voice command");
		
		//Calling method to activate light
		activateLight(motionTrigger);
		activateLight(eveningTrigger);
		activateLight(voiceTrigger);
	}
	
}
