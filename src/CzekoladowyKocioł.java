public enum CzekoladowyKocioł {

   UNIKALNA_INSTANCJA;

   private boolean pusty=true;
   private boolean ugotowany=false;


   public static CzekoladowyKocioł pobierzInstancję() {

      CzekoladowyKocioł unikalnaInstancja=CzekoladowyKocioł.UNIKALNA_INSTANCJA;
      System.out.println("Uruchamiam instancję enumeratora CzekoladowyKocioł...");
      System.out.println("Czy jest pusty: "+ unikalnaInstancja.jestPusty()+ ". Czy jest ugotowany: "+ unikalnaInstancja.jestUgotowany());
      return unikalnaInstancja;
   }

   public void napełniaj() {
      if (jestPusty()) {
         pusty = false;
         ugotowany = false;
         // Napełniaj bojler mieszanką mleka i czekolady
      }
   }
 
   public void opróżniaj() {
      if (!jestPusty() && jestUgotowany()) {
         // Opróżniaj bojler z ugotowanej mieszanki mleka i czekolady
         pusty = true;
      }
   }
 
   public void gotuj() {
      if (!jestPusty() && !jestUgotowany()) {
         // Gotuj zawartość kotła
         ugotowany = true;
      }
   }
  
   public boolean jestPusty() {
      return pusty;
   }
 
   public boolean jestUgotowany() {
      return ugotowany;
   }
}
