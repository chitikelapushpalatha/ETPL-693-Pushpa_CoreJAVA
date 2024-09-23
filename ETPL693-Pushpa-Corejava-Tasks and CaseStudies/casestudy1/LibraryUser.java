package com.evergent.corejava.pushpa.casestudy1;

	interface   LibraryUser 
	{
		
		public void registerAccount(int age) throws AgedNotFound, AdNotFoundException1;
		public void requestBook(String btype) throws BookNotFound, BnFound1;
		

	}

