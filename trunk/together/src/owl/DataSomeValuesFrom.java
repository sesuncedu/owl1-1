/* Generated by Together */

package owl;

public class DataSomeValuesFrom extends ClassExpression {
    /**
     * @directed
     * @supplierCardinality 1
     * @supplierRole dataRange
     */
    DataRange dataRange;
    /**
     * @directed
     * @associates <{DataPropertyExpression}>
     * @supplierCardinality 1 ..*
     * @supplierRole dataPropertyExpressions
     * @supplierQualifier { ordered, nonunique }
     */
    List dataPropertyExpressions;
}
