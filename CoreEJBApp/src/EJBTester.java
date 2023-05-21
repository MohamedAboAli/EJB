//
//import javax.inject.Inject;
//
//import Application.ApplicationBusinessFacade;
//
//public class EJBTester {
//	
//    @Inject
//    ApplicationBusinessFacade libraryBean;
//
//	   public static void main(String[] args) {
//		
//
//	      EJBTester ejbTester = new EJBTester();
//	 
//	      ejbTester.testStatelessEjb();
//	   }
//
//	   private void testStatelessEjb() {
//	      try {
//     
//	         System.err.println(libraryBean.multiple(4, 3));
//	      } catch (Exception e) {
//	         System.out.println(e.getMessage());
//	         e.printStackTrace();
//	      }
//	   }  
//}
