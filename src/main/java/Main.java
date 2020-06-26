import api.TibiaApi;
import dao.SimpleStatsDAO;
import db.dao.SessionProvider;
import models.SimpleStats;
import models.Statistic;

import java.io.IOException;
import java.util.List;

public class Main {
    private static TibiaApi tibiaApi = new TibiaApi();

    public static void main (String[] args) throws IOException {


        String world = "damora";

        tibiaApi.getHighcoreStat(world);

//        try {
//            Thread.sleep(50000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
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
