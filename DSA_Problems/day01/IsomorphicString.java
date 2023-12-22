public class IsomorphicString {
    public static void main(String[] args) {
        
        String s="bell";
        String t="fall";
       int scount =1;
       int tcount=1;
        for(int i=0;i<s.length()-1;i++){
            int j=i+1;
           if(s.charAt(i)==s.charAt(j)){
            scount++;
            System.out.println(scount);
           }else{
            System.out.println(scount);
           }
        }
          for(int i=0;i<t.length()-1;i++){
            int j=i+1;
           if(t.charAt(i)==t.charAt(j)){
            tcount++;
            System.out.println(tcount);
           }else{
            System.out.println(tcount);
           }
        }

        if(scount==tcount){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
    
}
