
/**
 * Beschreiben Sie hier die Klasse ZehnGebote.
 * 
 * @author Jhm 
 * @version 0.3
 */
public class ZehnGebote
{
    
    public ZehnGebote()
    {
        String bibeltext1 = "Ich bin der HERR, dein Gott, der ich dich aus dem Land Ägypten, aus dem Sklavenhaus, herausgeführt habe. 3 Du sollst[1] keine andern Götter haben neben mir[2]. – 4 Du sollst dir kein Götterbild[3] machen, auch keinerlei Abbild dessen, was oben im Himmel oder was unten auf der Erde oder was im Wasser unter der Erde ist. 5 Du sollst dich vor ihnen nicht niederwerfen[4] und ihnen nicht dienen. Denn ich, der HERR, dein Gott, bin ein eifersüchtiger Gott, der die Schuld der Väter heimsucht an den Kindern, an der dritten und vierten ⟨Generation⟩[5] von denen, die mich hassen, 6 der aber Gnade erweist an Tausenden[6], von denen, die mich lieben und meine Gebote halten. – 7 Du sollst den Namen des HERRN, deines Gottes, nicht zu Nichtigem[7] aussprechen, denn der HERR wird den nicht ungestraft lassen, der seinen Namen zu Nichtigem[8] ausspricht. 8 Denke an den Sabbattag, um ihn heilig zu halten. 9 Sechs Tage sollst du arbeiten und all deine Arbeit tun, 10 aber der siebte Tag ist Sabbat[9] für den HERRN, deinen Gott[10]. Du sollst ⟨an ihm⟩ keinerlei Arbeit tun, du und dein Sohn und deine Tochter, dein Sklave und deine Sklavin und dein Vieh und der Fremde bei dir, der innerhalb deiner Tore ⟨wohnt⟩. 11 Denn in sechs Tagen hat der HERR den Himmel und die Erde gemacht, das Meer und alles, was in ihnen ist, und er ruhte am siebten Tag; darum segnete der HERR den Sabbattag und heiligte ihn.";
        String bibeltext2 = "Ich bin der HERR, dein Gott, der ich dich aus dem Land Ägypten, aus dem Sklavenhaus, herausgeführt habe. 3 Du sollst[1] keine andern Götter haben neben mir[2]. – 4 Du sollst dir kein Götterbild[3] machen, auch keinerlei Abbild dessen, was oben im Himmel oder was unten auf der Erde oder was im Wasser unter der Erde ist. 5 Du sollst dich vor ihnen nicht niederwerfen[4] und ihnen nicht dienen. Denn ich, der HERR, dein Gott, bin ein eifersüchtiger Gott, der die Schuld der Väter heimsucht an den Kindern, an der dritten und vierten ⟨Generation⟩[5] von denen, die mich hassen, 6 der aber Gnade erweist an Tausenden[6], von denen, die mich lieben und meine Gebote halten. – 7 Du sollst den Namen des HERRN, deines Gottes, nicht zu Nichtigem[7] aussprechen, denn der HERR wird den nicht ungestraft lassen, der seinen Namen zu Nichtigem[8] ausspricht. 8 Denke an den Sabbattag, um ihn heilig zu halten. 9 Sechs Tage sollst du arbeiten und all deine Arbeit tun, 10 aber der siebte Tag ist Sabbat[9] für den HERRN, deinen Gott[10]. Du sollst ⟨an ihm⟩ keinerlei Arbeit tun, du und dein Sohn und deine Tochter, dein Sklave und deine Sklavin und dein Vieh und der Fremde bei dir, der innerhalb deiner Tore ⟨wohnt⟩. 11 Denn in sechs Tagen hat der HERR den Himmel und die Erde gemacht, das Meer und alles, was in ihnen ist, und er ruhte am siebten Tag; darum segnete der HERR den Sabbattag und heiligte ihn. 12 Ehre deinen Vater und deine Mutter, damit deine Tage lange währen in dem Land, das der HERR, dein Gott, dir gibt. – 13 Du sollst nicht töten. – 14 Du sollst nicht ehebrechen. – 15 Du sollst nicht stehlen. – 16 Du sollst gegen deinen Nächsten nicht als Lügenzeuge aussagen. – 17 Du sollst nicht das Haus deines Nächsten begehren. Du sollst nicht begehren die Frau deines Nächsten, noch seinen Knecht, noch seine Magd, weder sein Rind noch seinen Esel, noch irgendetwas, das deinem Nächsten ⟨gehört⟩.";
        
        String[] woerter1 = bibeltext1.split(" ");
        String[] woerter2 = bibeltext2.split(" ");
        double verhaeltnis = (double)woerter1.length / woerter2.length;
        System.out.println("Verhältnis: " + woerter1.length + "/" + woerter2.length + ": " + verhaeltnis);
        
        //for(int i=0; i< woerter.length; i++)
        //{
        //    System.out.println(woerter[i] + "|");
        //}
    }


}
