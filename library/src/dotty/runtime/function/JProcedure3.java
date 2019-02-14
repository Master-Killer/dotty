
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package dotty.runtime.function;

import scala.runtime.BoxedUnit;

@FunctionalInterface
public interface JProcedure3<T1, T2, T3> extends JFunction3<T1, T2, T3, BoxedUnit>, java.io.Serializable {
    default void $init$() {
    }

    void applyVoid(T1 t1, T2 t2, T3 t3);

    default BoxedUnit apply(T1 t1, T2 t2, T3 t3) {
        applyVoid(t1, t2, t3);
        return BoxedUnit.UNIT;
    }
}