package com.tummosoft;

import anywheresoftware.b4a.BA;

@BA.ShortName("ThymeleafSupport")
public class Msgbox {    
		public static final String TEXT_RED = "[31m";
		public static final String TEXT_BLACK = "[30m";
		public static final String TEXT_GREEN = "[32m";
		public static final String TEXT_BLUE = "[34m";
		public static final String TEXT_RESET = "[0m";
		public static final String TEXT_PURPLE = "[35m";
		public static final String TEXT_CYAN = "[36m";
		public static final String TEXT_YELLOW = "[33m";
		public static final String TEXT_WHITE = "[37m";

		public static void SendText(String text, String colors) {
			System.out.println((char) 27 + colors + text + (char) 27 + "[0m");
		}

		public static void SendText(int text, String colors) {
			System.out.println((char) 27 + colors + text + (char) 27 + "[0m");
		}
	
}

