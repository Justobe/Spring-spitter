package spitter.data;

/**
 * Created by YanMing on 2017/2/27.
 */

import spitter.Spitter;

public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}

