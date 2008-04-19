/* Generated by Together */

package owl;

import java.util.*;

public class SubObjectPropertyOf extends Axiom {
    /**
     * @directed
     * @associates <{ObjectPropertyExpression}>
     * @supplierCardinality 2 ..*
     * @supplierRole subObjectProperties
     * @supplierQualifier { ordered, nonunique }
     */
    List subObjectProperties;
    /**
     * @directed
     * @supplierCardinality 1
     * @supplierRole superObjectProperty
     */
    ObjectPropertyExpression superObjectProperty;
}
