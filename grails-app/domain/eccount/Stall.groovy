package eccount
/**
  * @author  : Prayag Upd
  * @created : 9 Dec, 2012
  */
class Stall{
    String name;
    Date created;
    Boolean active=true;
    
    static hasMany = [items:Item]
    //static mappedBy = [items:"category"]

    static mapWith="mongo"

    static constraints = {
         created(display:false)
         active(display:false)
    }
}