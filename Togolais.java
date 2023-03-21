public class Togolais extends Version{
    public Togolais(){
        super();
        this.entete = "En togolais : ";
    }
    public String getTraduction(String enFrancais){
        return this.entete + this.dico.get(enFrancais);
    }

}
