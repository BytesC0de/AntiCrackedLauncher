package me.bytesC0de.AntiCrackedLauncher;

import net.minecraft.util.Session;

public class AntiCrackedLauncher {

	public static void checkForCrackedLauncher(Session session, boolean bypassCheck, CrackedLauncherDetectedAction action) {
		if(!bypassCheck) {
			action.preCheck();
			if(session.getPlayerID() == "" || session.getPlayerID() == "" || session.getToken() == "0" || session.getSessionID() == null || session.getSessionID() == "" || (session.getSessionType() != Session.Type.LEGACY && session.getSessionType() != Session.Type.MOJANG)) {
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
