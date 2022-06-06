package modell;
public class Ladak {
    public static final String KINCS = "Kincs";
    public static final String NEMTALALT = "Nem talált";
    public static final String KINCSRELELT ="Kincsre lelt";


    private int[] poziciok;
    int probalkozasok;
    boolean megLett_e_aKincs;
    
    public Ladak(int[] pozicio){
    megLett_e_aKincs = false;
    probalkozasok = 0;
    this.poziciok = pozicio; 
    }

   public String ladaEllenorzes (int poz){
        int i = 0;
        while(i < poziciok.length && !(poziciok[i]==poz)){
            i++;
        }
        boolean talalt = i < poziciok.length;
        
        String probalkozasEredmenye;
        if(talalt){
            probalkozasok++;
            probalkozasEredmenye = KINCS;
            if(probalkozasok == poziciok.length){
                probalkozasEredmenye =  KINCSRELELT; 
                megLett_e_aKincs = true;
            }
        }else{
            probalkozasEredmenye = NEMTALALT;
        }
        return probalkozasEredmenye;
    }



}
