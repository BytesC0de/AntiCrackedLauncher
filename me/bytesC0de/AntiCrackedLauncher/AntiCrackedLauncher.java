package me.bytesC0de.AntiCrackedLauncher;

import net.minecraft.util.Session;

public class AntiCrackedLauncher {

	public static void checkForCrackedLauncher(Session session, boolean bypassCheck, CrackedLauncherDetectedAction action) {
		if(!bypassCheck) {
			action.preCheck();
			if(session.getToken() == "0") {
				action.onDetect();
			} else {
				action.onNotDetected();
			}
			action.postCheck();
		} else {
			action.onBypassing();
		}

	}




}
