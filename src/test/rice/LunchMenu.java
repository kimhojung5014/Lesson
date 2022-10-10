package test.rice;

public abstract class LunchMenu {
	int basicMenu=0;
	
//	
	
	public LunchMenu(String menu1, String menu2, String menu3, String menu4,String menu5) {
			if(menu1 != null) {
				if(menu1.contentEquals("rice")) {
					basicMenu += Price.rice;
				}else if(menu1.contentEquals("banana")) {
					basicMenu += Price.banana;
				}else if(menu1.contentEquals("bulgogi")) {
					basicMenu += Price.bulgogi;
				}else if(menu1.contentEquals("milk")) {
					basicMenu += Price.milk;
				}else if(menu1.contentEquals("almond")) {
					basicMenu += Price.almond;}
			}
			if(menu2 != null) {
				if(menu2.contentEquals("rice")) {
					basicMenu += Price.rice;
				}else if(menu2.contentEquals("banana")) {
					basicMenu += Price.banana;
				}else if(menu2.contentEquals("bulgogi")) {
					basicMenu += Price.bulgogi;
				}else if(menu2.contentEquals("milk")) {
					basicMenu += Price.milk;
				}else if(menu2.contentEquals("almond")) {
					basicMenu += Price.almond;}
			}
			if(menu3 != null) {
				if(menu3.contentEquals("rice")) {
					basicMenu += Price.rice;
				}else if(menu3.contentEquals("banana")) {
					basicMenu += Price.banana;
				}else if(menu3.contentEquals("bulgogi")) {
					basicMenu += Price.bulgogi;
				}else if(menu3.contentEquals("milk")) {
					basicMenu += Price.milk;
				}else if(menu3.contentEquals("almond")) {
					basicMenu += Price.almond;}
			}
			if(menu4 != null) {
				if(menu4.contentEquals("rice")) {
					basicMenu += Price.rice;
				}else if(menu4.contentEquals("banana")) {
					basicMenu += Price.banana;
				}else if(menu4.contentEquals("bulgogi")) {
					basicMenu += Price.bulgogi;
				}else if(menu4.contentEquals("milk")) {
					basicMenu += Price.milk;
				}else if(menu4.contentEquals("almond")) {
					basicMenu += Price.almond;}
			}
			if(menu5 != null) {
				if(menu5.contentEquals("rice")) {
					basicMenu += Price.rice;
				}else if(menu5.contentEquals("banana")) {
					basicMenu += Price.banana;
				}else if(menu5.contentEquals("bulgogi")) {
					basicMenu += Price.bulgogi;
				}else if(menu5.contentEquals("milk")) {
					basicMenu += Price.milk;
				}else if(menu5.contentEquals("almond")) {
					basicMenu += Price.almond;}
			}
	}
		
//			public LunchMenu(String menu1, String menu2) {
//				
//					if(menu1.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu1.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu1.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu1.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu1.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//					
//				
//					if(menu2.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu2.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu2.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu2.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu2.contentEquals("almond")) {
//						basicMenu += Price.almond;
//					}
//					
//			}
//			public LunchMenu(String menu1, String menu2, String menu3) {
//					if(menu1.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu1.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu1.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu1.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu1.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//					
//					if(menu2.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu2.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu2.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu2.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu2.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//					
//					if(menu3.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu3.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu3.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu3.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu3.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//			}
		//	
//			public LunchMenu(String menu1, String menu2, String menu3, String menu4) {
//					if(menu1.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu1.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu1.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu1.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu1.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//					
//					if(menu2.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu2.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu2.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu2.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu2.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//					
//					if(menu3.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu3.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu3.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu3.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu3.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//					
//					if(menu4.contentEquals("rice")) {
//						basicMenu += Price.rice;
//					}else if(menu4.contentEquals("banana")) {
//						basicMenu += Price.banana;
//					}else if(menu4.contentEquals("bulgogi")) {
//						basicMenu += Price.bulgogi;
//					}else if(menu4.contentEquals("milk")) {
//						basicMenu += Price.milk;
//					}else if(menu4.contentEquals("almond")) {
//						basicMenu += Price.almond;}
//			}
		
	abstract void MentCulator();
}
