import api.TibiaApi;

import org.hibernate.SessionFactory;
import java.io.IOException;

public class Main {

    private static SessionFactory factory;
    public static void main (String[] args) throws IOException, InterruptedException {

    TibiaApi tibiaApi = new TibiaApi();

        String world = "Damora";
        tibiaApi.getHighcoreStat(world);


//
//        SessionProvider sessionProvider = SessionProvider.INSTANCE;
//        SimpleStatsDAO dao = new SimpleStatsDAO(sessionProvider.getSession());
//
//
//
//
//
//        List<SimpleStats> dane = dao.getAll();
//        for (SimpleStats stats : dane) {
//            System.out.println(stats);
//        }
//        dao.close();
//        sessionProvider.closeFactory();
//


    }
}



