package arquivoDump.classes;


public class Url {
	
    /**
    *
    */
   private static final long serialVersionUID = 1L;
   private int id;


public boolean equals(Object obj) {

         if (obj == null)
                return false;
         if (this.getClass() != obj.getClass())
                return false;
         String name = obj.toString();
         return this.toString().equals(name);

   }

   public int hashCode() {
         return this.toString().hashCode();
   }

   public String toString() {
         return new StringBuilder
          (this.getClass().getName()).append("#")
                       .append(this.getId()).toString();
   }

   public int getId() {
         return id;
   }

   public void setId(int id) {
         this.id = id;
   }


	
	

}
