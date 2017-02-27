package spitter.data;

/**
 * Created by YanMing on 2017/2/27.
 */

import java.util.List;
import spitter.Spittle;

public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);

}
